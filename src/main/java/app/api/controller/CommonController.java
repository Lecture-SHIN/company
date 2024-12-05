package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	@GetMapping("/api/1_lsy")
	public String info1Lsy() {
		return "1_lsy";
	}
	
}
