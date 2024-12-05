package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@GetMapping("/api/kmj2")
	public String infoKmj2() {
		return "kmj2";
	}

	@GetMapping("/api/KDH3")
	public String infoKdh3() {
		return "kdh3";

	@GetMapping("/api/1_lsy")
	public String info1Lsy() {
		return "1_lsy";
 main
	}

}
