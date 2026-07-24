abstract class Animal
{
    void legs(){
        System.out.println("all animals have 4 legs");
    }
    abstract void sound();
    abstract void eat();
    
}
class Dog extends Animal
{
    void sound(){
        System.out.println("barks");

    }
    void eat(){
        System.out.println("Dog eats meat");

    }


}
class Cow extends Animal{
    void sound(){
        System.out.println("mooowww!!");
    }
    void eat(){
        System.out.println("cow eats grass");
    }

}
class absclass{
    public static void main(String args[]){
       Animal a = new Dog();
       Animal b = new Cow();
       a.sound();
       b.sound();
       a.eat();
       b.eat();
    }
}