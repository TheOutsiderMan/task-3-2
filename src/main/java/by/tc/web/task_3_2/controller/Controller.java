package by.tc.web.task_3_2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.tc.web.task_3_2.domain.Person;
import by.tc.web.task_3_2.service.PersonService;
import by.tc.web.task_3_2.service.PersonServiceFactory;
import by.tc.web.task_3_2.service.ServiceException;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String name = request.getParameter("name");// неименованные константные строки
		String surname = request.getParameter("surname");

		PersonServiceFactory serviceFactory = PersonServiceFactory.getInstance();
		PersonService personService = serviceFactory.getPersonService();
		List<Person> personList = null;
		try {
			personList = personService.searchPerson(name, surname);
		} catch (ServiceException e) {
			response.sendError(404);
		}
		if ((personList == null) || personList.isEmpty()) {
			request.setAttribute("match", Boolean.FALSE);
		} else {
			request.setAttribute("persons", personList);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Result.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
