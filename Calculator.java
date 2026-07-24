import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        int a, b, c , ch;
         System.out.println("enter value of a & b= ");
         Scanner n1 = new Scanner(System.in);
         a = n1.nextInt();
         b = n1.nextInt();
         System.out.println("enter your choice= ");
         ch = n1.nextInt();
         
        switch(ch){
            case 1: c = a + b;
            System.out.println("Addition= " + c);
            break;

            case 2: c = a - b;
            System.out.println("Substraction= " + c);
            break;

            case 3: c = a * b;
            System.out.println("Multiplication= " + c);
            break;

            case 4: c = a / b;
            System.out.println("division= " + c);
            break;

            case 5: c = a % b;
            System.out.println("Modulo = " + c);
            break;
        default:
             System.out.println("INVALID CHOICE!!!");
        
        
        
        


        }


    }
}