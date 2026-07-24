class Create_thread_extends extends Thread{
    public void run(){
 System.out.println("this code is running.....");


    }
    public static void main(String args[]){
        Create_thread_extends t = new Create_thread_extends();//creates thread
        t.start();//thread starts

    }

    }
