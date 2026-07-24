class This{
    int id;
    String name;
    double marks;
    This(int id, String name, double marks){
        this.id   = id;
        this.name = name;
        this.marks= marks;
    }

        void display(){
            System.out.println(id+" "+name+" "+marks);
        }

            public static void main(String args[]){
                This t = new This(1003, "aliza", 95.2);
                t.display();
               

    
}
    }


