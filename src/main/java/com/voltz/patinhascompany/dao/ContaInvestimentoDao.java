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
        String sql = "INSERT INTO conta_investimento (numero_conta, tipo_moeda, usuario_id, saldo) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, contaInvestimento.getNumeroConta());
            stmt.setString(2, contaInvestimento.getTipoMoeda());
            stmt.setInt(3, contaInvestimento.getUsuario().getId());
            stmt.setDouble(4, contaInvestimento.getSaldo());
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
                conta.setNumeroConta(rs.getString("numero_conta"));
                conta.setTipoMoeda(rs.getString("tipo_moeda"));
                conta.setSaldo(rs.getDouble("saldo"));
                // Aqui você precisará obter o usuário associado
                contas.add(conta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contas;
    }

    public void atualizar(ContaInvestimento contaInvestimento) {
        String sql = "UPDATE conta_investimento SET numero_conta = ?, tipo_moeda = ?, saldo = ? WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, contaInvestimento.getNumeroConta());
            stmt.setString(2, contaInvestimento.getTipoMoeda());
            stmt.setDouble(3, contaInvestimento.getSaldo());
            stmt.setInt(4, contaInvestimento.getId());
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
