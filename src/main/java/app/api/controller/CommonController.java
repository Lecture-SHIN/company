package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@GetMapping("/api/lsy5")
	public String introLsy5() {
		return "lsy5";
	}
}
