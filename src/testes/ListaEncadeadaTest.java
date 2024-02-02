package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _01_lista_encadeada.ListaEncadeada;

class ListaEncadeadaTest {

	@Test
	void adicionarTeste() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        
        lista.adicionar(10);
        lista.adicionar(11);
        
        assertEquals(2, lista.getQuantidade());
	}
	
	
	@Test
	void removerUltimoTeste() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(40);
        lista.adicionar(50);
        lista.adicionar(60);
        lista.adicionar(70);
        lista.adicionar(11);
        
        assertEquals(11, lista.deletarUltimo());
	}
	
	
	@Test
	void removerPrimeiroTeste() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        
        lista.adicionar(10);
        lista.adicionar(11);
        
        assertEquals(10, lista.deletarPrimeiro());
	}
}
