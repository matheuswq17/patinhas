package com.voltz.patinhascompany.dao;

import com.voltz.patinhascompany.models.Usuario;
import com.voltz.patinhascompany.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class NotificacaoDao {
    private Connection conexao;

    public NotificacaoDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void fecharConexao() throws SQLException{
        conexao.close();
    }

    public void cadastrar(){}
    public List<Notificacao>listar(){return null;}
    public void atualizar(){}
    public void remover(){}

}
