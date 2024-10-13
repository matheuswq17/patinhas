package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.dao.TransacaoDao;
import com.voltz.patinhascompany.models.ContaInvestimento;
import com.voltz.patinhascompany.models.CriptoAtivo;
import com.voltz.patinhascompany.models.Transacao;

public class TransacaoService {
    private TransacaoDao transacaoDao = new TransacaoDao();

    public boolean executarTransacao(String tipo, double montante, ContaInvestimento origem, ContaInvestimento destino, CriptoAtivo criptoativo) {
        Transacao transacao = new Transacao(tipo, montante, origem, destino, criptoativo);
        boolean sucesso = transacao.executarTransacao();
        if (sucesso) {
            transacaoDao.inserir(transacao);
        }
        return sucesso;
    }
}
