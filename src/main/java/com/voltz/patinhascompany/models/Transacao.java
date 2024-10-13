package com.voltz.patinhascompany.models;

public class Transacao {
    private int id;
    private String tipo;
    private double valor;
    private ContaInvestimento origem;
    private ContaInvestimento destino;
    private CriptoAtivo criptoAtivo;

    // Construtor vazio
    public Transacao() {
    }

    // Construtor completo
    public Transacao(String tipo, double valor, ContaInvestimento origem, ContaInvestimento destino, CriptoAtivo criptoAtivo) {
        this.tipo = tipo;
        this.valor = valor;
        this.origem = origem;
        this.destino = destino;
        this.criptoAtivo = criptoAtivo;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public CriptoAtivo getCriptoAtivo() {
        return criptoAtivo;
    }

    public void setCriptoAtivo(CriptoAtivo criptoAtivo) {
        this.criptoAtivo = criptoAtivo;
    }

    public boolean executarTransacao() {
        if (origem != null && valor <= origem.getSaldo()) {
            origem.adicionarSaldo(-valor);
            destino.adicionarSaldo(valor);
            System.out.println("Transação de " + tipo + " executada com sucesso!");
            return true;
        } else {
            System.out.println("Falha na transação: saldo insuficiente.");
            return false;
        }
    }
}
