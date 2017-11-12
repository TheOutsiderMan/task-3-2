package by.tc.web.task_3_2.dao.mysql.impl;

public class MySQLDAOConnectionException extends Exception {

	private static final long serialVersionUID = 396121284942612041L;

	public MySQLDAOConnectionException() {

	}

	public MySQLDAOConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

	public MySQLDAOConnectionException(String message) {
		super(message);
	}

	public MySQLDAOConnectionException(Throwable cause) {
		super(cause);
	}

}
