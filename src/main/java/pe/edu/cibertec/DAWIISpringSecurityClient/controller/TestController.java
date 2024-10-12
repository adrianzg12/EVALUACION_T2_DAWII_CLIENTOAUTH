package pe.edu.cibertec.DAWIISpringSecurityClient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {

    @GetMapping("/coordinador")
    public String publicApi() {
        return "Bienvenido Coordinador";
    }

    @GetMapping("/gestor")
    public String privateApi() {
        return "Bienvenido Gestor";
    }

    @PutMapping("/paciente")
    public String generalApi() {
        return "Bienvenido Paciente";
    }
}
