package com.voltz.patinhascompany.models;

import java.util.Date;

public class Transacao {
    private int id;
    private String tipo; // "compra" ou "venda"
    private double montante;
    private Date data;
    private ContaInvestimento origem;
    private ContaInvestimento destino;

    public Transacao(String tipo, double montante, ContaInvestimento origem, ContaInvestimento destino) {
        this.tipo = tipo;
        this.montante = montante;
        this.origem = origem;
        this.destino = destino;
        this.data = new Date();
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    public Date getData() {
        return data;
    }

    public ContaInvestimento getOrigem() {
        return origem;
    }

    public void setOrigem(ContaInvestimento origem) {
        this.origem = origem;
    }

    public ContaInvestimento getDestino() {
        return destino;
    }

    public void setDestino(ContaInvestimento destino) {
        this.destino = destino;
    }

    // Método de Negócio
    public boolean executarTransacao() {
        if (tipo.equalsIgnoreCase("compra")) {
            origem.retirarSaldo(montante);
            destino.adicionarSaldo(montante);
            return true;
        } else if (tipo.equalsIgnoreCase("venda")) {
            destino.retirarSaldo(montante);
            origem.adicionarSaldo(montante);
            return true;
        }
        return false;
    }
}
