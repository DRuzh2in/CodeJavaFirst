public class Main {

    public static void main(String[] args) {

        int sizeArray = 100;
        int min = 0; // min digit in array
        int max = 100; // max digit in array
        int [] dataArray = GetArray.getRandomArray(min, max, sizeArray); // get random Array

        AnyPrint.printArray(dataArray, sizeArray);

        int maxInArr = SearchInArray.serchMax(dataArray, sizeArray);
        System.out.println(maxInArr);
/*
        sortAtoZ(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sortZtoA(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }



    public static void sortAtoZ(int[] arr) {
        {
            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[min] > arr[j]) {
                        min = j;
                    }
                }
                if (i != min) {
                    int c = arr[i];
                    arr[i] = arr[min];
                    arr[min] = c;
                }
            }
        }
    }

    public static void sortZtoA(int[] arr) {
        {
            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[min] < arr[j]) {
                        min = j;
                    }
                }
                if (i != min) {
                    int c = arr[i];
                    arr[i] = arr[min];
                    arr[min] = c;
                }
            }
        }
    }
    public static void sieve(int [] arr){
        for (int i=1;i<5;i++)
        {
            int Num;
            Num = arr[i]/2;
            if(Num == 0){
                break;
            }
            Num = arr[i]%2;
            if(Num == 1){
                System.out.println(Num);
            }
        }*/
    }
}
