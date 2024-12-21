package KR;

import java.util.Scanner;

import static KR.FillingInArrays.*;

public class Menu {
    private static boolean whileTrue = true;
    static Scanner scan = new Scanner(System.in);
    static int choice = 0;

    protected static void start() {
        System.out.print("\n    Welcome to compare arrays application!\n");
        while (whileTrue) {
            System.out.print("\n1 Create a new array\n" +
                    "2 Compare two arrays\n" +
                    "3 View arrays\n" +
                    "4 Exit from application\n" +
                    "   Enter your choice: ");
            switch (choice = scan.nextInt()) {

                case 1:
                    newArr1();
                    newArr2();
                    break;
                case 2:
                    CompareArr.compareArrays(arr1,arr2);
                    break;
                case 3:
                    viewArrays();
                    break;
                case 4:
                    System.out.println("    Exit from application");
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
