package com.voltz.patinhascompany.tests;

import com.voltz.patinhascompany.dao.UsuarioDao;
import com.voltz.patinhascompany.models.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioDaoTest {

    private UsuarioDao usuarioDao;
    private Usuario usuarioTeste;

    @BeforeEach
    public void setUp() {
        usuarioDao = new UsuarioDao();
        usuarioTeste = new Usuario("Teste Nome", "teste@email.com", "senha123");
    }

    @Test
    public void testInserir() {
        usuarioDao.inserir(usuarioTeste);
        assertTrue(usuarioTeste.getId() > 0, "O ID do usuário deve ser maior que zero após a inserção");
    }

    @Test
    public void testBuscarPorId() {
        usuarioDao.inserir(usuarioTeste);
        Usuario usuarioBuscado = usuarioDao.buscarPorId(usuarioTeste.getId());
        assertNotNull(usuarioBuscado, "O usuário buscado não deve ser nulo");
        assertEquals(usuarioTeste.getNome(), usuarioBuscado.getNome(), "O nome do usuário buscado deve ser igual ao inserido");
    }

    @Test
    public void testListarTodos() {
        usuarioDao.inserir(usuarioTeste);
        List<Usuario> usuarios = usuarioDao.listarTodos();
        assertFalse(usuarios.isEmpty(), "A lista de usuários não deve estar vazia");
    }

    @Test
    public void testAtualizar() {
        usuarioDao.inserir(usuarioTeste);
        usuarioTeste.setNome("Nome Atualizado");
        usuarioDao.atualizar(usuarioTeste);
        Usuario usuarioAtualizado = usuarioDao.buscarPorId(usuarioTeste.getId());
        assertEquals("Nome Atualizado", usuarioAtualizado.getNome(), "O nome do usuário deve ser atualizado");
    }

    @Test
    public void testRemover() {
        usuarioDao.inserir(usuarioTeste);
        usuarioDao.remover(usuarioTeste.getId());
        Usuario usuarioRemovido = usuarioDao.buscarPorId(usuarioTeste.getId());
        assertNull(usuarioRemovido, "O usuário deve ser nulo após a remoção");
    }
}