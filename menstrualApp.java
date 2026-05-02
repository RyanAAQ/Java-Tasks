import java.util.Scanner;

public class menstrualApp{
    public static void main(String... args){
    
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter what day of the month last period came: ");
        int lastperiod = input.nextInt();
    
        System.out.print("Enter how long your cycle is on average: ");
        int periodcycle = input.nextInt();
    
        System.out.print("Enter how long your period lasts is on average: ");
        int periodlength = input.nextInt();
    
        int nextperiod = lastperiod + periodcycle;
        int ovulation = lastperiod + (periodcycle / 2);
        int fertilityday = ovulation - 2;
        int fertilitystop = ovulation + 2;
    
        System.out.println("Your next period day: " + nextperiod);
        System.out.println("Your next ovulation day: " + ovulation);
        System.out.println("Your next period day: " + nextperiod);
        System.out.println("Your safe period is before: " + fertilityday + " and after day " + fertilitystop);
    
    }
}

