import java.util.Scanner;
public class add2num{
    public static void main(String args[]){
        double a,b,c;
        System.out.println("Enter any two numbers");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();

        c = a+b;
        System.out.println("Sum of 2 numbers is: " + c);



    }
}