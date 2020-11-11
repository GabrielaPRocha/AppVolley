package br.com.local.appvolleyjsonarrayrequest;

public class Filmes {
    private String nome;
    private String genero;
    private String codigo;
    private String locado;

    public Filmes() {
    }

    public Contatos(String nome, String genero, String codigo, String locado) {
        this.nome = nome;
        this.tipo = genero;
        this.nome = codigo;
        this.tipo = locado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.tipo = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.tipo = codigo;
    }

    public String getLocado() {
        return locado;
    }

    public void setLocado(String locado) {
        this.tipo = locado;
    }
}