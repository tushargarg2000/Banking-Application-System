public class LotakBank implements RBI {

    private String accountHoldersName;

    private String password;

    public static double rateOfInterest = 7.5;

    private int balance;

    //Alt + Insert is a shortcut to generate getters and setters
    //constructors


    public LotakBank(String accountHoldersName, String password,int balance) {
        this.accountHoldersName = accountHoldersName;
        this.password = password;
        this.balance = balance;
    }

    public String addMoney(int money, String password) {

        if(password.equals(this.password)){
            balance = balance + money;
            return "Money apke khaate mein aagyi hai, apna sapna money money poora hua, new Balance is "+balance;
        }
        else
            return "durbhagya se password galat hai";

    }

    public String withdrawMoney(int money, String password) {

        if(password.equals(this.password)){
                balance = balance - money;
                return "Money withdrawn successfully, kul jama-dhanRashi "+balance;
            }
            else{
                return "ii wrong password hui ";
            }
    }

    public int checkBalance(String password) {
        if(password.equals(this.password)){
            return balance;
        }
        else
            return -1;

    }

    public double calculateInterest(int years) {
        double totalInterest = (balance*LotakBank.rateOfInterest*years)/100;
        return totalInterest;
    }
}
