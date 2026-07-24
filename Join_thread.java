class thread extends Thread{
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println("CHILD THREAD");
        }
    }
}
class Join_thread{
    public static void main(String args[]) throws Exception{
        thread t = new thread();
        
            t.start();
            t.join(); 
            for(int i =0; i<=5;i++){
                
            System.out.println("PARENT THREAD"+i);


        }
    }
}