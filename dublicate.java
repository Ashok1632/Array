
public class dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {4,7,37,7,4};

for (int i = 0; i < arr.length; i++) {
	for (int j =i+1; j < arr.length; j++) {
		if(arr[i]==arr[j])
		{
			System.out.println(""+arr[j]);
		}
		
	}
}

	}

}
