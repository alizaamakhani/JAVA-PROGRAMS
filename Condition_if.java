import java.util.Scanner;
 public class Condition_if{
     
    public static void main(String args[]){
        int pwd;
        System.out.println("enter your password:= ");
        Scanner obj = new Scanner(System.in);
        pwd = obj.nextInt();
        if(pwd==7809){
            System.out.println("NAME : ALIZA , " + "AGE : 19 , "+ "ADDRESS : BHANVAD.");
        }else{
            System.out.println("sorry wrong password");
        }
        
        

    }

    
 }