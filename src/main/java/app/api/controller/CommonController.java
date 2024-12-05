package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@GetMapping("/api/kmj2")
	public String infoKmj2() {
		return "kmj2";
	}
}
