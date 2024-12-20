package KR;

import java.util.Scanner;

import static KR.InizialArrays.map;

public class Menu {
    public static boolean whileTrue = true;
    static Scanner scan = new Scanner(System.in);
    static int choice = 0;

    public static void start(){
        System.out.print("\n  Welcome to compare arras application!\n" +
                "1 Create a new array\n" +
                "2 Compare two arrays\n" +
                "3 Exit from application\n" +
                "0 Main menu\n" +
                "Enter your choice: ");
        while (whileTrue){
            choice = scan.nextInt();
            switch (choice){
                case 0:
                    System.out.println("\nSelect an item\n" +
                            "\n1 Create a new array\n" +
                            "2 Compare two arrays\n" +
                            "3 Exit from application\n" +
                            "0 Main menu\n" +
                            "\"Enter your choice: \"");
                    break;
                case 1:
                    System.out.println("\nSelect an item\n" +
                            "Numbers of arrays: " + map.size() + "\n" +
                            "1 Menu of select\n" +
                            "2 addArrayInMap()\n" +
                            "3 Back to main menu\n" +
                            "4 Exit from application\n" +
                            "Enter your choice: ");
                    InizialArrays.menuArrs(scan.nextInt(), whileTrue);
                    break;
                case 2:
                    System.out.println("\nIt's not working yet, in development\n" +
                            "\nSelect an item\n" +
                            "1 Create a new array\n" +
                            "2 Compare two arrays\n" +
                            "3 Exit from application\n" +
                            "0 Main menu\n" +
                            "Enter your choice: ");
                    break;
                case 3:
                    System.out.println("Exit from application");
                    whileTrue = false;
                    break;
                default:
                    System.out.println("Что-то не так!");
                    choice = 0;
            }
        }
        scan.close();
    }
}
