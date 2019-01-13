package first.docker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import first.docker.dao.impl.PeopleJdbcRepository;
import first.docker.entity.People;

@RestController
public class MemberController {
	
	private final PeopleJdbcRepository peopleJdbcRepository;
	
	public MemberController(PeopleJdbcRepository peopleJdbcRepository) {
		this.peopleJdbcRepository = peopleJdbcRepository;
	}

	@GetMapping("/member/hello")
	public String hello() {
		return "Hello from Member Application";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/member/all")
	public List<People> getAllPeople() {
		return this.peopleJdbcRepository.findAll();
	}
}
