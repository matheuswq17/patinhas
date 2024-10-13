package com.voltz.patinhascompany.dao;

import com.voltz.patinhascompany.models.Investimento;
import com.voltz.patinhascompany.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InvestimentoDao {

    public void inserir(Investimento investimento) {
        String sql = "INSERT INTO investimento (nome, valor) VALUES (?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, investimento.getNome());
            stmt.setDouble(2, investimento.getValor());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Investimento> listarTodos() {
        List<Investimento> investimentos = new ArrayList<>();
        String sql = "SELECT * FROM investimento";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Investimento investimento = new Investimento();
                investimento.setId(rs.getInt("id"));
                investimento.setNome(rs.getString("nome"));
                investimento.setValor(rs.getDouble("valor"));
                investimentos.add(investimento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return investimentos;
    }

    public void atualizar(Investimento investimento) {
        String sql = "UPDATE investimento SET nome = ?, valor = ? WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, investimento.getNome());
            stmt.setDouble(2, investimento.getValor());
            stmt.setInt(3, investimento.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM investimento WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
