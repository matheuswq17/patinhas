package com.voltz.patinhascompany.dao;

import main.java.com.voltz.patinhascompany.factory.ConnectionFactory;
import main.java.com.voltz.patinhascompany.models.CriptoAtivo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CriptoAtivoDao {
    private Connection conexao;

    public CriptoAtivoDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void fecharConexao() throws SQLException{
        conexao.close();
    }

    public void cadastrar(){}
    public List<CriptoAtivo>listar(){return null;}
    public void atualizar(){}
    public void remover(){}

}
