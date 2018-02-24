package org.lhpsn.demospringmvc.controller;

import org.lhpsn.demospringmvc.param.LoginForm;
import org.lhpsn.demospringmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lh
 * @since 1.0.0
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(LoginForm loginForm) {
        boolean success = userService.login(loginForm);
        return success ? "1" : "0";
    }
}
