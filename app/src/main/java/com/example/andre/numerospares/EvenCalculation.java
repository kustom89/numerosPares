package com.example.andre.numerospares;

public class EvenCalculation {

    private EvenCallback callback;

    public EvenCalculation(EvenCallback callback) {
        this.callback = callback;
    }

    public void evenCalculator(String value){
        int number=2;
        int auxValue=Integer.parseInt(value);

       if(auxValue%number==0){
           callback.evenResult(value);

       }else{
           callback.blankInput();
       }


    }
}
