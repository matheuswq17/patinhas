package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.services.CriptoAtivoService;
import com.voltz.patinhascompany.models.CriptoAtivo;
import com.voltz.patinhascompany.models.Empresa;

public class CriptoAtivoController {
    private CriptoAtivoService criptoAtivoService = new CriptoAtivoService();

    public CriptoAtivo criarCriptoAtivo(String nome, String codigo, double preco, Empresa empresa) {
        if (nome == null || codigo == null || preco <= 0 || empresa == null) {
            throw new IllegalArgumentException("Parâmetros inválidos para criar criptoativo.");
        }
        return criptoAtivoService.criarCriptoAtivo(nome, codigo, preco, empresa);
    }
}
