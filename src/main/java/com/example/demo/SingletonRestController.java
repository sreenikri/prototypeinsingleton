package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
//@RequestMapping
public class SingletonRestController {
    @Autowired
    SingletonService singletonService;

@GetMapping("/v1/example")
    public List<String> getMothod()throws InterruptedException{

        String first=singletonService.getMethod();
        Thread.sleep(2000);
        String second=singletonService.getMethod();
        Thread.sleep(2000);
        String third=singletonService.getMethod();

            return Arrays.asList(first,second,third);

    }


}
