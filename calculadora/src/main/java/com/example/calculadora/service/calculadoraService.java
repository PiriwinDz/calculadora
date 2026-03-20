package com.example.calculadora.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.calculadora.Repository.CalculadoraRepository;
import com.example.calculadora.model.modeloCalculadora;



@Service
public class calculadoraService {
    @Autowired/// esto es para que identifique que necesita guardar algo en algun lado 
    private CalculadoraRepository repository;/// esto es para decirle donde se va a conectar

    public modeloCalculadora suma(double a,double b){
        modeloCalculadora resultado = modeloCalculadora.builder()
        .numero1(a)
        .numero2(b)
        .resultado(a+b)
        .tipoOperacion("Suma")
        .build();

        repository.guardar(resultado);
        return resultado;
    }

    public modeloCalculadora resta(double a,double b){
        modeloCalculadora resultado = modeloCalculadora.builder()
        .numero1(a)
        .numero2(b)
        .resultado(a-b)
        .tipoOperacion("resta")
        .build();
        repository.guardar(resultado);
        return resultado;
    }

    public modeloCalculadora multi(double a,double b){
        modeloCalculadora resultado = modeloCalculadora.builder()
        .numero1(a)
        .numero2(b)
        .resultado(a*b)
        .tipoOperacion("multiplicacion")
        .build();
        repository.guardar(resultado);
        return resultado;
    }

    public modeloCalculadora div(double a,double b){
        if ( b == 0) {
            throw new ArithmeticException("No se puede divir por 0 ");
            
        }
        modeloCalculadora resultado = modeloCalculadora.builder()
        .numero1(a)
        .numero2(b)
        .resultado(a/b)
        .tipoOperacion("Division")
        .build();
        repository.guardar(resultado);
        return resultado;
    }
}
