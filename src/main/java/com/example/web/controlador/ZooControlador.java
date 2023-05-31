package com.hedima.motorplantilla.controlador;

import com.hedima.motorplantilla.modelo.Zoo;
import com.hedima.motorplantilla.repositorio.IZooRepo;
import com.hedima.motorplantilla.servicio.IZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/zoos")
public class ZooControlador {
    @Autowired
    private IZooService servicio;
    @GetMapping()
    public String fConsultaUnZoo(Model modelo){
        Zoo z = new Zoo();
        modelo.addAttribute("zoo", z);
        return "fconsultaunzoo";
    }
    @PostMapping("/unzoo")
    public String consultarUnZoo(Zoo z, RedirectAttributes rd, Model modelo){
         Zoo zBBDD= servicio.obtenerUno(z.getZooId());
         rd.addFlashAttribute("z",zBBDD);
         modelo.addAttribute("animales",zBBDD.getAnimales());
        System.out.println("antes del redirect");
         return "fconsultaunzoo";
    }
}
