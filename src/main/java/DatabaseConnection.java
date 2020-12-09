import java.sql.*;

class DatabaseConnection{
    static String CLASS_FOR_NAME = "com.mysql.jdbc.Driver";
    static String URL = "jdbc:mysql://localhost:3306/demoshop";
    static String USER = "root";
    static String PASSWORD = "";


    public static void main(String args[]){

        try{
            Class.forName(CLASS_FOR_NAME);

            System.out.println("Trying to connect to the database...");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD); //Establishing the connection with database
            System.out.println("Connection established successfully.");

            System.out.println("The database product name is " + con.getMetaData().getDatabaseProductName()); // It should get value "MySQL"

            con.close(); //Closing the connection

        }catch(Exception e){

            System.out.println("Failed to make connection with the database.");
            System.out.println(e);

        }
    }
}  