
public class MoveZero {

	private static void MoveZero(int[] arr, int n) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < n; i++) {
			  if (arr[i] != 0)
	                arr[count++] = arr[i];
			
		}
		 while (count < n)
		 {
	            arr[count++] = 0;
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {1,0,4,5,0,5,4};
int n=arr.length;
MoveZero(arr,n);



System.out.println("Array after pushing zeros to the back: ");
for (int i=0; i<n; i++)
    System.out.print(arr[i]+" ");
	}

	

}
