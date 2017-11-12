package by.tc.web.task_3_2.service;

import java.util.List;

import by.tc.web.task_3_2.domain.Person;

public interface PersonService {

	List<Person> searchPerson(String name, String surname) throws ServiceException;
}
