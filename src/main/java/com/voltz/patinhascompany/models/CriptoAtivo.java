package com.voltz.patinhascompany.models;

public class CriptoAtivo {
    private int id;
    private String nome;
    private String codigo;
    private double preco;
    private Empresa empresa;

    // Construtor vazio
    public CriptoAtivo() {
    }

    // Construtor completo
    public CriptoAtivo(String nome, String codigo, double preco, Empresa empresa) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.empresa = empresa;
    }

    // Getters e Setters
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
