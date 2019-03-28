package controller;

public class Pais {

    private int cod_pais;
    private String nome;
    private int populacao;

    public Pais(
            int cod_pais,
            String nome,
            int populacao) {

        this.cod_pais = cod_pais;
        this.nome = nome;
        this.populacao = populacao;

    }

    public int getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
}
