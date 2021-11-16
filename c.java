import java.util.Scanner;

public class c {
public static Scanner get = new Scanner (System.in);
    public void declaration (){
        System.out.println("This program will determine if a string is a palindrome or not.");
        System.out.print("Enter word: ");
        String input = get.next();

        palindrome (input);
    }
    private void palindrome (String input){
        int length = input.length();
        int i;
        int begin;
        int end;
        int middle;

        begin = 0;
        end = length - 1;
        middle = (begin + end) / 2;

        for (i = begin; i<=middle;i++){
            if (input.charAt(begin) == input.charAt(end)){
                begin++;
                end--;
        }
            else {
                break;
            }
        }
        if (i == middle +1){
            System.out.println("IT IS A PALINDROME");
        } else {
            System.out.println("IT IS NOT A PALINDROME");
        }
    }
}
