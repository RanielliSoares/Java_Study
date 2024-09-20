package br.com.desafioListas.principal;

import br.com.desafioListas.modelos.CarrinhoCompras;
import br.com.desafioListas.modelos.CartaoCredito;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int controleWhile = 0;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão de crédito:");
        CartaoCredito meuCartao = new CartaoCredito(leitura.nextDouble());
        CarrinhoCompras meuCarrinho = new CarrinhoCompras();
        ArrayList<CarrinhoCompras> listaCompras = new ArrayList<>();
        while (controleWhile < 1) {
            System.out.println("Qual o item comprado?");
            meuCarrinho.setItem(leitura.next());
            System.out.println("Qual o valor do item ? ");
            meuCarrinho.setValorItem(leitura.nextDouble());
            listaCompras.add(meuCarrinho);
            System.out.println(listaCompras.size());
            System.out.println("Digite 0 para continuar ou 1 para parar.");
            if (leitura.nextInt() == 0) {
                controleWhile = 0;
            } else {
                controleWhile = 1;
            }
        }
        System.out.println("Compra finalizada");


    }

}