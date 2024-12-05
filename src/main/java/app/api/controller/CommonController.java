package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	
	@GetMapping("/api/sh2")
	public String infoSh2() {
		return "sh2";
	}
}
