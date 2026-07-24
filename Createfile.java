import java.io.*;
class Createfile{
    public static void main(String args[]){
    File f = new File("C:\\Users\\91982\\OneDrive\\Desktop\\001");
    try
    {
        if(f.createNewFile())
            {
              System.out.println("FILE SUCCESSFULLY CREATED!!!");
    }
    else{
        System.out.println("FILE ALREADY EXISTS...");
    }
}

    catch(IOException i){
     System.out.println("Exception Handled!!");

    }
}
}