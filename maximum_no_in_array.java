import java.util.Scanner;  
public class ArrayInputExample1   
{  
public static void main(String[] args)   
{  
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
n=sc.nextInt();  
//creates an array in the memory of length 100  
int[] array = new int[100];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}
  int max=array[0];
  //finding the largest number
  for(int i=0;i<n;i++)
  {
    if(array[i]>max)
      max=array[i];
  }
  System.out.println("Largest element present in the array:"+max);
}
}
