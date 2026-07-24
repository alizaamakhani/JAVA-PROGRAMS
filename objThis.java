class A{
    void show(A obj){
        System.out.println("OBJECT CALLED");

    }

    void display(){
        show(this);
    }
}

class objThis{
    public static void main(String args[]){
     A t = new A();
     t.display();

    }
}
