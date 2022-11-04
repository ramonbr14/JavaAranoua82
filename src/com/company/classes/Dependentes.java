package com.company.classes;

public class Dependentes {
    private String nomeDependente;
    private String GrauParentesco; 
    private String idCartaoSocio;
    private String Email;
    
    //Construtores
    public Dependentes() {
    }
    public Dependentes(String nomeDependente, String grauParentesco, String idCartaoSocio, String email) {
        this.nomeDependente = nomeDependente;
        GrauParentesco = grauParentesco;
        this.idCartaoSocio = idCartaoSocio;
        Email = email;
    }
    public String getNomeDependente() {
        return nomeDependente;
    }
    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }
    public String getGrauParentesco() {
        return GrauParentesco;
    }
    public void setGrauParentesco(String grauParentesco) {
        GrauParentesco = grauParentesco;
    }
    public String getIdCartaoSocio() {
        return idCartaoSocio;
    }
    public void setIdCartaoSocio(String idCartaoSocio) {
        this.idCartaoSocio = idCartaoSocio;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

    
}
