package com.example.calculadora.controller;
import com.example.calculadora.service.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.calculadora.model.modeloCalculadora;
import java.util.List;

@RestController
@RequestMapping("/Calculadora")//esto define la ruta
public class calculadoraController {

    @Autowired//identificador de spring 
    private calculadoraService calculadoraService;// define a cual se va a conectar

    @GetMapping("sum")
    public modeloCalculadora sum(@RequestParam double a,@RequestParam double b){
        return calculadoraService.suma(a, b);
    }
    
    @GetMapping("resta")
    public modeloCalculadora resta(@RequestParam double a,@RequestParam double b){
        return calculadoraService.resta(a, b);
    }
    
    @GetMapping("division")
    public modeloCalculadora division(@RequestParam double a,@RequestParam double b){
        return calculadoraService.div(a, b);
    }

    @GetMapping("multiplicacion")
    public modeloCalculadora multi(@RequestParam double a,@RequestParam double b){
        return calculadoraService.multi(a, b);
    }
}
