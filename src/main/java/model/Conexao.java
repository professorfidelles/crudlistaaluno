package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
	
	public static Connection getConexao() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3307/dbaula" , "root", "");
			System.out.println("Conexão realizada com sucesso");
		} catch (ClassNotFoundException error1) {
			System.out.println("Drive não localizado "+error1);
		} catch (SQLException error2) {
			// TODO Auto-generated catch block
			System.out.println("Erro na Conexão "+error2);
		}
		return conn;
	}

}
