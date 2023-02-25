public class SavingsAccount {
  
  int balance;
  int totalDeposits = 0;
  int totalWithdrawals = 0;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }

  public void deposit(int amountToDeposit) {
    totalDeposits += 1;
    balance += amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
  }

  public int withdraw(int amountToWithdraw) {
    totalWithdrawals += 1;
    balance -= amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }

  public String toString() {
    return "Summary: You have made " + totalWithdrawals + " withdrawal(s) and " + totalDeposits + " deposit(s). Your current balance is " + balance + ".";
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    savings.checkBalance();
    //Withdrawing:
    savings.withdraw(300);
    //Check balance:
    savings.checkBalance();
    //Deposit:
    savings.deposit(600);
    //Check balance:
    savings.checkBalance();
    //Deposit:
    savings.deposit(600);
    //Check balance:
    savings.checkBalance();
    //Print summary 
    System.out.println(savings);
    
  }       
}