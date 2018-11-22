package example.docker.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@GetMapping("/member/hello")
    public String hello() {
		return "hello from member Client";
    }
}
