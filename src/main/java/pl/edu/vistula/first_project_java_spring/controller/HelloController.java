package pl.edu.vistula.first_project_java_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "Vistula") String name, Model model) {
        model.addAttribute("name", name);
        String imageUrl = "https://static.vecteezy.com/system/resources/thumbnails/028/626/672/small_2x/hd-image-ai-generative-free-photo.jpeg";
        model.addAttribute("imageUrl", imageUrl);
        return "greeting";
    }
}