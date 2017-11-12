package by.tc.web.task_3_2.service;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -5039435405381822381L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

}
