class Yield_thread1 extends Thread{
    public void run(){
        for(int i = 0 ; i<=5;i++){
            System.out.println("CHILD THREAD");
            Thread.yield();
        }
    }

}
public class Yield_thread{
    public static void main(String args[]){
        Yield_thread1 t = new Yield_thread1();
        t.start();
        for(int i = 0;i<=3;i++){

        
        System.out.println("MAIN THREAD");
        }


    }

}