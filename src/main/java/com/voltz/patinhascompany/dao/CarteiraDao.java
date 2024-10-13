package com.voltz.patinhascompany.dao;

import com.voltz.patinhascompany.models.Carteira;
import com.voltz.patinhascompany.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarteiraDao {

    public void inserir(Carteira carteira) {
        String sql = "INSERT INTO carteira (nome) VALUES (?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, carteira.getNome());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Carteira> listarTodos() {
        List<Carteira> carteiras = new ArrayList<>();
        String sql = "SELECT * FROM carteira";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Carteira carteira = new Carteira();
                carteira.setId(rs.getInt("id"));
                carteira.setNome(rs.getString("nome"));
                carteiras.add(carteira);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carteiras;
    }

    public void atualizar(Carteira carteira) {
        String sql = "UPDATE carteira SET nome = ? WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, carteira.getNome());
            stmt.setInt(2, carteira.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM carteira WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}