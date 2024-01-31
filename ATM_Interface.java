import java.util.Scanner;

public class ATM_Interface {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("WELCOME TO IES BANK");

        int Balance = 20000, Withdrawal, Transfer;

        System.out.print("Enter Your PIN : ");
        int PIN = SC.nextInt();

        // System.out.println(" ....WELCOME....");

        if (PIN == 2024) {

            System.out.println("           ....WELCOME....");
            System.out.println(
                    "1.DEPOSITE                   2.FAST CASH\n3.TRANSFER                   4.CASH WITHDRAWAL\n5.PIN CHANGE                 6.BALANCE INQUIRY\n7.MINI STATEMENT");

            // // System.out.println("Enter 1:-DEPOSITE");
            // // System.out.println("Enter 2:-FAST CASH");
            // // System.out.println("Enter 3:-TRANSFER");
            // // System.out.println("Enter 4:-CASH WITHDRAWAL");
            // // System.out.println("Enter 5:-PIN CHANGE");
            // // System.out.println("Enter 6:-BALANCE INQUIRY");
            // // System.out.println("Enter 7:-OTHEERS");
            // // System.out.println("Enter 8:-MINI STATEMENT");

            int Choice = SC.nextInt();

            int Deposite;

            switch (Choice) {
                case 1:
                    System.out.println("Please Deposte your Cash");
                    // System.out.println("Your Current Balance is "+Balance);
                    Deposite = SC.nextInt();

                    // int Deposite;
                    Balance = Balance + Deposite;
                    System.out.println("You have Deposited Sucessfully and Your Current Balance is:-" + Balance);
                    break;
                case 2:

                    System.out.println("\n");
                    System.out.println("CHOOSE YOUR OPTION FAST CASH");
                    System.out.println(
                            "1000                   2000\n4000                   6000\n8000                   10000");

                    System.out.println("Choose your Amount to Withdrawal");
                    int Fast_Cash = SC.nextInt();

                    if (Fast_Cash <= Balance) {

                        System.out.println("Money has been Sucessfully Withdrawal");
                        System.out.println("\n");
                        System.out.println("Enter 'Y/y' to Show the Balance");
                        int Permission = SC.next().charAt(0);

                        // while (Permission == 'Y' || Permission == 'y')

                        // SC.close();

                        if (Permission == 'y' || Permission == 'Y') {

                            Balance = Balance - Fast_Cash;
                            System.out.print("Available Balance is " + Balance);
                        } else {
                            System.out.println("Insufficient Balance");
                            SC.close();

                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter ACCOUNT NUMBER in which do you want to Transfer");
                    System.out.println("Enter Your Amount to Transfer");
                    Transfer = SC.nextInt();
                    if (Balance >= Transfer) {
                        // System.out.println("Enter ACCOUNT NUMBER in which do you want to Transfer");
                        // if()
                        // System.out.print("How much Money do you want to Transfer ");
                        // Transfer = SC.nextInt();
                        System.out.println("You have Successfully Transfer the Amount !");
                        System.out.println("Enter 'Y' or 'y' to Show the Balance");
                        int Permission = SC.next().charAt(0);
                        Balance = Balance - Transfer;
                        System.out.println("Available Balance is " + Balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                case 4:
                    System.out.println("Enter your amount to Withdrawal");
                    Withdrawal = SC.nextInt();
                    if (Balance >= Withdrawal) {
                        System.out.println("Amount has been Successfully Withdrawal");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.print("Do you want to see your Balance 'Y/N' : ");
                    int Permission = SC.next().charAt(0);
                    if (Permission == 'Y') {

                        Balance = Balance - Withdrawal;
                        System.out.print("Your current Balance: " + Balance);
                    }
                case 5:
                    System.out.println("Enter your Old PIN");
                    PIN = SC.nextInt();

                    if (PIN == 2024) {
                        System.out.print("Enter your New PIN :");
                        int New_PIN = SC.nextInt();

                        System.out.println("PIN has been Successfully Changed\n Your New PIN is " + New_PIN);

                    }
                case 6:
                    System.out.print("Do you want to check your Balance 'Y/N':");
                    Permission = SC.next().charAt(0);
                    if (Permission == 'Y') {
                        System.out.print("Your Current Balance is " + Balance);
                    }

            }

        } else {
            System.out.println("INCORRECT PIN");
        }
    }
}
