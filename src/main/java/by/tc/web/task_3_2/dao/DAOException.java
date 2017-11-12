package by.tc.web.task_3_2.dao;

public class DAOException extends Exception {

	private static final long serialVersionUID = -1830532077847026706L;

	public DAOException() {
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Throwable cause) {
		super(cause);
	}

	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

}
