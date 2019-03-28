package controller;

public class Equipe {

    private int cod_equipe;
    private int cod_pais;
    private String nome;

    public Equipe (
            int cod_pais,
            int cod_equipe,
            String nome){

        this.cod_pais = cod_pais;
        this.cod_equipe = cod_equipe;
        this.nome = nome;

    }

    public int getCod_equipe() {
        return cod_equipe;
    }

    public void setCod_equipe(int cod_equipe) {
        this.cod_equipe = cod_equipe;
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
}

