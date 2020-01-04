import java.sql.*;
import java.util.Properties;

public class Main {
    private Connection connection;

    public Main() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost/EmployeesDB";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "admin");
        this.connection = DriverManager.getConnection(url, props);
    }

    private void SelectStatement() throws SQLException {
        Statement statement = connection.createStatement();
        for (int i = 0; i < 10; i++) {
            statement.execute("INSERT INTO employee(NAME, POSITION,PHONE) VALUES (1, 2, '0677439596')");
        }
        statement.close();
    }

    private void SelectResultSet() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String position = resultSet.getString("position");
            String phone = resultSet.getString("phone");
            System.out.printf("ID = %d Name = %s Position = %s Phone = %s", id, name, position, phone);
            System.out.println();
        }

        statement.close();
    }

    private void UpdateStatement() throws SQLException {
        Statement statement = connection.createStatement();
        int upd = statement.executeUpdate("UPDATE employee SET NAME = 'SERHII' WHERE POSITION = '2'");
        System.out.println("update count = " + upd);
        statement.close();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Main main = new Main();

        //main.SelectStatement();

        main.SelectResultSet();

        main.UpdateStatement();

    }
}
