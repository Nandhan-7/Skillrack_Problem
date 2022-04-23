The program must accept N integers and for each integer, the program must print the next immediate larger integer on the right.
If there is no such immediate larger integer,then the current integer value itself is printed as the output.
  
Example 
Input/Output 1:
Input:
7 10 45 20 40 60 50 100
Output:
45 60 40 60 100 100 100  
Explanation:
The next immediate larger number for 10 is 45.
The next immediate larger number for 45 is 60 (As 20 and 40 are smaller than 45).
Similarly for 20 it is 40, for 40 it is 60. For 60 it is 100 (As 50 is less than 60), for 50 it is 100.
For 100 as there is no larger integer on the right, 100 itself is printed.  

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		Stack<Integer> sk=new Stack<>();
		for(int index=0;index<size;index++)
		{
		    arr[index]=sc.nextInt();
		}
		int[] ansArr=new int[size];
		for(int index=size-1;index>=0;index--)
		{
		    while(!sk.empty() && arr[index]>=sk.peek())
		    {
		        sk.pop();
		    }
		    ansArr[index]=sk.empty()?arr[index]:sk.peek();
		    sk.push(arr[index]);
		}
		for(int index=0;index<size;index++)
		{
		    System.out.print(ansArr[index]+" ");
		}
		

	}
}  
