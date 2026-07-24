class A{
    int id;
    String name;
    String address;
    double number;

    A(int i, double no){
        id = i;
        name = "aliza";
        address = "khoja bahadur bhai and company";
        number = no;
    }

    A(int i, String n, String a, double no){
        id = i;
        name = n;
        address = a;
        number = no;
    }
    A(String n, String a){
        id = 1003;
        name = n;
        address = a;
        
    }
    A(int i, String n){
        id = i;
        name = n;
        
    }
    void show(){
        System.out.println(id+" "+ name+" "+address+" "+number);
    }
}
class Parametrized_constructor{
    public static void main(String args[]){
        A s1 = new A(1003 , 98353);
        A s2 = new A(1004 , "aliza", "khoja bahadurbhai and company", 97787 );
        A s3 = new A("Diya", "bhanvad");
        A s4 = new A(1006 , "angel")
        ;
        s1.show();
        s2.show();
        s3.show();
        s4.show();
    }
}