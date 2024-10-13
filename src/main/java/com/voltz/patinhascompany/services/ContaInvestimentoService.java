package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.dao.ContaInvestimentoDao;
import com.voltz.patinhascompany.models.ContaInvestimento;
import com.voltz.patinhascompany.models.Usuario;

public class ContaInvestimentoService {
    private ContaInvestimentoDao contaInvestimentoDao = new ContaInvestimentoDao();

    public ContaInvestimento criarConta(String numeroConta, String tipoMoeda, Usuario usuario) {
        ContaInvestimento conta = new ContaInvestimento(numeroConta, tipoMoeda, usuario);
        contaInvestimentoDao.inserir(conta);
        return conta;
    }

    public void adicionarSaldo(ContaInvestimento conta, double valor) {
        conta.adicionarSaldo(valor);
        contaInvestimentoDao.atualizar(conta);
    }
}
