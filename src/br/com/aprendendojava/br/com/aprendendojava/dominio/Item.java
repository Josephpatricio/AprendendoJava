package br.com.aprendendojava.br.com.aprendendojava.dominio;

public class Item {

    private String nome;
    private int anoCriacao;

    public Item(String nome, int anoCriacao){
        this.nome = nome;
        this.anoCriacao = anoCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }
}
