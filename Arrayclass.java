import java.util.Scanner;
import java.util.Arrays;
public class Arrayclass{
    public static void main(String args[]){
        int a[][] = new int[5][5];
System.out.println("enter elements");
Scanner s = new Scanner(System.in);
for(int i=0;i<5;i++){
    for(int j=0;j<5;j++){

    
    a[i][j] = s.nextInt();  
}
}

System.out.println("Matrix array element is: ");
for(int i=0;i<5;i++){
    for(int j=0;j<5;j++){

    
    System.out.println(a[i][j]+ " ");
}
System.out.println();


}
}
}

