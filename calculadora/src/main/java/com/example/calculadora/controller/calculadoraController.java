package com.example.calculadora.controller;
import com.example.calculadora.service.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/Calculadora")
public class calculadoraController {

    @Autowired
    private calculadoraService calculadoraService;

    @GetMapping("sum")
    public double sum(@RequestParam double a,@RequestParam double b){
        return calculadoraService.suma(a, b);
    }
    
    @GetMapping("resta")
    public double resta(@RequestParam double a,@RequestParam double b){
        return calculadoraService.resta(a, b);
    }
    
    @GetMapping("division")
    public double division(@RequestParam double a,@RequestParam double b){
        return calculadoraService.div(a, b);
    }

    @GetMapping("multiplicacion")
    public double multi(@RequestParam double a,@RequestParam double b){
        return calculadoraService.multi(a, b);
    }
}
