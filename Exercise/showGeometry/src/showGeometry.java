import java.util.Scanner;

public class showGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
//                case 1:
//                    System.out.println("Draw the triangle");
//                    System.out.println("******");
//                    System.out.println("*****");
//                    System.out.println("****");
//                    System.out.println("***");
//                    System.out.println("**");
//                    System.out.println("*");
//                    break;
//                case 2:
//                    System.out.println("Draw the square");
//                    System.out.println("* * * * * *");
//                    System.out.println("* * * * * *");
//                    System.out.println("* * * * * *");
//                    System.out.println("* * * * * *");
//                    System.out.println("* * * * * *");
//                    System.out.println("* * * * * *");
//                    break;
//                case 3:
//                    System.out.println("Draw the rectangle");
//                    System.out.println("* * * * * *");
//                    System.out.println("* * * * * *");
//                    System.out.println("* * * * * *");
//                    break;
//                case 0:
//                    System.exit(0);
//                default:
//                    System.out.println("No choice!");
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("----------");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int j=0;j<2*i+1;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}
