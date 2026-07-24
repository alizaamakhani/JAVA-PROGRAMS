import java.util.Scanner;

public class While_loop{
    public static void main(String args[]){
        int n;
        System.out.print("Enter the value of n: ");
        Scanner v = new Scanner(System.in);
        n = v.nextInt();

        int i = 0;
        while(i<n){
            System.out.println(i);
            i++;
        }
    }
}