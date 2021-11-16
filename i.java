import java.util.Scanner;

public class i {
    public static int min = 1;
    public static int max = 100;
    public static int val;

public static Scanner get = new Scanner (System.in);
    public i (){
        //Insert Constructor here.
    }
    public void declaration(){
         GuessingGame();
    }
    private void GuessingGame () {
        int random;
        random = 1+ (int)(Math.random() *99 );
        int guess=0, LB=0, UB=0;

        while (guess != random){
            System.out.print("Enter a number (" +min+ " - " +max + "): ");
            guess = get.nextInt();
                if (guess>=101){
                    System.out.println("Sorry, only numbers 1-100.");
                    break;
                }
                if (LB != 0 && (guess<LB)){
                    System.out.println("I said higher.");
                } else if (UB != 0 && (guess>UB)){
                    System.out.println("I said lower.");
                } else {
                    if (guess == random){
                        System.out.println("Correct!");
                        break;
                    }
                    if (guess>random){
                        System.out.println("Lower.");
                        UB = guess;
                        max = UB;
                    } else {
                        System.out.println("Higher.");
                        LB = guess;
                        min = LB;
                    }
                }
        }
    }
}
