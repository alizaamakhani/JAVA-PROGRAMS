import java.io.*;
class Write_file{
    public static void main(String args[]){
        try{
            FileWriter f = new FileWriter("C:\\Users\\91982\\OneDrive\\Desktop\\001");
           try
           {
            f.write("java programming is best language");
           }
           finally
           {
            f.close();
           }
           System.out.println("successfully wrote in file");
        }
        catch(IOException i){
            System.out.println(i);

        }
    }
}