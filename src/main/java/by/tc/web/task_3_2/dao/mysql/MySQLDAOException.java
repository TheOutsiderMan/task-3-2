package by.tc.web.task_3_2.dao.mysql;

import by.tc.web.task_3_2.dao.DAOException;

public class MySQLDAOException extends DAOException {

	private static final long serialVersionUID = -4552043594629779392L;

	public MySQLDAOException() {
		super();
	}

	public MySQLDAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public MySQLDAOException(String message) {
		super(message);
	}

	public MySQLDAOException(Throwable cause) {
		super(cause);
	}

}
