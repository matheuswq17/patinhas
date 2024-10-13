package com.voltz.patinhascompany.dao;

import com.voltz.patinhascompany.models.Notificacao;
import com.voltz.patinhascompany.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NotificacaoDao {

    public void inserir(Notificacao notificacao) {
        String sql = "INSERT INTO notificacao (mensagem) VALUES (?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, notificacao.getMensagem());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Notificacao> listarTodos() {
        List<Notificacao> notificacoes = new ArrayList<>();
        String sql = "SELECT * FROM notificacao";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Notificacao notificacao = new Notificacao();
                notificacao.setId(rs.getInt("id"));
                notificacao.setMensagem(rs.getString("mensagem"));
                notificacoes.add(notificacao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return notificacoes;
    }

    public void atualizar(Notificacao notificacao) {
        String sql = "UPDATE notificacao SET mensagem = ? WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, notificacao.getMensagem());
            stmt.setInt(2, notificacao.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM notificacao WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}