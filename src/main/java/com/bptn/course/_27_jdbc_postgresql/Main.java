package com.bptn.course._27_jdbc_postgresql;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		// ToDoListClass jdbc = new ToDoListClass();
		// StudentAppClass jdbc = new StudentAppClass();
		FeedAppClass jdbc = new FeedAppClass();
		Connection conn = jdbc.createConnection();
		// jdbc.getAllStudents(conn);
		// jdbc.getStudentById(conn, 2);
		// jdbc.addStudent(conn, 1, "lea", "lea@email.fr", "123467890");
		// jdbc.addStudent(conn, 3, "Bob Smith", "smith@example.com", "123493");

		/*
		 * jdbc.getAllUsers(conn); jdbc.getTaskByDate(conn,
		 * "2024-10-29 09:22:20.655704");
		 */
		// jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com",
		// "Ray@22", true);
		jdbc.getAllUser(conn);
		jdbc.closeConnection(conn);

	}

}
