package com.voltz.patinhascompany.models;

import java.util.ArrayList;
import java.util.List;

public class Carteira {
    private int id;
    private String nome;
    private List<Investimento> investimentos = new ArrayList<>();

    // Construtores, getters e setters
    public Carteira() {}

    public Carteira(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarInvestimento(Investimento investimento) {
        this.investimentos.add(investimento);
    }

    public double calcularValorTotalInvestido() {
        double total = 0.0;
        for (Investimento investimento : investimentos) {
            total += investimento.getValor();
        }
        return total;
    }
}
