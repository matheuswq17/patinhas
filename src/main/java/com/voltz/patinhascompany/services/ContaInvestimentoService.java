package com.voltz.patinhascompany.services;

import com.voltz.patinhascompany.dao.UsuarioDao;
import com.voltz.patinhascompany.models.Usuario;

// Outras bibliotecas Java necessárias, como listas ou exceções
import java.util.List;
import java.util.Optional;
;

public class ContaInvestimentoService {

    public ContaInvestimento criarConta(String numeroConta, String tipoMoeda, Usuario usuario) {
        return new ContaInvestimento(numeroConta, tipoMoeda, usuario);
    }

    public void adicionarSaldo(ContaInvestimento conta, double valor) {
        conta.adicionarSaldo(valor);
    }
}
