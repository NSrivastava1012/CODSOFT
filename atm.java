import java.util.*;
//Super class ATM 
class atm {
    double balance;
    //Function to withdraw a certain amount
    void withdraw(double amount){
        //Checking if the entered amount can be withdrawn or not 
        if(balance<amount)
        System.out.println("Withdrawal failed");
        else{
            System.out.println("Withdrawal successful");
            balance=balance-amount;//Updating the balance
        }
    }
    //Function to deposit a certain amount 
    void deposit(double amount){
        System.out.println("Deposit successful");
        balance=balance+amount;//Updating the balance
    }
    //Function to get the final account balance
    void checkBalance(){
        System.out.println("The account balance = "+balance);
    }
}
//Subclass Bank Account inheriting the Super class ATM
class bankAccount extends atm{
    //Input the current account balance of the user
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the current account balance");
        balance=sc.nextDouble();
    }
}
class Test{
    public static void main(String args[]){
        bankAccount obj=new bankAccount();//Creating object of the subclass Bank Account
        //Calling of functions
        obj.input();
        obj.withdraw(100000.0);
        obj.deposit(300000.0);
        obj.checkBalance();
    }
}
