package com.company;
import java.util.Stack;
public class MobilePhone implements TelePhone
{
    Stack<Integer> history=new Stack<>();
    @Override
    public void makingACall(int number)
    {
        history.push(number);
        System.out.println("The number "+ number+ " is dialled");
        return;
    }

    @Override
    public void terminatingACall()
    {
        System.out.println("Call ended");
    }

    @Override
    public void rediallingLastCall()
    {
        makingACall(history.peek());
    }

    @Override
    public void showDialledHistory()
    {
        System.out.println("The history is =>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int number: history)
        {
            System.out.println(number);
        }
        return;
    }
}
