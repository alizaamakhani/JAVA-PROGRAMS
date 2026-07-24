class Sleep_thread extends Thread{
    public void run(){
        System.out.println("THREAD STARTS");
        try{
            for(int i = 0;i<=5;i++){
            System.out.println(i);
        
        
            Thread.sleep(4000);
            }   
    }
    catch(Exception e)
    {

        System.out.println(e);
        
    }
}
    public static void main(String args[]){
        Sleep_thread t = new Sleep_thread();
        t.start();
    

}
}