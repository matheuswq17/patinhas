package main.java.com.voltz.patinhascompany.models;

import java.util.Date;

public class Investimento {
    private int id;
    private Date data;
    private double montante;
    private CriptoAtivo criptoAtivo;
    private Carteira carteira;

    private ContaInvestimento contaInvestimento;
    private Usuario usuario;

    public Investimento(double montante, CriptoAtivo criptoAtivo, Carteira carteira, ContaInvestimento contaInvestimento, Usuario usuario) {
        this.data = new Date();  // Define a data atual como padrão
        this.montante = montante;
        this.criptoAtivo = criptoAtivo;
        this.carteira = carteira;
        this.contaInvestimento = contaInvestimento;
        this.usuario = usuario;
    }

    // Getters e Setters
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
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

    // Método de Negócio
    public void realizarInvestimento() {
        carteira.adicionarInvestimento(this);
        System.out.println("Investimento realizado em " + criptoAtivo.getNome() + " no valor de " + montante);
    }
}
