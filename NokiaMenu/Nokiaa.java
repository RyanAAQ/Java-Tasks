import java.util.Scanner;

public class Nokia{
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the Nokia Menu System");

        
    int running = 1;
    while (running == 1) {
    System.out.println("\n           MAIN MENU           ");
    System.out.println("1. Phone book");
    System.out.println("2. Messages");
    System.out.println("3. Chat");
    System.out.println("4. Call register");
    System.out.println("5. Tones");
    System.out.println("6. Settings");
    System.out.println("7. Call divert");
    System.out.println("8. Games");
    System.out.println("9. Calculator");
    System.out.println("10. Reminders");
    System.out.println("11. Clock");
    System.out.println("12. Profiles");
    System.out.println("13. SIM services");
    System.out.println("0. Exit phone");
    System.out.print("Choose option (0-13): ");
    
    int choice1 = input.nextInt();

    if (choice1 > 13) {
    System.out.println("Invalid input. Enter a number from 1 to 13");
    input.next();
    }

    int choice = input.nextInt();
    input.nextLine();
}
    switch (choice) {
    case 1:
    while (true) {
    System.out.println("\n========== PHONE BOOK ==========");
    System.out.println("1. Search");
    System.out.println("2. Service Nos.");
    System.out.println("3. Add name");
    System.out.println("4. Erase");
    System.out.println("5. Edit");
    System.out.println("6. Assign tone");
    System.out.println("7. Send b'card");
    System.out.println("8. Options");
    System.out.println("9. Speed dials");
    System.out.println("10. Voice tags");
    System.out.println("0. Back to Main Menu");
    System.out.print("Choose option (0-10): ");

     System.out.println("Invalid input. Enter a number from 1 to 10");
    input.next();
    }


    int pchoice = input.nextInt();
    if (pchoice == 0)
break;

    switch (pchoice) {
    case 1:  System.out.println("-> Search: Enter name to find contact."); 
break;
    case 2:  System.out.println("-> Service Nos: Calling service numbers..."); 
break;
    case 3:  System.out.println("-> Add name: Enter new contact name and number."); 
break;
    case 4:  System.out.println("-> Erase: Delete selected contact."); 
break;
    case 5:  System.out.println("-> Edit: Modify existing contact."); 
break;
    case 6:  System.out.println("-> Assign tone: Set ringtone for specific caller."); 
break;
    case 7:  System.out.println("-> Send b'card: Send business card via SMS."); 
break;
    case 8:
break;
    case 9:  System.out.println("-> Speed dials: Assign numbers to keys 2-9."); 
break;
    case 10: System.out.println("-> Voice tags: Record voice dialing tags."); 
break;
    default: System.out.println("Invalid input. Enter a number");
     while (true) {
     System.out.println("\n------ PHONE BOOK > OPTIONS ------");
     System.out.println("1. Type of view");
     System.out.println("2. Memory status");
     System.out.println("0. Back to Phone Book");
     System.out.print("Choose from option 0-2: ");
   
      if (pchoice == > 2) {
      System.out.println("Invalid input. Please enter a number:");
      input.next();
    }
}

           
           


