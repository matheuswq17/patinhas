package com.voltz.patinhascompany.models;

public class CriptoAtivo {
    private int id;
    private String nome;
    private String codigo;  // Ex: "BTC", "ETH"
    private double precoAtual;
    private Empresa empresa;

    public CriptoAtivo(String nome, String codigo, double precoAtual, Empresa empresa) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoAtual = precoAtual;
        this.empresa = empresa;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(double precoAtual) {
        this.precoAtual = precoAtual;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    // Método de Negócio
    public void atualizarPreco(double novoPreco) {
        this.precoAtual = novoPreco;
    }
}
