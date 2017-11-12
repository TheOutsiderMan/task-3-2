package by.tc.web.task_3_2.dao.mysql;

import java.sql.Connection;

import by.tc.web.task_3_2.dao.PersonDAO;
import by.tc.web.task_3_2.dao.mysql.impl.MySQLDAOConnectionException;

public interface MySQLDAO extends PersonDAO {

	Connection getConnection() throws MySQLDAOConnectionException;
}
