import java.util.Scanner;

public class d {
public static Scanner get = new Scanner (System.in);
    private String reverseString (String reverse){
        if (reverse.isEmpty()){
            return reverse;
        } else {
            return reverseString(reverse.substring(1)) + reverse.charAt(0);
        }
    }
    public void declaration (){
        System.out.println("This program will determine the reverse of a string using recursion.");
        d obj = new d();
        System.out.print("Enter word: ");
        String word = get.nextLine();
        System.out.println(obj.reverseString(word));
    }
}
