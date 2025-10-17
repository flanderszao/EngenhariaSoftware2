package com.engsoft2.demoseguranca;

import java.security.Principal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class AloMundoController {

    @GetMapping("/public")
    public String ola() {
        return "Olá, Mundo!";
    }

    @GetMapping("/private")
    public String alo(Principal principal) {
        return "Alô, " + principal.getName() + "!";
    }

    @GetMapping("/private-scoped")
    public String aloScoped(Principal principal) {
        return "Alô, " + principal.getName() + "! (escopo read:messages)";
    }
}
