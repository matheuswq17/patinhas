package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.models.ContaInvestimento;
import com.voltz.patinhascompany.models.Usuario;

public class ContaInvestimentoService {

    public ContaInvestimento criarConta(String numeroConta, String tipoMoeda, Usuario usuario) {
        return new ContaInvestimento(numeroConta, tipoMoeda, usuario);
    }

    public void adicionarSaldo(ContaInvestimento conta, double valor) {
        conta.adicionarSaldo(valor);
    }
}
