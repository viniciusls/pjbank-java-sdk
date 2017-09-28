package br.com.pjbank.sdk.models.contadigital;

import br.com.pjbank.sdk.enums.StatusAdministrador;

public class Administrador {
    private String nome;
    private boolean socio;
    private StatusAdministrador status;
    private String imagem;
    private String email;

    public Administrador() {
    }

    public Administrador(String nome, boolean socio, StatusAdministrador status, String imagem, String email) {
        this.nome = nome;
        this.socio = socio;
        this.status = status;
        this.imagem = imagem;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isSocio() {
        return socio;
    }

    public void setSocio(boolean socio) {
        this.socio = socio;
    }

    public StatusAdministrador getStatus() {
        return status;
    }

    public void setStatus(StatusAdministrador status) {
        this.status = status;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
