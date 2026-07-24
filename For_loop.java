import java.util.Scanner;
public class For_loop{
    public static void main(String[] args){
        int n;
        System.out.println("Enter value of n: ");
        Scanner v = new Scanner(System.in);
        n = v.nextInt();


        for(int i=1;i<=n;i++){
            System.out.print(i);

        }
    }
}