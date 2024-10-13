package com.voltz.patinhascompany.services;

import main.java.com.voltz.patinhascompany.models.CriptoAtivo;
import main.java.com.voltz.patinhascompany.models.Empresa;

public class CriptoAtivoService {

    public CriptoAtivo criarCriptoAtivo(String nome, String codigo, double preco, Empresa empresa) {
        return new CriptoAtivo(nome, codigo, preco, empresa);
    }
}
