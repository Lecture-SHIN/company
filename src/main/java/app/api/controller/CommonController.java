package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@GetMapping("/api/cloud5_phc")
	public String introCloud5_phc () {
		return "cloud5_phc";
	}
	
	
}
