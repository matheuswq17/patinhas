package main.java.com.voltz.patinhascompany.services;

import main.java.com.voltz.patinhascompany.models.CriptoAtivo;
import main.java.com.voltz.patinhascompany.models.Transacao;
import main.java.com.voltz.patinhascompany.models.ContaInvestimento;

public class TransacaoService {

    public boolean executarTransacao(String tipo, double montante, ContaInvestimento origem, ContaInvestimento destino, CriptoAtivo criptoativo) {
        Transacao transacao = new Transacao(tipo, montante, origem, destino, criptoativo);
        return transacao.executarTransacao();
    }
}
