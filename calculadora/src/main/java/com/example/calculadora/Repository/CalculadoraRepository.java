package com.example.calculadora.Repository;
import org.springframework.stereotype.Repository;
import com.example.calculadora.model.modeloCalculadora;/// importamos el modelo 
import java.util.ArrayList;
import java.util.List;

@Repository/// este es un identificatorio para spring 
public class CalculadoraRepository {
    private List<modeloCalculadora> historial = new ArrayList<>();

    public void guardar(modeloCalculadora operacion){
        historial.add(operacion);
    }
    
    public List<modeloCalculadora> obtenerTodos() {
    return historial; // para mostrar
}
}
