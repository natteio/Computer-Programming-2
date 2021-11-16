import java.util.Scanner;

public class a {
    public void declaration () {
    System.out.println("This program will determine the highest and lowest numbers between 3 numbers \nand sort them.");
    Scanner scan = new Scanner (System.in);
        int [] arr = new int [3];
        int highest = 0;
        int lowest = 0;
            for (int i=0; i<arr.length;i++) {
                System.out.print("Input Number:");
                arr[i] = scan.nextInt();
            }
                System.out.println("Highest Number is: " +high(arr));
                System.out.println("Lowest Number is: " +low(arr));
                System.out.println("The difference is: "+ (high(arr) - (low(arr))));
                sort(arr);
                System.out.print("The sorted numbers are: ");
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+" ");
            }
    }
    private int high (int numb[]){
    int high = 0;
    high = numb[0];
        for (int i=0; i<numb.length;i++){
            if (high<numb[i]){
            high = numb[i];
            }
        }
        return high;
    }
    private int low (int numb[]){
    int low = 0;
    low = numb[0];
        for (int i=0; i<numb.length;i++){
            if (low>numb[i]){
            low = numb[i];
            }
        }
        return low;
    }
    private void sort (int arr[]){
        int swap = 0;

        for (int i=0; i < arr.length; i++){
            for (int j=1; j<arr.length; j++){
                if (arr[j-1] > arr[j]){
                    swap = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }
}
