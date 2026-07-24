import java.util.*;
class Studentscompare1 implements Comparable<Studentscompare1>{
    int rollno;
    String name;
    int age;

    Studentscompare1(int rollno,String name,int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;


    }
    public int compareTo(Studentscompare1 s){
        if(age == s.age)
            return 0;
        
        if(age>s.age)
            return 1;
        
        else
            return -1;
        
    }


}

public class Studentscompare{
    public static void main(String args[]){
        ArrayList<Studentscompare1> list = new ArrayList<>();
        list.add(new Studentscompare1(101, "aliza" ,19));
        list.add(new Studentscompare1(102, "aarohi" ,11));
        list.add(new Studentscompare1(103, "arman" ,22));
        Collections.sort(list);
        for(Studentscompare1 s : list){
                    System.out.println(s.rollno + " " + s.name + " " + s.age);
    }

    }
}