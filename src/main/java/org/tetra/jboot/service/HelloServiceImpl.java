package org.tetra.jboot.service;

import org.springframework.stereotype.Service;

/**
 * @Author: romain.pillot
 * @Date: 23/10/2017
 */

@Service
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "hello";
    }
}
