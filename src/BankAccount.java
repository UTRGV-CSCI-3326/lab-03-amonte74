public class BankAccount {
    public static void main(String[] args) {
        //Starting balance
        double balance = 2175.37;

        //Bob's transactions
        balance -= 302.50;   // Withdrew $302.50 //1872.87
        balance += 50.03;    // Deposited $50.03 //1922.90
        balance -= balance / 2;  // Withdrew half of his current balance //961.45
        balance += 20.00;    // Deposited $20.00 //981.45
        balance -= 1.00;     // Withdrew $1.00 //980.45
        balance *= 2;        // Deposited his paycheck that doubled his current balance //1960.90
        balance += 1.00;     // Deposited $1.00 //1961.90

        //Bob's new balance
        System.out.println("Bob's new balance after all transactions: $" + balance);
    }
}
