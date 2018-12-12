package first.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@GetMapping("/member/hello")
	public String hello() {
		return "Hello from Member Application";
	}
}
