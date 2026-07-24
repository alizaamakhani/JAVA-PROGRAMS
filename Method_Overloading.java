class Method_Overloading{
    void add(){
        int a = 10, b = 20, c; 
        c = a + b;
        System.out.println(c);
    }
    void add(int a , int b){
        int c = a + b;
         System.out.println(c);

    }
    void add(int a , double b)
{
    double c;
    c = a + b;
     System.out.println(c);
}
public static void main(String args[]){
    Method_Overloading m = new Method_Overloading();
    m.add();
    m.add(100 , 200);
    m.add(100 , 20.52);

}}