import java.util.Scanner;
public class Calender{
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        // System.out.println("Enter  your Name :");
        // String Name=SC.next();
        System.out.println("...September(2023)...\nS  M  T  W  T  F  S\n3  28 29 30 32 1  2\n10  4  5  6  7  8  9\n17 11 12 13 14 15 16\n24 18 19 20 21 22 23\n1  25 26 27 28 29 30\n8   2  3  4  5  6  7");
        System.out.print("Enter a date of the Moonth SEPTEMBER : ");
        int Date=SC.nextInt();
    if(Date==28||Date==4||Date==11||Date==18||Date==25||Date==2){
        System.out.print("Today is Monday");
    }
    else if(Date==29||Date==5||Date==12||Date==19||Date==26||Date==3){
        System.out.print("Today is Tuesday");
    }
    else if(Date==30||Date==6||Date==13||Date==20||Date==27||Date==4){
        System.out.print("Today is Wednesday");
    }
    else if(Date==31||Date==7||Date==14||Date==21||Date==28||Date==5){
        System.out.print("Today is Thursday");
    }
    else if(Date==1||Date==8||Date==15||Date==22||Date==29||Date==6){
        System.out.print("Today is Friday");
    }
    else if(Date==2||Date==9||Date==16||Date==23||Date==30||Date==7){
        System.out.print("Today is Saturday");
    }
    else if (Date==3||Date==10||Date==17||Date==24||Date==1||Date==8){
        System.out.println("Welcome to The World of Sunday...Enjoy your Weekend");
    }
    System.out.println("\nMonth : September(2023)");
    }    
}


