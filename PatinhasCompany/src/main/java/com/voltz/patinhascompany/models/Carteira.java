package com.voltz.patinhascompany.models;

import java.util.ArrayList;
import java.util.List;

public class Carteira {
    private int id;
    private Usuario usuario;
    private List<Investimento> investimentos;

    public Carteira(Usuario usuario) {
        this.usuario = usuario;
        this.investimentos = new ArrayList<>();
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

    public double calcularValorTotalInvestido() {
        double total = 0.0;
        for (Investimento investimento : investimentos) {
            total += investimento.getMontante();
        }
        return total;
    }
}
