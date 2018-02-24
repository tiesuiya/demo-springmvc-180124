package org.lhpsn.demospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lh
 * @since 1.0.0
 */
@Controller
public class Express {
    @GetMapping("/login")
    public String goLogin() {
        return "login";
    }
}
