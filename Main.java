import java.util.Scanner;

public class Main {
    // Laboratory in the 2nd Semester
        public static a lab1 = new a();
        public static b lab2 = new b();
        public static c lab3 = new c();
        public static d lab4 = new d();
        public static e lab5 = new e();
        public static f lab6 = new f();
        public static g lab7 = new g();
        public static h lab8 = new h();
        public static i lab9 = new i();

    public static void main (String args[]){
       Scanner get = new Scanner (System.in);
            System.out.println("Refer to the choices below: ");
            System.out.println("1 - lab 1 \t 2 - lab 2 \t 3 - lab 3");
            System.out.println("4 - lab 4 \t 5 - lab 5 \t 6 - lab 6");
            System.out.println("7 - lab 7 \t 8 - lab 8 \t 9 - lab 9");

        char Y;
        do {
            System.out.print("Enter choice: ");
        int number = get.nextInt();
            switch(number){
                case 1: //laboratory 1
                    lab1.declaration();
                        break;
                case 2: //laboratory 2
                    lab2.declaration();
                        break;
                case 3: //laboratory 3
                    lab3.declaration();
                        break;
                case 4: //laboratory 4
                    lab4.declaration();
                        break;
                case 5: //laboratory 5
                    lab5.declaration();
                        break;
                case 6: //laboratory 6
                    lab6.declaration();
                        break;
                case 7: //laboratory 7
                    lab7.declaration();
                        break;
                case 8: //laboratory 8
                    lab8.declaration();
                        break;
                case 9: //laboratory 9
                    lab9.declaration();
                        break;
                default:
                    System.out.println("Sorry!");
            }
        System.out.println("Do you want to run another program?");
        System.out.println("Y/N");

            Y = get.next().charAt(0);
        } while (Y == 'Y' || Y == 'y');
        System.out.println("Thank you!");
    }
}
