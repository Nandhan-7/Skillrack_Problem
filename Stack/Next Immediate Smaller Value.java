The program must accept N integers and for each integer, the program must print the next immediate smaller integer on the right.
If there is no such immediate smaller integer, then the current integer value itself is printed as the output.

Input:
7 
10 45 20 40 60 50 100
Output:
10 20 20 40 50 50 100

Explanation:
The next immediate smaller integer for 10 is 10 (As no other integer is less than 10) .
The next immediate smaller number for 45 is 20. Similarly for 20 it is 20, for 40 it is 40.
For 60 it is 50 and for 50 it is 50 itself.
For 100 as there is no smaller integer on the right, 100 itself is printed.


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int index=0;index<n;index++)
		{
		    arr[index]=sc.nextInt();
		}
		Stack<Integer> sk=new Stack<>();
		int[] ansArr=new int[n];
		for(int index=n-1;index>=0;index--)
		{
		    while(!sk.empty() && arr[index]<=sk.peek())
		    {
		        sk.pop();
		    }
		    ansArr[index]=sk.empty()?arr[index]:sk.peek();
		    sk.push(arr[index]);
		    
		}
		for(int index=0;index<n;index++)
		System.out.print(ansArr[index]+" ");
	}
}
