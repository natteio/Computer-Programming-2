import java.util.Scanner;

public class h {
public static int number;
    public h (){
        // Hi
    }
    public void declaration (){
         System.out.println("This program will determine convert a decimal to hexadecimal and octadecimal.");
        Scanner get = new Scanner (System.in);
        System.out.print("Input decimal: ");
        number = get.nextInt();

        Hexadecimal();
        Octadecimal();
    }
    private int Hexadecimal (){
        int decimal = number;
        int remainder;
        String result = "";

        char Hex[] ={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while(decimal>0){
            remainder = decimal%16;
            result=Hex[remainder]+result;
            decimal=decimal/16;
        }
        System.out.println("Hexadecimal Value: "+result);
        return 0;
    }
    private int Octadecimal (){
        int decimal = number;
        int remainder;
        String result = "";

        char Octa[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};

        while(decimal>0){
            remainder = decimal%8;
            result=Octa[remainder]+result;
            decimal=decimal/8;
        }
        System.out.println("Octadecimal Value: "+result);
        return 0;
    }
}
