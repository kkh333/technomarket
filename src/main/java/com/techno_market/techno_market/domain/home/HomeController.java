package com.techno_market.techno_market.domain.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    //테스트
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/l")
    public String login() {
        return "login";
    }

    @GetMapping("/s")
    public String signup() {
        return "signup";
    }

    @GetMapping("/is")
    public String is() {
        return "id_search";
    }

    @GetMapping("/isr")
    public String isr() {
        return "id_search_result";
    }

    @GetMapping("/ps")
    public String ps() {
        return "password_search";
    }

    @GetMapping("/psr")
    public String psr() {
        return "password_search_modify";
    }

    @GetMapping("/spf")
    public String spf() {
        return "sales_post_form";
    }

    @GetMapping("/c")
    public String component() {
        return "component";
    }
}
