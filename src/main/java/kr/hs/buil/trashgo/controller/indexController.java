package kr.hs.buil.trashgo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("username", "jieun6551");
        return "test";
    }

}
