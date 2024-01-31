import java.util.Scanner;
public class WeekCalender {
    public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
        System.out.println("Enter a number bewteen 1 to 7 to know which day is it");
        int date=SC.nextInt();
        if(date==1){
            System.out.println("Sunday");
        }
                    if(date==2){
            System.out.println("Monday");
                    }
                    if(date==3){
            System.out.println("Tuesday");
                    }
                    if(date==4){
            System.out.println("Wednesday");
                    }
                    if(date==5){
            System.out.println("Thursday");
                    }
                    if(date==6){
            System.out.println("Friday");
            }
                    if(date==7){
            System.out.println("Saturday");
                    }

        }
    }

    

