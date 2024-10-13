package com.voltz.patinhascompany.dao;

import com.voltz.patinhascompany.models.ContaInvestimento;
import com.voltz.patinhascompany.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaInvestimentoDao {

    public void inserir(ContaInvestimento contaInvestimento) {
        String sql = "INSERT INTO conta_investimento (nome) VALUES (?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, contaInvestimento.getNome());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ContaInvestimento> listarTodos() {
        List<ContaInvestimento> contas = new ArrayList<>();
        String sql = "SELECT * FROM conta_investimento";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ContaInvestimento conta = new ContaInvestimento();
                conta.setId(rs.getInt("id"));
                conta.setNome(rs.getString("nome"));
                contas.add(conta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contas;
    }

    public void atualizar(ContaInvestimento contaInvestimento) {
        String sql = "UPDATE conta_investimento SET nome = ? WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, contaInvestimento.getNome());
            stmt.setInt(2, contaInvestimento.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM conta_investimento WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
