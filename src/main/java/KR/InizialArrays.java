package KR;

/*
Напишите обобщенный метод compareArrays(),
который принимает два массива и возвращает true,
если они одинаковые, и false в противном случае.
Массивы могут быть любого типа данных,
но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
То есть тип элемента в первом массиве под нулевым индексом такой же как тип элемента
во втором массиве под нулевым индексом (и под всеми остальными индексами аналогично)
 */

import java.util.*;

import static KR.Menu.whileTrue;

public class InizialArrays {
    static Scanner scan = new Scanner(System.in);
    static HashMap<String, int[]> map = new HashMap<>();

    public static int[] addNewArr() {
        System.out.print("Enter the lenght of the array: ");
        int len = scan.nextInt();
        int[] array = new int[len];
        System.out.println("Lenght : "+ array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for the element " + (i + 1) + ": ");
            array[i]= scan.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(array));
        return array;
    }

    public static HashMap<String, int[]> addArrayInMap(){
        System.out.print("\nEnter the key(name) for your array: ");
        String key = scan.nextLine();
        scan.nextLine();
        int[] value = addNewArr();
        map.put(key, value);
        System.out.println("\nYour array on the map:");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("The key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        menuArrs(1, whileTrue);
        return map;
    }

    public static void menuArrs(int choice, boolean whileTrue) {
        while (Menu.whileTrue) {
            switch (choice) {
                case 1:
                    System.out.printf("\nNumbers of arrays: " + map.size());
                    System.out.println("\n1 Menu of sellect\n" +
                            "2 addArrayInMap()\n" +
                                    "3 back to main menu\n" +
                                    "4 exit from application\n" +
                                    "Enter your choice: ");
                    choice = scan.nextInt();
                    break;
                case 2:
                    addArrayInMap();
                    break;
                case 3:
                    System.out.println("\nGo to back!\n");
                    Menu.start();
                    break;
                case 4:
                    System.out.println("Exit from application");
                    Menu.whileTrue = false;
                    break;
                default:
                    System.out.println("Что-то не так!");
                    choice = 1;
            }

        }
        scan.close();
    }
}
