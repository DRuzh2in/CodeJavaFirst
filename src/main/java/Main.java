public class Main {

    public static void main(String[] args) {

        int sizeArray = 100;
        int min = 0; // min digit in array
        int max = 10; // max digit in array
        int [] dataArray = GetArray.getRandomArray(min, max, sizeArray); // get random Array

        AnyPrint.printArray(dataArray, sizeArray);

        int maxInArr = SearchInArray.serchMax(dataArray, sizeArray); // max in Arr
        //System.out.format("Max = %d\n", maxInArr);

        int left = 0, right = 10, searchInt = 3;
        int elementArr = SearchInArray.binarySearch(dataArray, left, right, searchInt); // binary search
        System.out.format("Arr[%d] = %d\n", elementArr, searchInt);
    }
}
