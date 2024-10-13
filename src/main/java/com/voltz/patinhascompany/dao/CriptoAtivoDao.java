package com.voltz.patinhascompany.dao;

import com.voltz.patinhascompany.models.CriptoAtivo;
import com.voltz.patinhascompany.models.Empresa;
import com.voltz.patinhascompany.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CriptoAtivoDao {

    public void inserir(CriptoAtivo criptoAtivo) {
        String sql = "INSERT INTO cripto_ativo (nome, codigo, preco, empresa_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, criptoAtivo.getNome());
            stmt.setString(2, criptoAtivo.getCodigo());
            stmt.setDouble(3, criptoAtivo.getPreco());
            stmt.setInt(4, criptoAtivo.getEmpresa().getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<CriptoAtivo> listarTodos() {
        List<CriptoAtivo> criptoAtivos = new ArrayList<>();
        String sql = "SELECT * FROM cripto_ativo";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                CriptoAtivo criptoAtivo = new CriptoAtivo();
                criptoAtivo.setId(rs.getInt("id"));
                criptoAtivo.setNome(rs.getString("nome"));
                criptoAtivo.setCodigo(rs.getString("codigo"));
                criptoAtivo.setPreco(rs.getDouble("preco"));
                // Aqui você precisará obter a empresa associada
                criptoAtivos.add(criptoAtivo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return criptoAtivos;
    }

    public void atualizar(CriptoAtivo criptoAtivo) {
        String sql = "UPDATE cripto_ativo SET nome = ?, codigo = ?, preco = ? WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, criptoAtivo.getNome());
            stmt.setString(2, criptoAtivo.getCodigo());
            stmt.setDouble(3, criptoAtivo.getPreco());
            stmt.setInt(4, criptoAtivo.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM cripto_ativo WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
