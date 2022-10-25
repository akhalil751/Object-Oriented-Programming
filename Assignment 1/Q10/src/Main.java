public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1122,20000);
        Account.setAnnualInterestRate(4.5);
        acc1.withdraw(2500);
        acc1.deposit(3000);
        System.out.println("Balance: $" + acc1.getBalance());
        System.out.println("Monthly Interest: $" + acc1.getMonthlyInterest());
        System.out.println("Date Created: " + acc1.getDateCreated());
    }
}