class A{
    int a;
    String b;
    boolean c;
    A()
    {

        a = 1000; b = "aliza" ; c = true;

    }
    void Disp()
    {

        System.out.print(a+" " + b + " "+ c);
        
    }
}

class B_Constructor{
    public static void main(String args[]){

    
    A r = new A();
    r.Disp();
}
}