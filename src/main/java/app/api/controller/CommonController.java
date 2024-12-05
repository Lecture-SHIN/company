package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@GetMapping("/KDH6")
	public String kdhString() {
		return "KDH";
	}

}
