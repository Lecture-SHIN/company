package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@GetMapping("/api/csk1")
	public String infoCsk1() {
		return "Chosungkyu";
	}
	
}