
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {5,76,86,65,5};
for (int i = 0; i < arr.length-1; i++) {
	System.out.println(""+arr[i]);
	arr[i]=arr[i+1];
	System.out.println("----");
	System.out.println(""+arr[i]);
}

	}

}
