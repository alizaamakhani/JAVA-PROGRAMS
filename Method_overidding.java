class shape
{
void draw()
{
    System.out.println("can't say draw type..");
}
}
class square extends shape {
    void draw(){
        System.out.println("square shape");
    }
}

class Method_overidding{
    public static void main(String args[]){
        shape s = new square();
        s.draw();

    
}
}

