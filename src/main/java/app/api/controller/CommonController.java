package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class CommonController {

	@GetMapping("/api/chs3")
	public String infoChs3() {
		return "chs3";
	}
}
