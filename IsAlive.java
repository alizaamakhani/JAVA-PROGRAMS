class main extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
}
public class IsAlive{
    public static void main(String args[]){
        main t = new main();
        System.out.println(t.isAlive());

        t.start();

         System.out.println(t.isAlive());
    }
}