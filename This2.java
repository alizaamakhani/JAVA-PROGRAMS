class This{
    
        void show(){
            System.out.println("HELLO");
        
    }
    void display(){
        this.show();

        
    }
}

class This2{
    public static void main(String args[]){
        This t = new This();
        t.display();
    }
}