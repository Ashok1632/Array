
public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {4,5,37,7,1};
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			while(min<arr[i]) {
				min=arr[i];
			}
			
	}
		System.out.println(""+min);
	}

}
