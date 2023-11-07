import java.util.Scanner;

public class BankAccount {

    public int numAccount;
    protected String type;
    private float balance;
    private boolean status;

    public BankAccount(float balance, boolean status) {
        this.balance = balance;
        this.status = status;
    }

    public int getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String openAccount() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Savings Account or Current Account");
        System.out.println("Savings Account: earn 150 dollars and Pay monthly = 20");
        System.out.println("Current Account: earn 50 dollars and Pay monthly = 12");
        System.out.print("What type of account do you want to open? [sa/ca] ");

        String typeAccount = teclado.nextLine();

        while (!typeAccount.equalsIgnoreCase("sa") && !typeAccount.equalsIgnoreCase("ca")) {
            System.out.print("Invalid option. Please choose [sa/ca]: ");
            typeAccount = teclado.nextLine();
        }

        if (typeAccount.equalsIgnoreCase("sa")) {
            this.setBalance(150);
        } else {
            this.setBalance(50);
        }

        this.setStatus(true);

        return typeAccount;
    }

    public void closeAccount() {
        if (this.balance < 0) {
            System.out.println("Error: Unable to close account. Outstanding balance.");
        } else {
            this.setStatus(false);
            System.out.println("Account closed successfully.");
        }
    }

    public void deposit() {
        if (this.getStatus()) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("How much will your deposit be? ");
            float depositAmount = teclado.nextFloat();

            if (depositAmount > 0) {
                this.setBalance(getBalance() + depositAmount);
                System.out.println("Deposit successful. Current balance: " + getBalance());
            } else {
                System.out.println("Invalid deposit amount. Please enter a positive value.");
            }
        } else {
            System.out.println("Error: Account must be opened before making a deposit.");
        }
    }

    public void withdraw() {
        if (this.getStatus() && this.balance > 0) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("What is the value of your withdrawal? ");
            float withdraw = teclado.nextFloat();

            if (withdraw > 0 && withdraw <= getBalance()) {
                this.setBalance(getBalance() - withdraw);
                System.out.println("Withdrawal successful. Current balance: " + getBalance());
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
            }
        } else {
            System.out.println("Error: Account must be opened and have sufficient funds to make a withdrawal.");
        }
    }

    public boolean payMonthly(String typeAccount) {
        if (!typeAccount.equalsIgnoreCase("sa")) {
            this.setBalance(getBalance() - 20);
        } else {
            this.setBalance(getBalance() - 12);
        }

        return getBalance() < 0;
    }
}