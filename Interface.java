interface Animal{
    void Sound();
}
class Dog implements Animal{
    public void Sound(){
        System.out.println("BARKS!!!");
    }
}
      class Interface{
        public static void main(String args[]){
        Animal a = new Dog();
        a.Sound();


        }
      }
    


