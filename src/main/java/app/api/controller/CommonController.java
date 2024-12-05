package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@GetMapping("/api/hso6")
	public String introHso6() {
		return "hso6";
	}
	
}
