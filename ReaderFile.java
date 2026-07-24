import java.io.*;
class ReaderFile{
    public static void main(String args[]){

    try
{
FileReader r = new FileReader(" C:\\Users\\91982\\OneDrive\\Desktop\\001");
try{
    int i;

    while((i=r.read())!=-1)
        {
        System.out.println((char)i);
    }
}
finally{
    r.close();

}
System.out.println("File successfully reads!!");


}
catch(IOException i){
System.out.println("EXCEPTION HANDLED!");
}
}
}