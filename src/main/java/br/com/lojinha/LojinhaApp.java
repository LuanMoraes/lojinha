package br.com.lojinha;
import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ItemAdicional;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;


//Adicionando texto de teste
public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("PS4","Sony",Tamanho.MEDIO);  //instanciando um novo produto
        meuProduto.setValor(50);
        List<ItemAdicional> itensInclusos = new ArrayList<>(); //criando nova lista vazia do tipo ItemAdicional

        // Adicionando itens adicionais ao item comprado!
        ItemAdicional primeiroItem = new ItemAdicional("Controle",2);
        itensInclusos.add(primeiroItem); //Adicionando o primeiro item na lista de itensAdicionados

        ItemAdicional segundoItem = new ItemAdicional("Carregador",1);
        itensInclusos.add(segundoItem);

        ItemAdicional terceiroItem = new ItemAdicional("Bateria",2);
        itensInclusos.add(terceiroItem);

        meuProduto.setItensInclusos(itensInclusos); //Adiciona os itens na lista
/*
        for(ItemAdicional itemAtual : meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNomeItem());
            System.out.println(itemAtual.getQuantidade());
        }
*/
        ProdutoInternacional inter = new ProdutoInternacional("PS5","Sonyc",Tamanho.MEDIO);
        ProdutoNacional nac = new ProdutoNacional("Xbox","Microsoft",Tamanho.GRANDE);

    }
}
