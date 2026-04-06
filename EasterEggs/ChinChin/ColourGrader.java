import java.util.Random;

    public class ColourGrader{
        public static void main(String[] args){

    Random rand = new Random();
    int number = rand.nextInt(7) + 1;

    String colour; switch (number) {
    
    case 1: colour = "violet";
break;
    case 2: colour = "indigo";
break;
    case 3: colour = "blue";
break;
    case 4: colour = "green";
break;
    case 5: colour = "yellow";
break;
    case 6: colour = "orange";
break;
    default: colour = "red";
    
    System.out.println("NUmber " + number + " = " + colour);
}
    }
}
