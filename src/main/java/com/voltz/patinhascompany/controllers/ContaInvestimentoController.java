package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.services.ContaInvestimentoService;
import com.voltz.patinhascompany.models.ContaInvestimento;

import java.util.List;
import java.util.Scanner; // Caso use entradas de usuário


public class ContaInvestimentoController {
    private ContaInvestimentoService contaService = new ContaInvestimentoService();

    public ContaInvestimento criarConta(String numeroConta, String tipoMoeda, Usuario usuario) {
        return contaService.criarConta(numeroConta, tipoMoeda, usuario);
    }

    public void adicionarSaldo(ContaInvestimento conta, double valor) {
        contaService.adicionarSaldo(conta, valor);
    }
}
