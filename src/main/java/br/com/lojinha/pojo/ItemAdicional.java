package br.com.lojinha.pojo;

public class ItemAdicional {
    private int quantidade;
    private String nomeItem;

    public ItemAdicional(String nomeItem, int quantidade){
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }
}
