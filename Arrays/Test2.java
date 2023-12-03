package Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		int[] arr = {100,80,30,40,50};
		
		int sum = 0;
		
		int min = arr[0];
		
		for(int i=0; i<5; i++) {
		
			if(min > arr[i]) {
				min = arr[i];
			}
			
			//sum += arr[i];
			//System.out.println(arr[i]);
		
		}
		
		System.out.println(min);
		
	}

}
