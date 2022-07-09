import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BiConsumer;



public class ArrayRotationLeft {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr=new int[] {4,75,894,38,78};

for (int i = 0; i < arr.length; i++) {
	
	
	System.out.println(""+arr[i]);
}
Scanner scanner=new Scanner(System.in);
System.out.println("enter no of rotation left");
int n=scanner.nextInt();
for(int i=0;i<n;i++)
{
	

 int first=arr[0],j;
for( j=0;j<arr.length-1;j++)

	arr[j]=arr[j+1];
	arr[j]=first;

}
System.out.println("display after rotation");
for(int i=0;i<arr.length;i++)
{
	System.out.println(""+arr[i]);
}

	}
}

