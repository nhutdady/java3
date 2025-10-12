package poly.com.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connectdao
{
protected static Connection conn;
public Connectdao() {
	try {
		String url = "jdbc:splsever://localhost:1433;databaseName=lab_java3";
		Class.forName("com.microsoft.sqlsever.jdbc.SQLSeverDriver");
		conn = DriverManager.getConnection(url,"sa","123");
		System.out.println("kết nối thành công!");
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
}
}
