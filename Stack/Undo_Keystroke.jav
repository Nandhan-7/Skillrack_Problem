A series of keystrokes as a string is given as the input to the program.
The character * represents undo action to clear the last entered keystroke.
The program must print the string typed after applying the undo operations as the output.
  
Example
Input/Output 1:
Input:
lucky * draty**w
Output:
lucky draw  

Example
Input/Output 2:
Input:
trui**yhap*rd
Output: tryhard


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Character> sk=new Stack<>();
		char[] str=sc.nextLine().toCharArray();
		int len=str.length;
		for(int index=0;index<len;index++)
		{
		    if(str[index]=='*')
		    {
		        if(!sk.empty())
		        sk.pop();
		    }
		    else
		    {
		        sk.push(str[index]);
		    }
		}
		int size=sk.size();
		for(int index=size-1;index>=0;index--)
		{
		    str[index]=sk.pop();
		}
		for(int index=0;index<size;index++)
		{
		    System.out.print(str[index]);
		}
		

	}
}
