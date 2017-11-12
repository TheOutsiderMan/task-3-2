package by.tc.web.task_3_2.dao.mysql;

import by.tc.web.task_3_2.dao.mysql.impl.MySQLDAOImpl;

public final class MySQLDAOFactory {

	private static final MySQLDAOFactory MySQLDAOInstance = new MySQLDAOFactory();
	private final MySQLDAO sqldao = new MySQLDAOImpl();

	private MySQLDAOFactory() {

	}

	public static MySQLDAOFactory getInstance() {
		return MySQLDAOInstance;
	}

	public MySQLDAO getMySQLDAO() {
		return sqldao;
	}
}
