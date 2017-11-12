package by.tc.web.task_3_2.dao;

import java.util.List;

import by.tc.web.task_3_2.domain.Person;

public interface PersonDAO {

	List<Person> searchPerson(String name, String surname) throws DAOException;
}
