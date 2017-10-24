package org.tetra.jboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tetra.jboot.service.HelloService;

/**
 * @Author: romain.pillot
 * @Date: 23/10/2017
 */

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    HelloService service;

    @GetMapping("/{name}")
    public String hello(ModelMap mapper, @PathVariable String name) {
        mapper.addAttribute("name", name);
        mapper.addAttribute("hello", service.hello());

        return "hello/hello.html";
    }
}
