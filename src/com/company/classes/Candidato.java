package com.company.classes;

public class Candidato {
    //Strings
    private String nomeCandidato = "";
    private String idCartaoSocio = "";
    private String emailCandidato = "";
    //Inteiros
    private int telefone = 0;
    //Outros tIPOS
    public CategoriaSocio categoria;


    //Construtores
    public Candidato() {
    }
    public void solicitarPedido(){


    }

    public Candidato(String nomeCandidato, String idCartaoSocio, String emailCandidato, int telefone) {
        this.nomeCandidato = nomeCandidato;
        this.idCartaoSocio = idCartaoSocio;
        this.emailCandidato = emailCandidato;
        this.telefone = telefone;
    }

    //getter e Setter padrao
    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getIdCartaoSocio() {
        return idCartaoSocio;
    }

    public void setIdCartaoSocio(String idCartaoSocio) {
        this.idCartaoSocio = idCartaoSocio;
    }

    public String getEmailCandidato() {
        return emailCandidato;
    }

    public void setEmailCandidato(String emailCandidato) {
        this.emailCandidato = emailCandidato;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}