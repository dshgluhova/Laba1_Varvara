package bsuir.var15.group922402.maslovskaya;
import java.util.Scanner;
         //15. Заданы два массива – А(5) и В(5). В каждом из массивов найти наибольшее
        //значение и умножить на него все элементы массивов.
       // На печать вывести исходные и преобразованные массивы.

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите элементы массива через запятую:");

        String array = sc.nextLine();
        String parts[] = array.split(",");
        int[] elements = new int[parts.length];
        for(int i = 0;i < parts.length; i++ ) {
            elements[i] = Integer.parseInt(parts[i].trim());
        }
            System.out.println("Ваш изначальный массив:");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(" " + elements[i]);
        }
        int maxE = 0;
        for (int i = 0; i < elements.length; i++)
            if (elements[i] > maxE) {
                maxE = elements[i];
            }
        int arrayN[] = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arrayN[i] = elements[i] * maxE;
        }
        System.out.println("");
        System.out.println("Ваш новый массив:");
        for (int i = 0; i < elements.length; i++){
            System.out.print(" " + arrayN[i]);
        }
    }
}
