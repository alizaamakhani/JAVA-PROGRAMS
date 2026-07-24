class This{
This(){
    
    System.out.println("DEFAULT CONSTRUCTOR");
}    
This(int id){
    this();
    System.out.println("PARAMETRIZED CONSTRUCTOR");
}
}
class This1{
    public static void main(String args[]){
        This t = new This(10);
    }
}