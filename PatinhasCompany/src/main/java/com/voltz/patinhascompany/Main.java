package com.voltz.patinhascompany;

import com.voltz.patinhascompany.models.*;

public class Main {
    public static void main(String[] args) {
        // Criar instância de um usuário
        Usuario usuario = new Usuario("João", "joao@example.com", "senha123");
        System.out.println("Usuário criado: " + usuario.getNome() + ", Email: " + usuario.getEmail());

        // Criar instância de uma empresa e de criptoativos
        Empresa empresa = new Empresa("Crypto Corp", "CRYPTO");
        CriptoAtivo bitcoin = new CriptoAtivo("Bitcoin", "BTC", 35000.0, empresa);
        CriptoAtivo ethereum = new CriptoAtivo("Ethereum", "ETH", 2000.0, empresa);
        empresa.adicionarCriptoAtivo(bitcoin);
        empresa.adicionarCriptoAtivo(ethereum);
        System.out.println("Empresa criada: " + empresa.getNome() + " com criptoativos: " + empresa.getCriptoativos().size());

        // Criar conta de investimento para o usuário
        ContaInvestimento conta = new ContaInvestimento("12345", "USD", usuario);
        conta.adicionarSaldo(10000);  // Adiciona saldo inicial
        System.out.println("Conta de investimento criada para " + usuario.getNome() + " com saldo: " + conta.getSaldo());

        // Realizar uma transação de compra de criptoativo
        Transacao transacaoCompra = new Transacao("compra", 5000, conta, conta);
        boolean sucessoCompra = transacaoCompra.executarTransacao();
        System.out.println("Transação de compra executada: " + sucessoCompra + ", Saldo atual da conta: " + conta.getSaldo());

        // Criar investimento em criptoativo
        Carteira carteira = usuario.getCarteira();
        Investimento investimento = new Investimento(2, bitcoin, carteira);  // Investir em 2 Bitcoins
        investimento.realizarInvestimento();
        System.out.println("Investimento realizado em " + investimento.getCriptoAtivo().getNome() + " com montante: " + investimento.getMontante());

        // Notificar o usuário
        Notificacao notificacao = new Notificacao("Seu investimento em Bitcoin foi realizado com sucesso!", usuario);
        notificacao.enviar();

        // Calcular valor total investido na carteira
        double totalInvestido = carteira.calcularValorTotalInvestido();
        System.out.println("Valor total investido na carteira de " + usuario.getNome() + ": " + totalInvestido);
    }
}
