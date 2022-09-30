import java.sql.*;
public class MySqlCon {

    public static void main(String[] args) {

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/emp_dept", "root", "DevRoot2022$")) {
            if (conn != null) {
                System.out.println("Connected to the database");
            }else {
                System.out.println("Failed to make connection!");
            }

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from emp");
            while(resultSet.next())
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
