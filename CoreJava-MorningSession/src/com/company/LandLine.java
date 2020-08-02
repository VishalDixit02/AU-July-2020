package com.company;

public class LandLine implements TelePhone {

    @Override
    public void makingACall(int number)
    {
        System.out.println("Dialling the number"+ number);
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
        System.out.println("the number needs to dialled again..Not supported by landline");
    }

    @Override
    public void showDialledHistory()
    {
        System.out.println("this feature not supported by landline");
    }
}
