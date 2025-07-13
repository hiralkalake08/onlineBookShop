package com.bookshop;
import java.sql.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;

		String url = "jdbc:postgresql://localhost:5432/online_bookshop";
		String user = "postgres";
		String pass = "hiralkalake@123"; 

		try {
		    con = DriverManager.getConnection(url, user, pass);
		    System.out.println("✅ Connected to DB and program is running.");

		    boolean running = true;

		    while (running) {
		        System.out.println("\n--- Online Book Shop ---");
		        System.out.println("1. Register");
		        System.out.println("2. Login");
		        System.out.println("3. Exit");
		        System.out.print("Enter choice: ");

		        String choice = sc.nextLine().trim();

		        try {
		            int ch = Integer.parseInt(choice);
		            switch (ch) {
		                case 1:
		                    System.out.print("Enter username: ");
		                    String uname = sc.nextLine();
		                    System.out.print("Enter password: ");
		                    String pwd = sc.nextLine();

		                    String q = "INSERT INTO users (username, password) VALUES (?, ?)";
		                    PreparedStatement pst = con.prepareStatement(q);
		                    pst.setString(1, uname);
		                    pst.setString(2, pwd);
		                    int rows = pst.executeUpdate();
		                    System.out.println(rows + " user registered.");
		                    break;

		                case 2:
		                    System.out.print("Enter username: ");
		                    String unameL = sc.nextLine();
		                    System.out.print("Enter password: ");
		                    String pwdL = sc.nextLine();

		                    String q2 = "SELECT * FROM users WHERE username = ? AND password = ?";
		                    PreparedStatement pst2 = con.prepareStatement(q2);
		                    pst2.setString(1, unameL);
		                    pst2.setString(2, pwdL);
		                    ResultSet rs = pst2.executeQuery();

		                    if (rs.next()) {
		                        System.out.println("✅ Login successful!");
		                    } else {
		                        System.out.println("❌ Invalid credentials.");
		                    }
		                    break;

		                case 3:
		                    running = false;
		                    System.out.println(" Exiting...");
		                    break;

		                default:
		                    System.out.println("Invalid choice.");
		            }
		        } catch (NumberFormatException e) {
		            System.out.println("⚠️ Please enter a valid number.");
		        }
		    }
		} catch (Exception e) {
		    System.out.println("❌ Error: " + e);
		} finally {
		    try {
		        if (con != null) con.close();
		        sc.close();
		    } catch (Exception e) {
		        System.out.println("❌ Closing error: " + e);
		    }
		}

	}

}
