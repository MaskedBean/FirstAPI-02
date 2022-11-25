package com.example.FirstAPI03.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {


    @GetMapping("/{n}")
    public int getFactorial(@PathVariable Integer n) {
        int p = 0;

        for (int i = 0; i <= n; i++) {

            p += n * i;

        }
        return p;

    }
}