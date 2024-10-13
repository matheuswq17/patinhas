package com.voltz.patinhascompany.controllers;

import com.voltz.patinhascompany.models.CriptoAtivo;
import com.voltz.patinhascompany.models.Empresa;
import com.voltz.patinhascompany.services.CriptoAtivoService;

public class CriptoAtivoController {
    private CriptoAtivoService criptoAtivoService = new CriptoAtivoService();

    public CriptoAtivo criarCriptoAtivo(String nome, String codigo, double preco, Empresa empresa) {
        return criptoAtivoService.criarCriptoAtivo(nome, codigo, preco, empresa);
    }
}
