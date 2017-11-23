package by.tc.web.task_3_2.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.tc.web.task_3_2.dao.DAOException;
import by.tc.web.task_3_2.dao.DAOFactory;
import by.tc.web.task_3_2.dao.PersonDAO;
import by.tc.web.task_3_2.domain.Person;
import by.tc.web.task_3_2.service.PersonService;
import by.tc.web.task_3_2.service.ServiceException;

public class PersonServiceImpl implements PersonService {

	public List<Person> searchPerson(String name, String surname) throws ServiceException {
		// куда делась валидация данных в сервисе?
		DAOFactory daoFactory = DAOFactory.getInstance();
		PersonDAO personDAO = daoFactory.getPersonMySQLDAO();
		List<Person> persons = null;
		try {
			persons = personDAO.searchPerson(name, surname);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		if (persons == null) {// лишняя проверка, пустоя ArrayList должен возвращать SearchPerson , если ничего не нашел
			persons = new ArrayList<Person>();
		}
		return persons;
	}

}
