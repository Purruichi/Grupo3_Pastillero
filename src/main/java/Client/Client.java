package Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;



import properties.properties;
import Domain.*;
import Message.Message;

public class Client {
	private String host;
	private int port;

	public Client(String host, int port) {
		this.host=host;
		this.port=port;
	}
	public Client() {
		this.host = properties.getInstance().getProperty("host");
		this.port = Integer.parseInt(properties.getInstance().getProperty("port"));
	}
	public HashMap<String, Object> sentMessage(String Context, HashMap<String, Object> session) {

		System.out.println("Host: " + host + " port: " + port);
		
		Message mensajeEnvio=new Message();
		Message mensajeVuelta=new Message();
		mensajeEnvio.setContext(Context);
		mensajeEnvio.setSession(session);
		this.sent(mensajeEnvio,mensajeVuelta);
		
		
		switch (mensajeVuelta.getContext()) {
                        
                    case "/checkLogInResponse" -> session = mensajeVuelta.getSession();
                        
                    case "/getUserMedsResponse" -> session = mensajeVuelta.getSession();
                    
                    case "/getMedicineNameResponse" -> session = mensajeVuelta.getSession();
                    
                    case "/signUpUserResponse" -> session = mensajeVuelta.getSession();
                        
                    default -> System.out.println("\nError a la vuelta");
		
		}
            	return session;
	}
	


	public void sent(Message messageOut, Message messageIn) {
            try {

                System.out.println("Connecting to host " + host + " on port " + port + ".");

                Socket echoSocket = null;
                OutputStream out = null;
                InputStream in = null;

                try {
                    echoSocket = new Socket(host, port);
                    in = echoSocket.getInputStream();
                    out = echoSocket.getOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);

                    //Create the objetct to send
                    objectOutputStream.writeObject(messageOut);

                    // create a DataInputStream so we can read data from it.
                    ObjectInputStream objectInputStream = new ObjectInputStream(in);
                    Message msg=(Message)objectInputStream.readObject();
                    messageIn.setContext(msg.getContext());
                    messageIn.setSession(msg.getSession());

                } catch (UnknownHostException e) {
                        System.err.println("Unknown host: " + host);
                        System.exit(1);
                } catch (IOException e) {
                        System.err.println("Unable to get streams from server");
                        System.exit(1);
                }		

                /** Closing all the resources */
                out.close();
                in.close();			
                echoSocket.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
	}
}