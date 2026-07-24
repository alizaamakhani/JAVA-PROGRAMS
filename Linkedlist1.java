import java.util.*;
class Linkedlist1{
    public static void main(String args[]){
        LinkedList<String> names = new LinkedList<>();
        System.out.println("NAMES ARE= ");
        names.add("ALIZA");
        names.add("AAROHI");
        names.add("ARMAN");
        System.out.println(names);

        names.addFirst("START");
        names.addLast("END");

        System.out.println(names);

        names.remove("ARMAN");

        System.out.println(names);
        System.out.println("FIRST NAME IS: "+ names.get(1));
       

    }
}