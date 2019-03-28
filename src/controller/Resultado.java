package controller;

public class Resultado {

    private int cod_piloto;
    private int cod_prova;
    private int tempo_prova;
    private int colocacao_final;
    private int posicao_grid;
    private int melhor_volta;

    public Resultado (
            int cod_prova,
            int cod_piloto,
            int tempo_prova,
            int colocacao_final,
            int posicao_grid,
            int melhor_volta){


        this.cod_piloto = cod_piloto;
        this.cod_prova = cod_prova;
        this.tempo_prova = tempo_prova;
        this.colocacao_final = colocacao_final;
        this.posicao_grid = posicao_grid;
        this.melhor_volta = melhor_volta;

    }

    public int getCod_piloto() {
        return cod_piloto;
    }

    public void setCod_piloto(int cod_piloto) {
        this.cod_piloto = cod_piloto;
    }

    public int getCod_prova() {
        return cod_prova;
    }

    public void setCod_prova(int cod_prova) {
        this.cod_prova = cod_prova;
    }

    public int getTempo_prova() {
        return tempo_prova;
    }

    public void setTempo_prova(int tempo_prova) {
        this.tempo_prova = tempo_prova;
    }

    public int getColocacao_final() {
        return colocacao_final;
    }

    public void setColocacao_final(int colocacao_final) {
        this.colocacao_final = colocacao_final;
    }

    public int getPosicao_grid() {
        return posicao_grid;
    }

    public void setPosicao_grid(int posicao_grid) {
        this.posicao_grid = posicao_grid;
    }

    public int getMelhor_volta() {
        return melhor_volta;
    }

    public void setMelhor_volta(int melhor_volta) {
        this.melhor_volta = melhor_volta;
    }
}
