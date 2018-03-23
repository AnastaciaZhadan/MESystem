package lnu.se.Interface;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;



/**
* A generic server <code>IServer<T> </code>a generic class that enables clients to do taskes
* like (connecting to the server, sending message)  
* @author Eyuel Belay
* @version 1.0
* @since   2018-03-22 
*/
public interface IServer<T> {

	/**
	 * Server allows users(clients) to be registered so as to send a message.
	 * @param host-host address of a smart phone/computer. {Example: "127.0.0.1" or "localhost"}
	 * @param port-port number of a smart phone/computer. It's value:1-65535  
	 * port number: 1-1023 usually reserved for administrative purpose.
	 * @return true if client connect to the server, or false otherwise.
	 * @throws IOException- client raise this exception if error occur due to reading and writing data from different sources.
	 * @throws InterruptedException-client raise this exception if connection is interrupted.
	 */
	  public boolean connect(String host, int port) throws IOException , InterruptedException;
		
	  
	/**
	 * This method close the server connection.
	 * @return true if connection is closed,or false otherwise.
	 */
	  public boolean close();
}
