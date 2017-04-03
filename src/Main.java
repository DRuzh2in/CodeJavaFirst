public class Main{

	public static void main(String[] args){
		int[] arr = {1,2,5,7,9};
		int max = findArr(arr);
		System.out.println(max);
	}

	public static int findArr(int[] brr ){
		int max = 0;
		for (int i = 0;i < brr.length; i++) {
			if(max < brr[i]){
				max = brr[i];
			}
		}
		return max;
	}
}