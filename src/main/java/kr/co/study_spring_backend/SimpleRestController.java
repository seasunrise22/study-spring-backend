package kr.co.study_spring_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/map")
public class SimpleRestController {

    @GetMapping("/")
    public String hello() {
        return "Hello <strong>Backend</strong>";
    }

}
