package kr.co.sboard.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping(value = {"/","/index"})
    public String index(Authentication authentication) {

        if (authentication.isAuthenticated()) {
            return "redirect:/article/list";
        } else {
           return "/user/login";
        }
    }
}
