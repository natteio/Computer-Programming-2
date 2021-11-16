import java.util.Scanner;

public class f {
    public void declaration(){
        System.out.println("This program will compute the GCF/GCD and LCD of two numbers");
        Scanner get = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = get.nextInt();
        System.out.print("Enter second number: ");
        int number2 = get.nextInt();

        int GCF = GCF(number1, number2);
        int LCD = LCD(number1, number2);

        System.out.println("The GCF/GCD is: "+ GCF);
        System.out.println("The LCD is: "+ LCD);
    }
    private int GCF (int a, int b){
        if (b==0){
            return a;
        } else {
            return (GCF(b, a%b));
        }
    }
    private int LCD (int a, int b){
        return (a*b) / GCF(a,b);
    }
}
