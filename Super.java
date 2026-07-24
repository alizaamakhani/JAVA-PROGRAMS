class Parent{
    int a = 100;
    
void show(){
    System.out.println("THIS IS A PARENT CLASS");
}

    }

//if we want value of parent class then we should add super keyword in child class.....
class Child extends Parent{
    int a = 200; 
    void display(){
        super.show();
            System.out.println(super.a);
        }
    


}
class Super{
    public static void main(String args[]){
        Child c = new Child();
        c.display();
    }

}
