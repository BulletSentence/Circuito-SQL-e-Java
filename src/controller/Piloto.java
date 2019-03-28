package controller;

public class Piloto {

    private int cod_piloto;
    private int cod_pais;
    private int cod_equipe;
    private String nome;
    private int data_nasc;

    public Piloto (
            int cod_piloto,
            int cod_pais,
            int cod_equipe,
            String nome,
            int data_nasc){

        this.cod_piloto = cod_piloto;
        this.cod_pais = cod_pais;
        this.cod_equipe = cod_equipe;
        this.nome = nome;
        this.data_nasc = data_nasc;

    }

    public int getCod_piloto() {
        return cod_piloto;
    }

    public void setCod_piloto(int cod_piloto) {
        this.cod_piloto = cod_piloto;
    }

    public int getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }

    public int getCod_equipe() {
        return cod_equipe;
    }

    public void setCod_equipe(int cod_equipe) {
        this.cod_equipe = cod_equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(int data_nasc) {
        this.data_nasc = data_nasc;
    }
}
