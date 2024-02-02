package _01_lista_encadeada;

public class No<T>{
    public T dado;
    public No<T> proximo;

    public No(T dado){
        this.dado = dado;
        this.proximo = null;
    }
}

/*
 * Exemplo de uso
    No<Integer> noInteiro = new No<>(42);
    No<String> noString = new No<>("Olá, mundo!");
 */