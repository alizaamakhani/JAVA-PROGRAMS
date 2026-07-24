import java.util.Scanner;
public class Condition_elseif{
    public static void main(String args[]){
        int marks;
        System.out.println("enter marks:");
        Scanner m = new Scanner(System.in);
        marks = m.nextInt();

        if(marks>=60 && marks<=100){
            System.out.println("A+ grade");
        }else if(marks>=45 && marks<=60){
            System.out.println("A grade");
        }else if(marks>=30 && marks<=45){
            System.out.println("B grade");
        }else if(marks>=20 && marks<=30){
            System.out.println("C grade");
        }else if(marks<20 && marks>=0){
            System.out.println("FAIL!!");
        }
            
        }
    }
