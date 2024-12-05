package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@GetMapping("/api/cloud1")
	public String infoCloud1() {
		return "cloud1";
	}
	
}
