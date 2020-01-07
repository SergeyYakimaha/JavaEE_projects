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

    private void selectStatement() throws SQLException {
        Statement statement = connection.createStatement();
        for (int i = 0; i < 10; i++) {
            statement.execute("INSERT INTO employee(NAME, POSITION,PHONE) VALUES (1, 2, '0677439596')");
        }
        statement.close();
    }

    private void selectResultSet() throws SQLException {
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

    private void updateStatement() throws SQLException {
        Statement statement = connection.createStatement();
        int upd = statement.executeUpdate("UPDATE employee SET NAME = 'SERHII' WHERE POSITION = '2'");
        System.out.println("update count = " + upd);
        statement.close();
    }

    public void batchCommand() throws SQLException {
        Statement statement = connection.createStatement();

        String command1 = "UPDATE fruit SET price = 50 WHERE price < 50"; // 3
        String command2 = "UPDATE fruit SET price = 10 WHERE name = 'Apple'"; // 1
        String command3 = "UPDATE fruit SET price = 100 WHERE price = 50"; // 2

        statement.addBatch(command1);
        statement.addBatch(command2);
        statement.addBatch(command3);

        int[] result = statement.executeBatch();

        for (int i: result) {
            System.out.println(i);
        }

        statement.close();
    }

    public void testJDBCTransactions() throws SQLException {
        Statement statement = connection.createStatement();
        String createTable = "CREATE TABLE fruit (name varchar(15) NOT NULL, amount INTEGER, price DOUBLE PRECISION NOT NULL, \n" +
                "\t\t\t\t   CONSTRAINT fruit_pkey PRIMARY KEY (name))";

        String command1 = "INSERT INTO fruit (name, amount, price) VALUES ('Apple', 200, 3.50)";
        String command2 = "INSERT INTO fruit (name, amount, price) VALUES ('Orange', 50, 5.50)";
        String command3 = "INSERT INTO fruit (name, amount, price) VALUES ('Lemon', 30, 5.50)";
        String command4 = "INSERT INTO fruit (name, amount, price) VALUES ('Pineapple', 20, 7.50)";

        connection.setAutoCommit(false);

        //statement.executeUpdate(createTable);
        statement.executeUpdate(command1);
        statement.executeUpdate(command2);
        statement.executeUpdate(command3);

        Savepoint savepoint = connection.setSavepoint();

        statement.executeUpdate(command4);
        //connection.rollback();
        connection.rollback(savepoint);
        connection.releaseSavepoint(savepoint);
        connection.commit();

        statement.close();
        connection.close();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Main main = new Main();

        //main.SelectStatement();
        //main.selectResultSet();
        //main.updateStatement();
        //main.testJDBCTransactions();

        main.batchCommand();

    }
}
