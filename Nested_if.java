import java.util.Scanner;
public class Nested_if{
    public static void main(String args[]){
        int a , b , c;
        System.out.println("enter number a: ");
        Scanner num1 = new Scanner(System.in);
        a = num1.nextInt();
        System.out.println("enter number b:");
          Scanner num2 = new Scanner(System.in);
          b = num2.nextInt();
        System.out.println("enetr number c: ");
          Scanner num3 = new Scanner(System.in);
          c = num3.nextInt();

          if(a>b){

           if(a>c){
            System.out.println("maximum number is: " + a);

          }else {
            System.out.println("maximum number is: "+ c);

          }
        }
          
          else {

    if(b>a){

    }if (b>c) {
        System.out.println("maximum number is: "+ b);
        
    }else{
        System.out.println("maximum number is: "+a);
    }
}
    }
}
