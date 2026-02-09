import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        //java banking program

        //declare variables
        double balance=0;
        boolean isRunning=true;
        int choice;

        //Display menu
        while (isRunning){
            System.out.println("**********");
            System.out.println("Banking program");
            System.out.println("**********");
            System.out.println("1.show balance:");
            System.out.println("2.deposit:");
            System.out.println("3.witdhraw:");
            System.out.println("********** ");

            //get and process users choice


            System.out.print("enter your choice(1-4): ");
            choice= scanner.nextInt();

            switch (choice){
                case 1-> showBalance(balance);
                case 2-> balance+=deposit();
                case 3-> balance-=withdraw(balance);
                case 4-> isRunning=false;
                default -> System.out.println("invalid choice");

            }
        }
        System.out.println("****************");

        System.out.println("thank you havae a nice day");
        System.out.println("****************");


        scanner.close();
    }
    static void showBalance(double balance){
        System.out.println("**********");
        System.out.printf("$%.2f\n",balance);

    }
    static double deposit(){
        double amount;
        System.out.print("enter an amount to be deposited: ");
        amount=scanner.nextDouble();

        if (amount<0){
            System.out.println("amount can't be negative");
            return 0;

        }else{
            return amount;
        }

    }
    static double withdraw(double balance){

        double amount;
        System.out.print("enter amount to be witdhrawed: ");
        amount=scanner.nextDouble();

        if(amount>balance){
            System.out.println("not sufficent balance: ");
            return 0;

        } else if (amount<0) {
            System.out.println("amount cant be negative: ");
            return 0;


        }else {
            return amount;
        }




    }
}
