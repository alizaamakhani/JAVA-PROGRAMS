import java.util.*;
class ArrayList1{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();

        System.out.println("fruits name is:");
        //ADDING ELEMENTS....
        list.add("APPLE ");
        list.add("BANANA ");
        list.add("MANGO ");

        System.out.println(list);

        //select index
        System.out.println(list.get(2));

        //removing array

        list.remove("MANGO ");
        
        //updated array

        System.out.println(list);
    }
}