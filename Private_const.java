class Private_const{
    int id;
    String name;
    double marks;
    //private const has private keyword in constructor name....
    private Private_const(){
        id = 1003;
        name = "aliza";
        marks = 92.5;
        System.out.println(id+" "+name+" "+marks);
    }
    // this is private constructor so you can access main class in class A only not in other....
    public static void main(String args[]){
        Private_const r = new Private_const();
    }
}