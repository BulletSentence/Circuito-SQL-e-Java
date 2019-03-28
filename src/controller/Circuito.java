package controller;

public class Circuito {

    private int cod_circuito;
    private int cod_pais;
    private String nome;
    private int extensao;

    public Circuito (
            int cod_circuito,
            int cod_pais,
            String nome,
            int extensao){

        this.cod_circuito = cod_circuito;
        this.cod_pais = cod_pais;
        this.extensao = extensao;
        this.nome = nome;

    }

    public int getCod_circuito() {
        return cod_circuito;
    }

    public void setCod_circuito(int cod_circuito) {
        this.cod_circuito = cod_circuito;
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

    public int getExtensao() {
        return extensao;
    }

    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

}
