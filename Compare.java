import java.util.*;

class Student {
    int age;
    String name;
    int Rollno;
    Student(int age,String name,int Rollno){
        this.age=age;
        this.name=name;
        this.Rollno=Rollno;
    }
}
class Agecomparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){

        return s1.age - s2.age;
    }
    class Compare{
        public static void main(String args[]){
            ArrayList<Student> al = new ArrayList<>();
            
            al.add((new Student(19,"Aliza",101)));
            al.add((new Student(011,"aarohi",102)));
            al.add((new Student(22,"arman", 103)));
            Collections.sort (al , new Agecomparator());

        }
    }
}


