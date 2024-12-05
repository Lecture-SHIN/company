package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	@GetMapping("/bhc6")
	public String infoBHC6() {
		return "bhc6";
	}
}
