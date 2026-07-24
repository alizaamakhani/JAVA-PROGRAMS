import java.net.*;
import java.io.*;
class Myclient{
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost", 5000);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("HELLO SERVER");
            dos.flush();
            dos.close();
            s.close();


        }
    catch(Exception e){
        System.out.println(e);

    }
}
}