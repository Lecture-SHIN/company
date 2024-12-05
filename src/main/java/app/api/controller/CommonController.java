package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {


    @GetMapping("/api/ksj1")
    public String infoKsj1() {
        return "ksj1";
    }
}
