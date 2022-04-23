There are N wind mills in a straight line from left to right. The height of all N wind mills is passed as the input. For each wind-mill M,
the program must print the number of wind-mills which are shorter than the current wind-mill present to the left of M.

Example Input/Output 1:
Input: 6 100 200 105 110 120 250  
Output: 0 1 0 1 2 5

Explanation: 
1st wind-mill height is 100 and there are no wind-mills to the left. Hence 0 is printed.
2nd wind-mill height is 200 and there is 1 wind-mill of height 100 which is shorter on the left. Hence 1 is printed.
3rd wind-milll height is 105 and there are no wind-mills to the left which are shorter (The second wind-mill of height 200 is taller than 105. Hence the 1st wind-mill of height 100 is not considered).
4th wind-mill height is 110 and there is 1 wind-mill of height 105  which is shorter on the left. Hence 1 is printed.
5th wind-mill height is 120 and there are 2 wind-mills of height 105 and 110  which are shorter on the left. Hence 2 is printed.
6th wind-mill height is 250 and there are 5 wind-mills of height 100 200 105 110 and 120  which are shorter on the left. Hence 5 is printed.


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Stack<Integer> sk = new Stack<>();
		int[] arr=new int[size];
		int max=0,cot=0;
		sk.push(0);
		System.out.print(0+" ");
		arr[0]=sc.nextInt();
		for(int index=1;index<size;index++)
		{
		    int num=sc.nextInt();
		    arr[index]=num;
		    while(!sk.empty() && num>arr[sk.peek()])
		    {
		        sk.pop();
		    }
		    System.out.print(sk.empty()?index:index-sk.peek()-1);
		    System.out.print(" ");
		    sk.push(index);
		}
		

	}
}
