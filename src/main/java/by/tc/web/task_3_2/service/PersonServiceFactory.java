package by.tc.web.task_3_2.service;

import by.tc.web.task_3_2.service.impl.PersonServiceImpl;

public final class PersonServiceFactory {

	private final static PersonServiceFactory serviceFactory = new PersonServiceFactory();
	private final PersonService personService = new PersonServiceImpl();

	private PersonServiceFactory() {

	}

	public static PersonServiceFactory getInstance() {
		return serviceFactory;
	}

	public PersonService getPersonService() {
		return personService;
	}

}
