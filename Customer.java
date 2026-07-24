import java.util.Scanner;
class Encapsulation{
    private double balance = 5000;
    private int pwd;
     
    public void Deposite(double money){
        System.out.println("enter your password:");
        Scanner p = new Scanner(System.in);
        p.nextInt();
        if(pwd==7809){
            balance = balance + money;
            System.out.println("Deposited money"+ money);
             System.out.println("Total balance"+ balance);
            
            
        }else{
            System.out.println("INCORRECT PASSWORD");
        }
    }

}
class Customer{
    public static void main(String args[]){
        Encapsulation e = new Encapsulation();
        int ch;
        System.out.println("1. Deposite:");
        System.out.println("2. widthdraw:");
        System.out.println("3. check balance:");
        System.out.println("enter your choice:");
        Scanner s2 = new Scanner(System.in);
        s2.nextInt();
        s2.deposite();


    }
}