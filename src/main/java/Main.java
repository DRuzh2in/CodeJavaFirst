public class Main {

    public static void main(String[] args) {
        int[] arr = {55, -2, 5, 157, 10};
        int max = findArr(arr);
        System.out.println("Arr[max] = " + max);

        sortAtoZ(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sortZtoA(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int findArr(int[] brr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < brr.length; i++) {
            if (max < brr[i]) {
                max = brr[i];
            }
        }
        return max;
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
}
