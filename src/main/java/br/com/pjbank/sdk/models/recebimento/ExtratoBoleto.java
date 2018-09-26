package br.com.pjbank.sdk.models.recebimento;

import java.util.Date;

/**
 * @author Paulo Vitor Braga Pessoa <foxpv213@gmail.com>
 */
public class ExtratoBoleto {
    private double valor;
    private double valorPago;
    private double valorLiquido;
    private double valorTarifa;
    private String nossoNumero;
    private String nossoNumeroOriginal;
    private String bancoNumero;
    private String tokenFacilitador;
    private Date dataVencimento;
    private Date dataPagamento;
    private Date dataCredito;

    public ExtratoBoleto() {
    }

    public ExtratoBoleto(double valor, double valorPago, double valorLiquido, double valorTarifa, String nossoNumero,
                         String nossoNumeroOriginal, String bancoNumero, String tokenFacilitador) {
        this.valor = valor;
        this.valorPago = valorPago;
        this.valorLiquido = valorLiquido;
        this.valorTarifa = valorTarifa;
        this.nossoNumero = nossoNumero;
        this.nossoNumeroOriginal = nossoNumeroOriginal;
        this.bancoNumero = bancoNumero;
        this.tokenFacilitador = tokenFacilitador;
        this.valorLiquido = valorLiquido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorTarifa() {
        return valorTarifa;
    }

    public void setValorTarifa(double valorTarifa) {
        this.valorTarifa = valorTarifa;
    }

    public double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public String getNossoNumeroOriginal() {
        return nossoNumeroOriginal;
    }

    public void setNossoNumeroOriginal(String nossoNumeroOriginal) {
        this.nossoNumeroOriginal = nossoNumeroOriginal;
    }

    public String getBancoNumero() {
        return bancoNumero;
    }

    public void setBancoNumero(String bancoNumero) {
        this.bancoNumero = bancoNumero;
    }

    public String getTokenFacilitador() {
        return tokenFacilitador;
    }

    public void setTokenFacilitador(String tokenFacilitador) {
        this.tokenFacilitador = tokenFacilitador;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
    }


}
