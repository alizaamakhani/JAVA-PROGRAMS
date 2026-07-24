import java.util.*;
class Hashset1 {
    public static void main(String args[]){
        HashSet<String> names = new HashSet<>();

        names.add("Aliza");
        names.add("Aarohi");
        names.add("Arman");
        names.add("Arman");

        System.out.println(names);

        names.remove("Arman");
        System.out.println(names);

        System.out.println(names.contains("Arman"));
    }
}