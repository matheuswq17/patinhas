package main.java.com.voltz.patinhascompany.models;

public class ContaInvestimento {
    private int id;
    private String numeroConta;
    private double saldo;
    private String tipoMoeda;  // Ex: "USD", "BTC"
    private Usuario usuario;

    public ContaInvestimento(String numeroConta, String tipoMoeda, Usuario usuario) {
        this.numeroConta = numeroConta;
        this.tipoMoeda = tipoMoeda;
        this.usuario = usuario;
        this.saldo = 0.0; // Saldo inicial é zero
    }

    // Getters e Setters
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Métodos de Negócio
    public void adicionarSaldo(double valor) {
        this.saldo += valor;
    }

    public void retirarSaldo(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
