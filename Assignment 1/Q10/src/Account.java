import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private Date dateCreated;
    //start of accessor and mutators
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    //start of constructors
    public Account() {
        setId(0);
        setBalance(0);
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        setId(id);
        setBalance(balance);
        this.dateCreated = new Date();
    }
    //end of constructors
    public static double getMonthlyInterestRate(){
        return getAnnualInterestRate()/12;
    }
    public double getMonthlyInterest(){
        return getBalance() * getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        setBalance(getBalance() - amount);
    }
    public void deposit(double amount){
        setBalance(getBalance() + amount);
    }
}
