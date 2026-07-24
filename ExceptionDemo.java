class ExceptionDemo{
    public static void main(String args[]){
        int a =10, b = 0 , c;
        try{
        c = a/b;
        System.out.println(c);
        } 
        catch(java.lang.Exception e)
        {
              System.out.println("cannot divide by zero");

        }
        System.out.println("main method ended");

    }
}