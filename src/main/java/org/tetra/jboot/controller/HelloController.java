package org.tetra.jboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: romain.pillot
 * @Date: 23/10/2017
 */

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(ModelMap mapper, @PathVariable String name) {
        mapper.addAttribute("name", name);

        return "hello/hello.html";
    }
}
