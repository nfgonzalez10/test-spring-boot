package com.test.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class ControllerApplication {

    @RequestMapping("/hola")
    public String holaMisperros(){
    return "mis perros";
    }
}
