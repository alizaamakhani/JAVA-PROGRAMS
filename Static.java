class Static{
    static{
        System.out.println("STATIC CODE EXECUTED");
    }
    {
    System.out.println("INSTANCE BLOCK EXECUTED");
    }

        public static void main(String args[]){
            Static s = new Static();
        }
}