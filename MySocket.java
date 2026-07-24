import java.net.*;
import java.io.*;
class MyServer{
    public static void main(String args[]){
        try{
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("waiting...");
            Socket s = ss.accept();
            System.out.println("client connected");
            DataInputStream d = new DataInputStream(s.getInputStream());
            String msg = d.readUTF();
            System.out.println("Client says: " + msg );
            ss.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}