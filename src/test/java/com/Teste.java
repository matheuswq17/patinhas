package test.java.com;

import main.java.com.voltz.patinhascompany.models.Usuario;
import main.java.com.voltz.patinhascompany.models.Empresa;
import main.java.com.voltz.patinhascompany.models.CriptoAtivo;
import main.java.com.voltz.patinhascompany.models.ContaInvestimento;
import main.java.com.voltz.patinhascompany.models.Investimento;
import main.java.com.voltz.patinhascompany.models.Transacao;
import main.java.com.voltz.patinhascompany.models.Notificacao;



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

      
        Investimento investimento1 = new Investimento(1000.0, criptoAtivo1, usuario1.getCarteira(), conta1, usuario1 );
        Investimento investimento2 = new Investimento(500.0, criptoAtivo2, usuario2.getCarteira(), conta2, usuario2 );

      
        investimento1.realizarInvestimento();
        investimento2.realizarInvestimento();

       
        Transacao transacao1 = new Transacao("compra", 200.0, conta1, conta2, criptoAtivo1);
        Transacao transacao2 = new Transacao("venda", 100.0, conta2, conta1, criptoAtivo2);

    
        Notificacao notificacao1 = new Notificacao("Seu investimento foi realizado com sucesso.", usuario1);
        Notificacao notificacao2 = new Notificacao("Nova transação concluída.", usuario2);

       
        notificacao1.enviar();
        notificacao2.enviar();

      
        System.out.println("Saldo Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2: " + conta2.getSaldo());

       
        System.out.println("Valor Total Investido pelo Usuário 1: " + usuario1.getCarteira().calcularValorTotalInvestido());
        System.out.println("Valor Total Investido pelo Usuário 2: " + usuario2.getCarteira().calcularValorTotalInvestido());
    }
}
