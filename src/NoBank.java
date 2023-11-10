public class NoBank implements RBI{


    private String userName;

    private Integer accountNo;

    private String password;

    private int balance;

    public static double rateOfInterest = 8.5;

    public static int minimumBalance = 5000;

    public NoBank(String userName, String password,int balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
        //Try this : generate random no's here
        this.accountNo = 101;

    }

    public String addMoney(int money, String password) {

        if(password.equals(this.password)){
            balance = balance + money;
            return "Money has been added, new Balance is "+balance;
        }
        else
            return "The password entered is incorrect";
    }

    public String withdrawMoney(int money, String password) {

        if(password.equals(this.password)){
            int newBalance = balance - money;

            if(newBalance>=5000) {
                balance = balance - money;
                return "Money withdrawn successfully, new balance is "+balance;
            }
            else{
                return "Minimum balance criteria is not supported";
            }
        }else{
            return "Password theek se lgao";
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

        double totalInterest = (balance*NoBank.rateOfInterest*years)/100;
        return totalInterest;

    }
}
