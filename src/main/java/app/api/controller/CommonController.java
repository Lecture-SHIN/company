package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@GetMapping("/api/KDH3")
	public String infoKDH3() {
		return "KDH3";
	}
	
}
