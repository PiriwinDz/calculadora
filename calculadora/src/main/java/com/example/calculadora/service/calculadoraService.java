package com.example.calculadora.service;
import org.springframework.stereotype.Service;


@Service
public class calculadoraService {

    public double suma(double a,double b){
        return a+b;
    }

    public double resta(double a,double b){
        return a-b;
    }

    public double multi(double a,double b){
        return a*b;
    }

    public double div(double a,double b){
        if ( a == 0) {
            throw new ArithmeticException("No se puede divir por 0 ");
            
        }
        return a/b;
    }
}
