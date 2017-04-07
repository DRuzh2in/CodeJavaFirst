public class Main {

    public static void main(String[] args) {

        int sizeArray = 100; // size elements in array
        int task = 6; //
        switch (task)
        {
            /*** Created by vdruzhinin on 4/6/2017.*Search maximum in array*/
            case 1: {
                int [] dataArray = GetArray.getRandomArray(sizeArray); // get random Array
                AnyPrint.printArray(dataArray, sizeArray,1);
                int maxInArr = SearchinArray.serchMax(dataArray, sizeArray); // max in Arr
                System.out.format("\nMax in array: %d\n", maxInArr);
                break;
            }
            /*** Created by vdruzhinin on 4/6/2017.*Sort*/
            case 2: {
                /**
                 * сортировка массива в порядке возрастания/убывания:
                 * на входе массив интов, на выходе отсортированный массив интов
                 */
                break;
            }
            /*** Created by vdruzhinin on 4/6/2017.*Нахождение числа фибоначи*/
            case 3: {
                /**
                 * Нахождение числа фибоначи по его позиции в последовательности,
                 * на входе - позиция, на выходе — значение
                 */
                break;
            }
            /*** Created by vdruzhinin on 4/6/2017.*вывести на консоль все простые числа*/
            case 4: {
                /**
                 * вывести на консоль все простые числа из промежутка 1...n включительно, где n - входной аргумент
                 */
                break;
            }
            /*** Created by vdruzhinin on 4/6/2017.*Нахождение числа фибоначи*/
            case 5: {
                /**
                 * вывести на консоль все числа из промежутка 1...n включительно, которые делятся без остатка на m,
                 * где n и m - входные аргументы
                 */
                break;
            }
            /*** Created by vdruzhinin on 4/6/2017.*Нахождение числа фибоначи*/
            case 6: {
                int []dataArray = GetArray.getRandomArray(sizeArray);
                AnyPrint.printArray(dataArray, sizeArray,1);
                int left = 0, right = 100, searchInt = 7;
                int elementArr = SearchinArray.binarySearch(dataArray, left, right, searchInt); // binary search
                if (elementArr == -1) System.out.format("Could not find item: %d in array\n", searchInt);
                else System.out.format("\nArr[%d] = %d\n", elementArr, searchInt);
                break;
            }

            /*** Created by vdruzhinin on 4/6/2017.**/
            case 7: {
                /**
                 * вывести на консоль все числа из промежутка 1...n включительно, которые делятся без остатка на m,
                 * где n и m - входные аргументы
                 */
                break;
            }
            default: System.out.format("WTF, where Task!!!\n");
                break;
        }



    }
}
