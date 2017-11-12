package by.tc.web.task_3_2.dao.mysql.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.tc.web.task_3_2.dao.mysql.MySQLDAO;
import by.tc.web.task_3_2.dao.mysql.MySQLDAOException;
import by.tc.web.task_3_2.domain.Person;

public class MySQLDAOImpl implements MySQLDAO {

	public List<Person> searchPerson(String name, String surname) throws MySQLDAOException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		List<Person> personList = new ArrayList<Person>();
		try {
			connection = this.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM persons");
			while (resultSet.next()) {
				String DBname = resultSet.getString("pers_name");
				String DBsurname = resultSet.getString("pers_surname");
				if (name.equalsIgnoreCase(DBname) && surname.equalsIgnoreCase(DBsurname)) {
					Person person = new Person();
					person.setName(DBname);
					person.setSurname(DBsurname);
					person.setPhoneNumber(resultSet.getString("pers_phone_number"));
					person.setEmail(resultSet.getString("pers_email"));
					personList.add(person);
				}
			}
		} catch (MySQLDAOConnectionException e) {
			throw new MySQLDAOException(e);
		} catch (SQLException e) {
			throw new MySQLDAOException(e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new MySQLDAOException(e);
			}
		}
		return personList;
	}

	public Connection getConnection() throws MySQLDAOConnectionException {
		return MySQlConnection.getConnection();
	}

}
