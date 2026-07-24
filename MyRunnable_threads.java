class MyRunnable_threads implements Runnable{
    public void run(){
        System.out.println("this code is running");


    }
    public static void main(String args[]){
        MyRunnable_threads r = new MyRunnable_threads();// object created
        Thread t = new Thread(r);//thread create
        t.start();
    } //extend thread -> direct start 
    //implements Runnable -> pass object + start

}