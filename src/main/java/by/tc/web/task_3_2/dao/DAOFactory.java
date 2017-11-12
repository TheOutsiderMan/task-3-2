package by.tc.web.task_3_2.dao;

import by.tc.web.task_3_2.dao.mysql.MySQLDAOFactory;

public final class DAOFactory {

	private static final DAOFactory instance = new DAOFactory();
	private final PersonDAO personMySQLDAO = MySQLDAOFactory.getInstance().getMySQLDAO();

	private DAOFactory() {

	}

	public static DAOFactory getInstance() {
		return instance;
	}

	public PersonDAO getPersonMySQLDAO() {
		return personMySQLDAO;
	}
}
