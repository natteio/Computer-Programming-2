import java.util.Scanner;

public class b {
    public void declaration (){
      System.out.println("This program will determine the reverse of a string.");
        Scanner get = new Scanner (System.in);
        System.out.print("Enter name: ");
        String input = new String(get.nextLine());

        String [] output = input.split("");
        sort(output);
        System.out.println();
    }
    private void sort (String output[]){
        String name;

        for (int t=0;t<output.length-1;t++){
            for (int i=0; i<output.length-t-1;i++){
                if (output[i+1].compareTo(output[i])>0){
                    name = output[i];
                    output[i] = output [i+1];
                    output [i+1] = name;
                }
            }
        }
        for (int i=0; i<output.length;i++){
            System.out.print(output[i]);
        }
    }
}
