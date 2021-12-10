package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {
    private double taxaImportacao;

    public ProdutoInternacional(String nomeProduto, String marcaInicial, Tamanho tamanhoInicial) {
        super(nomeProduto, marcaInicial, tamanhoInicial);
    }
    public void setValor(double novoValor) {
        if (novoValor > -100){
            this.valor = novoValor;
        } else{
            throw new IllegalArgumentException("Valores devem ser maiores que -100.00");
        }
    }

    public double getTaxaImportacao() {
        return this.taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
