package KR;

import java.util.Arrays;

import static KR.Menu.scan;

public class FillingInArrays {
    static Integer[] arr1;
    static Integer[] arr2;

    protected static <T> T[] newArr1() {
        System.out.print("Create a new array...\n" +
                "Enter the lenght of the first array: ");
        arr1 = new Integer[scan.nextInt()];
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Enter %d value: ", i + 1);
            arr1[i] = scan.nextInt();
        }
        System.out.println("First array: " + Arrays.toString(arr1));
        return (T[]) arr1;
    }

    protected static <T> T[] newArr2() {
        System.out.print("Create a new array...\n" +
                "Enter the lenght of the first array: ");
        arr2 = new Integer[scan.nextInt()];
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("Enter %d value: ", i + 1);
            arr2[i] = scan.nextInt();
        }
        System.out.println("Second array: " + Arrays.toString(arr2));
        return (T[]) arr2;
    }

    protected static void viewArrays() {
        System.out.println("View arrays:\n" +
                "Array one: " + Arrays.toString(arr1) + "\n" +
                "Array two: " + Arrays.toString(arr2));
    }
}
