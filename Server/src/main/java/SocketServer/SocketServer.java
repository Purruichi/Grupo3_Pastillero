package SocketServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

import Common.Properties.properties;
import Common.Domain.Customer;
import Controler.*;
import Common.Domain.Message;

public class SocketServer extends Thread {
	public static int port = Integer.parseInt(properties.getInstance().getProperty("port"));

	protected Socket socket;

	private SocketServer(Socket socket) {
		this.socket = socket;
		//Configure connections
		System.out.println("New client connected from " + socket.getInetAddress().getHostAddress());
		start();
	}

        @Override
	public void run() {
            InputStream in = null;
            OutputStream out = null;
            try {
                in = socket.getInputStream();
                out = socket.getOutputStream();

                //first read the object that has been sent
                ObjectInputStream objectInputStream = new ObjectInputStream(in);
                Message mensajeIn = (Message)objectInputStream.readObject();
                //Object to return informations 
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
                Message mensajeOut = new Message();
                HashMap<String,Object> session = mensajeIn.getSession();
                
                switch (mensajeIn.getContext()) {

                    
                    case "/getUserMeds" -> {
                        ArrayList<HashMap<String, String>> userMeds = MedicineControler.getUserMeds(String.valueOf(session.get("user_id")));
                        mensajeOut.setContext("/getUserMedsResponse");
                        session = new HashMap<>();
                        session.put("userMeds", userMeds);
                        mensajeOut.setSession(session);
                        objectOutputStream.writeObject(mensajeOut);
                    }
                    
                    case "/checkLogIn" -> {
                        HashMap<String, String> userData = CustomerControler.checkLogIn((String)session.get("username"), (String)session.get("password"));
                        mensajeOut.setContext("/checkLogInResponse");
                        session = new HashMap<>();
                        session.put("check", true);
                        session.put("userData", userData);
                        mensajeOut.setSession(session);
                        objectOutputStream.writeObject(mensajeOut);
                    }
                        
                    case "/getMedicineName" -> {
                        String name = MedicineControler.getMedicineName((int)session.get("id"));
                        mensajeOut.setContext("/getMedicineNameResponse");
                        session = new HashMap<>();
                        session.put("name", name);
                        mensajeOut.setSession(session);
                        objectOutputStream.writeObject(mensajeOut);
                    }
                        
                    case "/signUpUser" -> {
                        boolean check = CustomerControler.signUpUser((String[])session.get("values"));
                        mensajeOut.setContext("/signUpUserResponse");
                        session = new HashMap<>();
                        session.put("check", check);
                        mensajeOut.setSession(session);
                        objectOutputStream.writeObject(mensajeOut);
                    }
                    
                    case "/addUserMed" -> {
                        String[] values = (String[])session.get("values");
                        values[1] = MedicineControler.getMedicineId(values[1]);
                        boolean check = MedicineControler.addUserMed(values);
                        session = new HashMap<>();
                        session.put("check", check);
                        mensajeOut.setContext("/addUserMedResponse");
                        objectOutputStream.writeObject(mensajeOut);
                    }
                    
                    case "/deleteUserMed" -> {
                        String med_id = MedicineControler.getMedicineId((String)session.get("med_name"));
                        boolean check = MedicineControler.deleteUserMed(new String[] {"user_id", "medicine_id"}, new String[] {(String)session.get("user_id"), med_id});
                        session = new HashMap<>();
                        session.put("check", check);
                        mensajeOut.setContext("/deleteUserMedResponse");
                        objectOutputStream.writeObject(mensajeOut);
                    }
                    
                    case "/deleteUser" -> {
                        boolean check = CustomerControler.deleteUser((String)session.get("id"));
                        session = new HashMap<>();
                        session.put("check", check);
                        mensajeOut.setContext("/deleteUserResponse");
                        objectOutputStream.writeObject(mensajeOut);
                    }

                    default -> System.out.println("\nParámetro no encontrado");
                }

            } catch (IOException ex) {
                    System.out.println("Unable to get streams from client");
            } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            } finally {
                    try {
                            in.close();
                            out.close();
                            socket.close();
                    } catch (IOException ex) {
                            ex.printStackTrace();
                    }
            }
	}

	public static void main(String[] args) {
		System.out.println("SocketServer Example - Listening port "+port);
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
			while (true) {
				/**
				 * create a new {@link SocketServer} object for each connection
				 * this will allow multiple client connections
				 */
				new SocketServer(server.accept());
			}
		} catch (IOException ex) {
			System.out.println("Unable to start server.");
		} finally {
			try {
				if (server != null)
					server.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}