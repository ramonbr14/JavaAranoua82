package com.company.classes;

public class Avaliador {
    //Variaveis String
    private String nome;

    //ConstrutoresPadrão
    public Avaliador() {
    }
    public Avaliador(String nome) {
        this.nome = nome;
    }

    //Manual Metods
    public void AvaliarPedido(){

    }

    //getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
