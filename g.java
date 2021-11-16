import java.util.Scanner;

public class g {
public static Scanner get = new Scanner (System.in);
    public void declaration(){
        System.out.println("This program will determine if a character is an alphabet.");

        alphabet();
    }
    private void alphabet (){
        System.out.print("Enter character: ");
        String a = get.next();

        if (a.length() == 1){
            if ((a.charAt(0)>='a' && a.charAt(0)<='z') || (a.charAt(0)>='A' && a.charAt(0)<='Z')){
                System.out.println(a + " is in the alphabet");
            } else {
                System.out.println(a + " is not in the alphabet");
            }
        } else {
            System.out.println("Sorry! I can't evaluate 2 characters.");
        }
    }
}
