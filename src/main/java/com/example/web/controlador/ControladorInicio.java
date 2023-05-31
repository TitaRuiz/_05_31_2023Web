package com.example.web.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {
    @GetMapping("/")
    public String mostrarInicio(){
        return "index";
    }
}
