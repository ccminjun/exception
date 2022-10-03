package hello.exception.servlet;

import org.springframework.web.bind.annotation.GetMapping;

public class ServletExController {

    @GetMapping("/error-ex")
    public void errorEx() {
        throw new RuntimeException("예외 발생");
    }
}
