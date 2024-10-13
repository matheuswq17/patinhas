package com.voltz.patinhascompany.models;

import com.voltz.patinhascompany.models.Usuario;

public class ContaInvestimento {
    private int id;
    private String numeroConta;
    private String tipoMoeda;
    private double saldo;
    private Usuario usuario;

    // Construtor padrão
    public ContaInvestimento() {}

    // Construtor com parâmetros
    public ContaInvestimento(String numeroConta, String tipoMoeda, Usuario usuario) {
        this.numeroConta = numeroConta;
        this.tipoMoeda = tipoMoeda;
        this.usuario = usuario;
        this.saldo = 0.0;  // Saldo inicial é 0
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Método para adicionar saldo
    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }
}
