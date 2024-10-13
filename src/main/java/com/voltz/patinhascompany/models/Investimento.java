package com.voltz.patinhascompany.models;

public class Investimento {
    private int id;
    private String nome;
    private double valor;
    private CriptoAtivo criptoAtivo;
    private Carteira carteira;
    private ContaInvestimento contaInvestimento;
    private Usuario usuario;

    // Construtores, getters e setters
    public Investimento() {}

    public Investimento(double valor, CriptoAtivo criptoAtivo, Carteira carteira, ContaInvestimento contaInvestimento, Usuario usuario) {
        this.valor = valor;
        this.criptoAtivo = criptoAtivo;
        this.carteira = carteira;
        this.contaInvestimento = contaInvestimento;
        this.usuario = usuario;
        this.nome = criptoAtivo.getNome();
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public CriptoAtivo getCriptoAtivo() {
        return criptoAtivo;
    }

    public void setCriptoAtivo(CriptoAtivo criptoAtivo) {
        this.criptoAtivo = criptoAtivo;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public ContaInvestimento getContaInvestimento() {
        return contaInvestimento;
    }

    public void setContaInvestimento(ContaInvestimento contaInvestimento) {
        this.contaInvestimento = contaInvestimento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void realizarInvestimento() {
        carteira.adicionarInvestimento(this);
        contaInvestimento.adicionarSaldo(-valor);
    }
}
