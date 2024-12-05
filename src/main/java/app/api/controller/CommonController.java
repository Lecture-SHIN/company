package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class CommonController {
	@GetMapping("/api/lws3")
	public String infoLws3() {
		return "lws3";
	}
}

