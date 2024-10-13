package main.java.com.voltz.patinhascompany.models;

import java.util.ArrayList;
import java.util.List;

public class Carteira {
    private int id;
    private Usuario usuario;
    private int quantidade;
    private List<Investimento> investimentos;

    public Carteira(Usuario usuario, int quantidade) {
        this.usuario = usuario;
        this.investimentos = new ArrayList<>();
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Investimento> getInvestimentos() {
        return investimentos;
    }

    // Métodos de Negócio
    public void adicionarInvestimento(Investimento investimento) {
        this.investimentos.add(investimento);
    }

    public void removerInvestimento(Investimento investimento) {
        this.investimentos.remove(investimento);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorTotalInvestido() {
        double total = 0.0;
        for (Investimento investimento : investimentos) {
            total += investimento.getMontante();
        }
        return total;
    }
}
