/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Email;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Random;

/**
 *
 * @author purru
 */
public class EmailSender {
    
    final static private String MICORREO = "mypillsfp@gmail.com";
    final static private String MIPASSWORD = "kfqulbdlzxppemzy";
    
    public static String sendEmail(String user_email){
        try {
            Session session = Session.getInstance(EmailProperties.getInstance(), new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(MICORREO, MIPASSWORD);
                }
            });
            
            String codigo = generarCodigo();
            
            Message mensaje = new MimeMessage(session);
            mensaje.setFrom(new InternetAddress(MICORREO));
            mensaje.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user_email));
            mensaje.setSubject("Codigo de verificacion");
            mensaje.setText("Tu codigo de verificacion es: " + codigo);
            
            Transport.send(mensaje);
            
            System.out.println("Correo enviado con éxito. Código: " + codigo);
            
            return codigo;
        } catch (MessagingException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private static String generarCodigo() {
        Random random = new Random();
        int codigo = 100000 + random.nextInt(900000); // Generar número entre 100000 y 999999
        return String.valueOf(codigo);
    }
    
}
