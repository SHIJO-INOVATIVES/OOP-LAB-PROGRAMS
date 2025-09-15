import java.util.*;

public class StackPushPopExample
{
    public static void main(String args[])
    {
        Stack<Integer>stk=new Stack<>();
        System.out.println("Stack:"+stk);
        Pushelmnt(stk,90);
        Pushelmnt(stk,11);
        Pushelmnt(stk,45);
        Pushelmnt(stk,18);
        Popelmnt(stk);
        Popelmnt(stk);
        try
        {
            Popelmnt(stk);
        }
        catch(EmptyStackException e)
        {
            System.out.println("Empty Stack");
        }
    }
    static void Pushelmnt(Stack stk,int x)
    {
        stk.push(Integer.valueOf(x));
        System.out.println("Push->"+x);
        System.out.println("Stack:"+stk);
    }
    static void Popelmnt(Stack stk)
    {
        System.out.print("Pop->");
        Integer x=(Integer)stk.pop();
        System.out.println(x);
        System.out.println("Stack:"+stk);
    }
}
