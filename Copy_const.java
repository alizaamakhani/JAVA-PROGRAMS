class  A{
    int id;
    String name;
    int marks;
    boolean passed;
    A(){
id = 1003;
name = "aliza";
marks = 95;
passed = true;
System.out.println(id+" "+name+" "+marks+" "+passed);
    }
    //copy of A class that's why A ref....
    A(A ref){
        id=ref.id;
        name=ref.name;
        marks=ref.marks;
        passed=ref.passed;
        System.out.println(id+" "+name+" "+marks+" "+passed);
    }
}
class Copy_const{
    public static void main(String args[]){
        A r = new A();
        A r2 = new A(r);
    }
}