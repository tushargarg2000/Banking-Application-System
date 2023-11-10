import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to Lotak Bank !! Open your bank account");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your userName");
        String userName = sc.next();
        System.out.println("Enter your initial balance for account opening");
        int initialBalance = sc.nextInt();
        System.out.println("Enter your Password !!");
        String password = sc.next();


        LotakBank bankAccount = new LotakBank(userName,password,initialBalance);

        System.out.println("Enter the money you want to withdraw ");
        int money = sc.nextInt();
        System.out.println("Enter your password ");
        String enteredPassword = sc.next();

        String response = bankAccount.withdrawMoney(money,enteredPassword);
        System.out.println(response);



        //Add Money function
        System.out.println("Enter the money you want to Add into account ");
        money = sc.nextInt();
        System.out.println("Enter your password ");
        enteredPassword = sc.next();


        response = bankAccount.addMoney(money,enteredPassword);

        if(response.equals("The password entered is incorrect")){
            System.out.println(response);
            System.out.println("Enter you password again");
            enteredPassword = sc.next();

            response = bankAccount.addMoney(money,enteredPassword);
            System.out.println(response);

        }

        //Check balance

        System.out.println("Enter your password to check balance");
        enteredPassword = sc.next();
        int finalBalance = bankAccount.checkBalance(enteredPassword);
        System.out.println("The final balance is "+finalBalance);



        //
        System.out.println("Enter no. of years you want to save this money");

        int years = sc.nextInt();
        double totalInterest = bankAccount.calculateInterest(years);

        System.out.println("The totalInterest is "+totalInterest);





    }
}