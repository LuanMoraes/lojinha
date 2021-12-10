package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    private List<ItemAdicional> itensInclusos;
    private Tamanho tamanho;
    protected double valor;

    public Produto(String nomeProduto, String marcaInicial, Tamanho tamanhoInicial){
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
        this.nome = nomeProduto;
    }

    public double getValor() {
        return this.valor;
    }
    public void setValor(double novoValor) {
        if (novoValor > 0){
            this.valor = novoValor;
        } else{
            throw new IllegalArgumentException("Valores devem ser maiores que zero");
        }
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    public String getMarca (){
        return this.marca;
    }
    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }
    public Tamanho getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public List<ItemAdicional> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<ItemAdicional> itensInclusos) {
        this.itensInclusos = itensInclusos;
    }
}
