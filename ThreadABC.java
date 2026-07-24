class ThreadA extends Thread{
    public void run(){
        for(int i = 0; i<=5;i++){
        System.out.println("From threadA with i=" + i*-1);
    }
    }
}
    class ThreadB extends Thread{
        public void run(){
            for(int j = 0;j<=5;j++){
                

         System.out.println("From Thread B with j= "+2* j);

            }
        }
    }
        class ThreadC extends Thread{
            public void run(){
                for(int k = 0;k<=5;k++){
                System.out.println("From thread C with k = " +  (2*k-1));

            }
        }
    }
class ThreadABC{
        public static void main(String args[]){
            ThreadA t = new ThreadA();
             ThreadB tb = new ThreadB();
              ThreadC tc = new ThreadC();
              t.start();
              tb.start();
              tc.start();
            
        }
        }  
    
