package first.docker.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import first.docker.entity.People;
import first.docker.mapper.PeopleRowMapper;

@Repository
public class PeopleJdbcRepositoryImpl implements PeopleJdbcRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<People> findAll() {
		return jdbcTemplate.query("select * from people", new PeopleRowMapper());
	}
}
