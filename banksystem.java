import java.util.Scanner;

abstract class Bank{
    int balance;
    void display(){};
}

class Transaction extends Bank{
    
    void display(){
        System.out.println("Available balance is: "+balance);
    }
    void withdraw(int amount){
        if(amount > balance || (balance-amount)<1000){
            System.out.println("Not enough balance");
        }
        else{
            System.out.println("Updated Balance is: "+(balance-amount));
        }
    }
    void deposit(int amount){
        System.out.println("Updated Balance: "+(balance+amount));
    }
}

public class banksystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt,opr;
        System.out.println("Select Operation: \n");
    System.out.println("1.Display Balance\n2.Withdraw\n3.Deposit");
    opr = sc.nextInt();
    Transaction b = new Transaction();
    b.balance = 100000;

    if(opr == 1){
        b.display();
    }
    else if(opr==2){
        System.out.println("Enter amount: ");
        amt = sc.nextInt();
        b.withdraw(amt);
    }
    else if(opr == 3){
        System.out.println("Enter amount: ");
        amt = sc.nextInt();
        b.deposit(amt);
    }
    sc.close();
    }
    
}