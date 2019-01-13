package first.docker.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import first.docker.entity.People;

public class PeopleRowMapper implements RowMapper<People>{

	
	public People mapRow(ResultSet rs, int rowNum) throws SQLException {
		People people = new People();
		people.setPeople_id(rs.getLong("people_id"));
		people.setSurname(rs.getString("surname"));
		people.setAge(rs.getInt("age"));
		return people;
	}
}
