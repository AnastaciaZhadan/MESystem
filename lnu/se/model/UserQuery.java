package lnu.se.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.lnu.Interface.UserStatus;
import com.lnu.Model.DbConnection;

import lnu.se.Interface.IUser;


public class UserQuery extends DbConnection implements IUser<User> {
	User user;
	
	public UserQuery() {
		user=new User();
	}
	@Override
	public boolean login(String username, String password) {
		String sql="select * from user where username='"+username+"' and password='"+password+"'";
		  ResultSet rs=DbConnection.view(sql); 
		  boolean isLogin=false;
		  try {
				if(rs.next()==true) {
					update_status_when_user_login(username);
					isLogin=true;
				  }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 
		  return isLogin;
	}
	/** Avoid Return Values that Demand Exceptional Processing(ResultSet raised Exception)
	 * (This API might not be appropriate to be here because it not general)
	 * This API used to find a user by a criteria which is user name and returns the matching record.
	 * @param username- a criteria to find user by name.
	 * @return ResultSet-returns a user record that matches the user name provided server.
	 */
	
	public void findUser(String username) {
		String sql="select * from user where username='"+username+"'";
		 ResultSet rs=DbConnection.view(sql);
		 try {
				while (rs.next())
						System.out.println(" name-> " + rs.getString(2) + ",username->  " + rs.getString(3) +",status->  "+ rs.getString(5)  + " ");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 
	}
	
	public void deleteUser(String username) {
		  String sql="delete from user where username='"+username+"'";
		  int result=DbConnection.delete(sql);
		  if(result==1) 
			  System.out.println("User is  deleted");
		  else
			  System.out.println("User is not deleted"); 
	  }
	@Override
	public boolean logout() {
	
		return false;
	}

	@Override
	public void close() {
	
	}
	public void findAllUsers() {
		  String sql="select * from user";
		  ResultSet rs=DbConnection.view(sql);
		  try {
			while (rs.next())
					System.out.println(" name-> " + rs.getString(2) + ",username->  " + rs.getString(3) +",status->  "+ rs.getString(5)  + " ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	  }
	public  void updateUser(String sql ) {
		int result=DbConnection.update(sql);
		  if(result==1) 
			  System.out.println("User is  updated");
		  else
			  System.out.println("User is not updated"); 
	  }
	private void update_status_when_user_login(String username) {
		user.setStatus(UserStatus.ONLINE);	  
		String sql="update user set status ='"+user.getStatus()+"' where username='"+username +"'";
		updateUser(sql);
	}
	@Override
	public boolean signup(String name, String username, String password, String status) {
		String sql="INSERT INTO user(name,username,password,status) values('" + name+"','" + username +"','" + password+ "','" + status+ "')";
		  boolean isSignup=DbConnection.insert(sql);
		  if(isSignup==true) {
			  user.setStatus(UserStatus.NEW);
			  System.out.println("user is inserted");
		  }
		  System.out.println(user.getStatus());
		  return isSignup;
	}
	@Override
	public boolean createChatGroup(String name, List<User> users) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
