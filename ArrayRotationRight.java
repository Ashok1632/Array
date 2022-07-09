import java.util.Scanner;

public class ArrayRotationRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[] {4,75,894,38,78};

		for (int i = 0; i < arr.length; i++) {
			
			
			System.out.println(""+arr[i]);
		}
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter no of right rotation");
		
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
		int last=arr[arr.length-1],j;
		for(j=arr.length-1;j>0;j--)
		{
			arr[j]=arr[j-1];
			
		}
		arr[0]=last;
		}
		
		System.out.println("after rotation");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(""+arr[i]);
		}
	}

}
