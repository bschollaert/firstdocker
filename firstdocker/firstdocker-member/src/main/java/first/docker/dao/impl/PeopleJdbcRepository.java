package first.docker.dao.impl;

import java.util.List;

import first.docker.entity.People;

public interface PeopleJdbcRepository {

	List<People> findAll();
}
