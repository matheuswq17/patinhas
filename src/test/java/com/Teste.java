package com;

import com.voltz.patinhascompany.models.*;

public class Teste {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João Silva", "joao.silva@example.com", "senha123");
        Usuario usuario2 = new Usuario("Maria Oliveira", "maria.oliveira@example.com", "senha456");

        Empresa empresa1 = new Empresa("Voltz Inc.");
        Empresa empresa2 = new Empresa("Patinhas Company");

        CriptoAtivo criptoAtivo1 = new CriptoAtivo("Bitcoin", "BTC", 50000.0, empresa1);
        CriptoAtivo criptoAtivo2 = new CriptoAtivo("Ethereum", "ETH", 3000.0, empresa2);

        ContaInvestimento conta1 = new ContaInvestimento("12345", "USD", usuario1);
        ContaInvestimento conta2 = new ContaInvestimento("67890", "BTC", usuario2);

        Investimento investimento1 = new Investimento(1000.0, criptoAtivo1, usuario1.getCarteira(), conta1, usuario1);
        Investimento investimento2 = new Investimento(500.0, criptoAtivo2, usuario2.getCarteira(), conta2, usuario2);

        investimento1.realizarInvestimento();
        investimento2.realizarInvestimento();

        System.out.println("Saldo Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2: " + conta2.getSaldo());

        System.out.println("Valor Total Investido pelo Usuário 1: " + usuario1.getCarteira().calcularValorTotalInvestido());
        System.out.println("Valor Total Investido pelo Usuário 2: " + usuario2.getCarteira().calcularValorTotalInvestido());
    }
}
