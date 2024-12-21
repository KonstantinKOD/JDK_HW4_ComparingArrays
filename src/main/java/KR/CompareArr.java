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

import java.util.Arrays;

public class CompareArr {
    public static  <T> boolean compareArrays(T[] arr1, T [] arr2) {
        if (arr1.length != arr2.length){
            System.out.print("\nДлина массивов НЕ равна!\n");
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])){
                System.out.printf("\nЭлементы по индексом %d НЕ равны!\n", i);
                return false;
            }
        }
        System.out.println("\nМассивы равны!\n");
        return true;
    }
}
