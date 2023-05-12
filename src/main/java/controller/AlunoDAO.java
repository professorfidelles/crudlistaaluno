package controller;
import model.Aluno;
import model.Conexao;
import java.util.ArrayList;
import java.sql.Connection;
public class AlunoDAO {
	
	Connection conn = null;
	String sql = "";
	public ArrayList<Aluno> listarAluno(){
		ArrayList<Aluno> listar = new ArrayList<Aluno>();
		
		return listar;
	}
}
