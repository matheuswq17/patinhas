package main.java.com.voltz.patinhascompany.dao;

import main.java.com.voltz.patinhascompany.factory.ConnectionFactory;
import main.java.com.voltz.patinhascompany.models.Carteira;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CarteiraDao {
    private Connection conexao;

    public CarteiraDao() throws SQLException {
         conexao = ConnectionFactory.getConnection();
    }

    public void fecharConexao() throws SQLException{
        conexao.close();
    }

    public void cadastrar(){}
    public List<Carteira> listar(){
        return null;
    }
    public void atualizar(){}
    public void remover(){}





}
