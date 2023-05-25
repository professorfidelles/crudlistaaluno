package controller;
import model.Aluno;
import model.Conexao;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class AlunoDAO {
	
	Connection conn = null;
	String sql = "";
	Statement st;
	PreparedStatement stm;
	
	ResultSet resultado;
	ArrayList<Aluno> lista = new ArrayList<Aluno>();
	
	public ArrayList<Aluno> listarAluno(){
		sql =  "SELECT * FROM tb_aluno";
		
		try {
			Conexao connection =  new Conexao();
			conn = connection.getConexao();
			resultado = conn.createStatement().executeQuery(sql);
			
			while(resultado.next()) {
				Aluno listar =  new Aluno();
				listar.setId_matricula(resultado.getInt("id_matricula"));
				listar.setNome(resultado.getString("nome"));
				listar.setCpf(resultado.getString("cpf"));
				listar.setTelefone(resultado.getString("telefone"));
				listar.setEmail(resultado.getString("email"));
				lista.add(listar);
			}
		} catch (Exception error1) {
			System.out.println("Erro ao listar" +error1);
		}
		
		return lista;
	}
	
	public void insert(Aluno aluno) {
		sql = "INSERT INTO tb_aluno(nome ,cpf ,telefone, email ) VALUES(? , ? , ? , ? )";
		try {
			Conexao connection =  new Conexao();
			conn = connection.getConexao();
			stm =  conn.prepareStatement(sql);
			stm.setString(1, aluno.getNome());
			stm.setString(2, aluno.getCpf());
			stm.setString(3, aluno.getTelefone());
			stm.setString(4, aluno.getEmail());
			stm.execute();
			stm.close();
		} catch (Exception error2) {
			System.out.println("Erro de insert "+error2);
		}
	}
	public void alterar(Aluno aluno) {
		sql = "UPDATE tb_aluno set nome = ? ,cpf =? ,telefone =?, email = ? WHERE id_matricula = ? ";
		try {
			Conexao connection =  new Conexao();
			conn = connection.getConexao();
			stm =  conn.prepareStatement(sql);
			stm.setString(1, aluno.getNome());
			stm.setString(2, aluno.getCpf());
			stm.setString(3, aluno.getTelefone());
			stm.setString(4, aluno.getEmail());
			stm.setInt(5, aluno.getId_matricula());
			stm.execute();
			stm.close();
		} catch (Exception error3) {
			System.out.println("Erro de atualização "+error3);
		}
	}
	public void deletar(int id) {
		sql = "DELETE FROM tb_aluno WHERE id_matricula="+id;
		try {
			Conexao connection =  new Conexao();
			conn = connection.getConexao();
			
			st = conn.createStatement();
			st.execute(sql);
			st.close();
		} catch (Exception error4) {
			// TODO: handle exception
			System.out.println("Erro ao deletar" +error4);
		}
	}
}
