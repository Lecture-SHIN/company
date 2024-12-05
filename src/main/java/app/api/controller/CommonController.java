package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("/api/LHB2")
    public String LHB2() {
        return "LHB2";
    }

}
