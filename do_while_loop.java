import java.util.Scanner;

public class do_while_loop{
    public static void main(String args[]){
        int n;
        System.out.print("Enter the value of n: ");
        Scanner v = new Scanner(System.in);
        n = v.nextInt();

        do{
            System.out.println(n);
            n++;
          

        }

       
        while(n<=10);
    }
}
