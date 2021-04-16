package utilities;

import cucumber.api.java.it.Ma;
import org.junit.Assert;

import java.sql.*;
import java.util.*;

public class DBUtils {

    private static Connection connection;
    private static Statement statement;
    private static final String JDBC_URL
            = "jdbc:mysql://3.131.35.165:3306/digitalbank?user=dbank&password=MyCOMPleaxPasSW0rd!12X";
    public static void open() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(JDBC_URL);
                statement = connection.createStatement();
            }
        } catch (SQLException e) {
            e.printStackTrace();
//            Assert.fail("Can't establish the connection to the DB");
        }
    }

    public static void close() {
        try {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
            connection = null;
            statement = null;

        } catch (SQLException e) {
            e.printStackTrace();
            Assert.fail("Can't close the connection to the DB");
        }
    }

    public static List<String> getColumnNames(ResultSet rs) {
        List<String> columnNames = new ArrayList<>();
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaData.getColumnName(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());

        }
        return columnNames;
    }

    public static ResultSet query(String query) {
        if (connection == null) open();
        try {
            return statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
            Assert.fail("Not able to execute a query");

        }
        return null;
    }

    public static List<Map<String, Object>> convertResultSet(ResultSet rs) {
        List<Map<String, Object>> table = new ArrayList<>();
        List<String> columnNames = getColumnNames(rs);

        while (true) {
            Map<String, Object> row = new LinkedHashMap<String, Object>();
            try {
                if (!rs.next()) break;
                for (String columnName : columnNames) {
                    row.put(columnName, rs.getObject(columnName));
                }
                table.add(row);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return table;
        }
    }





