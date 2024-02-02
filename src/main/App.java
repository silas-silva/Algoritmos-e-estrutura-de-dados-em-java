package main;

import _01_lista_encadeada.ListaEncadeada;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author silas
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        
        lista.adicionar(10);
        lista.adicionar(11);
       
        System.out.println(lista.getQuantidade());
        //System.out.println("Teste");
    }
    
}
