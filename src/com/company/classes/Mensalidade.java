package com.company.classes;

import java.util.Date;

public class Mensalidade {
    private String idcartaoSocio;
    private double valoReal;
    private Date dataPagamento;
    private Date dataVencimento;
    private boolean estadoDaMensalidade;
    private double valorPago;
    private int numeroDependentes;
    
    //Contrutores
    public Mensalidade() {}

    public Mensalidade(String idcartaoSocio, double valoReal, Date dataPagamento, Date dataVencimento,
            boolean estadoDaMensalidade, double valorPago, int numeroDependentes) {
        this.idcartaoSocio = idcartaoSocio;
        this.valoReal = valoReal;
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
        this.estadoDaMensalidade = estadoDaMensalidade;
        this.valorPago = valorPago;
        this.numeroDependentes = numeroDependentes;
    }


    //Metodos da Classe
    public void calcJurosAtraso(){}
    public void recidoPagamento(){}
    public void gerarMensalidade(){}
    public void efetuarPagamento(){}

    //GEtters e Setters
    public String getIdcartaoSocio() {
        return idcartaoSocio;
    }

    public void setIdcartaoSocio(String idcartaoSocio) {
        this.idcartaoSocio = idcartaoSocio;
    }

    public double getValoReal() {
        return valoReal;
    }

    public void setValoReal(double valoReal) {
        this.valoReal = valoReal;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isEstadoDaMensalidade() {
        return estadoDaMensalidade;
    }

    public void setEstadoDaMensalidade(boolean estadoDaMensalidade) {
        this.estadoDaMensalidade = estadoDaMensalidade;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

}