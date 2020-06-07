
package trainticket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Naimul
 */
public class SocServer {
    public static void main(String[] args)throws Exception
    {
        System.out.println("SERVER IS STARTED");
        ServerSocket ss=new ServerSocket(9999);
        System.out.println("SERVER IS WAITING FOR CLIENT REQUEST");
        Socket s = ss.accept();
        System.out.println("CLIENT IS ACCEPTED");
        
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
    
       String str=br.readLine();
        System.out.println("Client Data: "+str);
    
    }
}
