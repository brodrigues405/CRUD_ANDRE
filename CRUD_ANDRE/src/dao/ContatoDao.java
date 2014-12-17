package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Contato;
import util.ConnectionSingleton;

public class ContatoDao {
	
	private Connection conn;
	private PreparedStatement stmt;
	
	public ContatoDao() {
		this.conn = contatoDaoSingleton();
	}
	
	
	public boolean inserirContato(Contato contato){
		
		boolean r = false;
		
		String insert = "INSERT INTO HR.CONTATO VALUES(HR.CONTOSEC.NEXTVAL,?,?,?,?,?)";
		try {
			this.stmt = this.conn.prepareStatement(insert);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getCpf());
			stmt.setInt(3, contato.getIdade());
			stmt.setString(4, contato.getTelefone());
			stmt.setString(5, contato.getEmail());
			
			stmt.execute();
			r = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				this.conn.close();
				this.stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return r;
	}
	
	
	
	
	
	
	
	
	
	private Connection contatoDaoSingleton(){
		if(this.conn == null){
			this.conn = ConnectionSingleton.getConnection();
		}
		return this.conn;
	}
	
	/**
	 * create table hr.contato(
       cod number,
       mome varchar2(50),
       cpf varchar2(14),
       idade number,
       telefone varchar2(20),
       email varchar2(100),
       constraint contato_pk primary key (cod));

		create sequence hr.contoSec start with 100 increment by 1 maxvalue 9999 minvalue 100;
		select hr.contosec.nextval from dual;
		select * from hr.contato;
	 */
	
}
