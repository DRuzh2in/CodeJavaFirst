import game.SearchNumber;
import serch.Array;
import string.RevertString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи минимальное значение: ");
        int min = scanner.nextInt();
        System.out.println("Введи максимальное значение: ");
        int max = scanner.nextInt();
        System.out.println("Загадай число от " + min + " до " + max);
        SearchNumber.gameNumber(min, max);
    }


//    static int task = 1; //
//    public static void main(String[] args) {
//
//        int sizeArray = 100; // size elements in Array
//        int[] dataArray;
//
//        switch (task) {
//            //Search maximum in Array
//            case 1:
//                dataArray = GetArray.getRandomArray(sizeArray); // get random Array
//                AnyPrint.printArray(dataArray, sizeArray, 1);
//                int maxInArr = Array.serchMax(dataArray, sizeArray); // max in Arr
//                System.out.format("\nMax in Array: %d\n", maxInArr);
//                break;
//            //Sort
//            case 2:
//                /**
//                 * сортировка массива в порядке возрастания/убывания:
//                 * на входе массив интов, на выходе отсортированный массив интов
//                 */
//                break;
//            //Нахождение числа фибоначи
//            case 3:
//                /**
//                 * Нахождение числа фибоначи по его позиции в последовательности,
//                 * на входе - позиция, на выходе — значение
//                 */
//                break;
//            //вывести на консоль все простые числа
//            case 4:
//                /**
//                 * вывести на консоль все простые числа из промежутка 1...n включительно, где n - входной аргумент
//                 */
//                break;
//            //Нахождение числа фибоначи
//            case 5:
//                /**
//                 * вывести на консоль все числа из промежутка 1...n включительно, которые делятся без остатка на m,
//                 * где n и m - входные аргументы
//                 */
//                break;
//            //Нахождение числа фибоначи
//            case 6:
//                dataArray = new int[]{1,2,3,4,5,7};
//                //dataArray = GetArray.getRandomArray(sizeArray);
//                //dataArray = sort.Insert.InsertSort(dataArray, sizeArray);
//                AnyPrint.printArray(dataArray, dataArray.length, 1);
//                int left = 0, right = dataArray.length, searchInt = 6;
//                int elementArr = Array.binarySearch(dataArray, left, right, searchInt); // binary search
//                System.out.format("\n%d\n", elementArr);
//                if (elementArr == -1) System.out.format("Could not find item: %d in Array\n", searchInt);
//                else System.out.format("\nArr[%d] = %d\n", elementArr, searchInt);
//                break;
//
//            //
//            case 7:
//                /**
//                 * вывести на консоль все числа из промежутка 1...n включительно, которые делятся без остатка на m,
//                 * где n и m - входные аргументы
//                 */
//                break;
//            //переворот строки
//            case 8:
//                String str = "qwerty";
//                String string = RevertString.revert(str);
//                System.out.println(string);
//                break;
//            default:
//                System.out.format("WTF, where Task!!!\n");
//                break;
//        }
//
//
//    }
}
