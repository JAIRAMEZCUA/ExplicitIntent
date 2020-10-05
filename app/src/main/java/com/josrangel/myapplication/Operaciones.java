package com.josrangel.myapplication;

public class Operaciones {

    public static int suma(int numero1, int numero2){
        return  numero1+numero2;
    }

    public static int multiplicacion(int numero1, int numero2){
        return  numero1*numero2;
    }
    public static int division(int numero1, int numero2){
        if(numero2 == 0) return 0;
        return  numero1/numero2;
    }

    public static int resta(int numero1, int numero2){
        return  numero1-numero2;
    }
}
