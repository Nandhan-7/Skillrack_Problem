input : )(()))(())())
Output :6
Explaination: (())() this is the longest one here




import java.util.*;
public class Main {
    public static boolean ValidParentheses(String s)
    {
        Stack<Character> sk=new Stack<>();
        for(int index=0;index<s.length();index++)
        {
            if(s.charAt(index)=='(')
            {
                sk.push('(');
            }
            else if(s.charAt(index)==')')
            {
                if(sk.empty())
                {
                    return false;
                }
                sk.pop();
            }
        }
        if(sk.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		List<Integer> l=new ArrayList<>();
		int len=str.length();
		for(int index=0;index<len;index++)
		{
		    for(int ctr=index;ctr<len-1;ctr++)
		    {
		        String s=str.substring(index,ctr+2);
		        System.out.println(s);
		        if(ValidParentheses(s))
		        {
		            l.add(s.length());
		            
		        }
		    }
		}
		if(l.size()==0)
		{
		    System.out.print(0);
		}
		else
		{
		    int max=l.get(0);
		    for(int index=1;index<l.size();index++)
		    {
		        if(max<l.get(index))
		        {
		            max=l.get(index);
		        }
		    }
		    System.out.print(max);
		}

	}
}
