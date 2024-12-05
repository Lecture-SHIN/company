package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@GetMapping("/api/yys4")
	public String infoYys4() {
		return "yys4";
	}
	
}
