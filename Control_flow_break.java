import java.util.Scanner;
public class Control_flow_break{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the vakue of n: ");
        Scanner v = new Scanner(System.in);
        n = v.nextInt();

        for(int i=0;i<n;i++){
            if(i==500){
                continue;
            }
            System.out.println(i);
        }
    }
}