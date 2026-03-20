package com.example.calculadora.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
@Builder           //Esto va en el modelo para que en el service no tengas que poner getter ni setter en los metodos 
@Data              // Esto es para generar getters y setters automaticos
@NoArgsConstructor //Genera el constructor vacio
@AllArgsConstructor//Genera el constructor con todo 

public class modeloCalculadora {
    private double  numero1;
    private double  numero2;
    private double resultado;
    private String tipoOperacion;


}
