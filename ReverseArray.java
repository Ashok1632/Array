
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {3,5,6,8,9};

for (int i = 0; i < arr.length; i++) {
	System.out.println(""+arr[i]);	
}
for(int i=arr.length-1;i>=0;i--)
{
	System.out.println("reverse array"+arr[i]);
}
	}

}
