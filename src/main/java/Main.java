import array.GetArray;
import collections.MyLinkedList;
import collections.MyList;
import game.SearchNumber;
import serch.Array;
import string.RevertString;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {


    static int task = 12; //номер задания

    public static void main(String[] args) {

        int sizeArray = 100; // size elements in MergArray
        int[] dataArray;
        int min = 0; // min digit in MergArray
        int max = 100; // max digit in MergArray

        switch (task) {
            //Search maximum in MergArray
            case 1:
                dataArray = GetArray.getRandomArray(sizeArray, min, max); // get random MergArray
                AnyPrint.printArray(dataArray, sizeArray, 1);
                int maxInArr = Array.serchMax(dataArray, sizeArray); // max in Arr
                System.out.format("\nMax in MergArray: %d\n", maxInArr);
                break;
            //Sort
            case 2:
                //сортировка массива
                dataArray = GetArray.getRandomArray(sizeArray, min, max);
                dataArray = sort.Insert.InsertSort(dataArray, sizeArray);
                AnyPrint.printArray(dataArray, sizeArray, 1);
                break;
            //Нахождение числа фибоначи
            case 3:
                /**
                 * Нахождение числа фибоначи по его позиции в последовательности,
                 * на входе - позиция, на выходе — значение
                 */
                break;
            //вывести на консоль все простые числа
            case 4:
                /**
                 * вывести на консоль все простые числа из промежутка 1...n включительно, где n - входной аргумент
                 */
                break;
            //Нахождение числа фибоначи
            case 5:
                /**
                 * вывести на консоль все числа из промежутка 1...n включительно, которые делятся без остатка на m,
                 * где n и m - входные аргументы
                 */
                break;
            //Нахождение числа фибоначи
            case 6:
                dataArray = new int[]{1, 2, 3, 4, 5, 7};
                //dataArray = array.GetArray.getRandomArray(sizeArray);
                //dataArray = sort.Insert.InsertSort(dataArray, sizeArray);
                AnyPrint.printArray(dataArray, dataArray.length, 1);
                int left = 0, right = dataArray.length, searchInt = 6;
                int elementArr = Array.binarySearch(dataArray, left, right, searchInt); // binary search
                System.out.format("\n%d\n", elementArr);
                if (elementArr == -1) System.out.format("Could not find item: %d in MergArray\n", searchInt);
                else System.out.format("\nArr[%d] = %d\n", elementArr, searchInt);
                break;

            //
            case 7:
                /**
                 * вывести на консоль все числа из промежутка 1...n включительно, которые делятся без остатка на m,
                 * где n и m - входные аргументы
                 */
                break;
            //переворот строки
            case 8:
                String str = "qwerty";
                String string = RevertString.revert(str);
                System.out.println(string);
                break;
            case 9:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введи минимальное значение: ");
                min = scanner.nextInt();
                System.out.println("Введи максимальное значение: ");
                max = scanner.nextInt();
                System.out.println("Загадай число от " + min + " до " + max);
                SearchNumber.gameNumber(min, max);
                break;

            case 10:
                Scanner scan = new Scanner(System.in);
                MyList[] list = new MyList[5];

                for (int i = 0; i < list.length; i++) {
                    MyList list2 = new MyList();
                    System.out.println("Введите ваше имя (* не более 10 символов): ");
                    list2.setName(scan.nextLine());
                    System.out.println("Введите ваш возраст: ");
                    list2.setAge(scan.nextInt());
                    scan.nextLine();
                    list[i] = list2;
                }

                System.out.println("Список: ");
                System.out.printf("|%10s|%4s|\n", "Name", "Age");
                System.out.println("-----------+-----");
                for (int i = 0; i < list.length; i++) {
                    System.out.printf("|%10s|%4d|\n", list[i].getName(), list[i].getAge());
                }
                System.out.println("-----------+-----");
                break;

            case 11:
                Scanner sc = new Scanner(System.in);
                List <MyList> men = new LinkedList();
                for (int i = 0; i < 5; i++) {
                    MyList list2 = new MyList();
                    System.out.println("Введите ваше имя (* не более 10 символов): ");
                    list2.setName(sc.nextLine());
                    System.out.println("Введите ваш возраст: ");
                    list2.setAge(sc.nextInt());
                    sc.nextLine();
                    men.add(list2);
                }

                System.out.println("Список: ");
                System.out.printf("|%10s|%4s|\n", "Name", "Age");
                System.out.println("-----------+-----");
                for (int i = 0; i < 5; i++) {
                    System.out.printf("|%10s|%4d|\n", men.get(i).getName(), men.get(i).getAge());
                }
                System.out.println("-----------+-----");
                break;

            case 12:
                MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
                myList.add(1);
                myList.add(15);
                myList.add(28);
                myList.add(0);
                myList.add(100);

                System.out.println(myList);
                myList.add(666, 2);
                System.out.println(myList);
                break;

            default:
                System.out.format("WTF, where Task!!!\n");
                break;
        }


    }
}
