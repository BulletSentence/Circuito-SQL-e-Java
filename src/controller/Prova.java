package controller;

import java.util.Calendar;

public class Prova {

    private int cod_prova;
    private int cod_circuito;
    private Calendar data;

    public Prova (
            int cod_prova,
            int cod_circuito,
            Calendar data){

        this.cod_prova = cod_prova;
        this.cod_circuito = cod_circuito;
        this.data = data;

    }

    public int getCod_prova() {
        return cod_prova;
    }

    public void setCod_prova(int cod_prova) {
        this.cod_prova = cod_prova;
    }

    public int getCod_circuito() {
        return cod_circuito;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setCod_circuito(int cod_circuito) {
        this.cod_circuito = cod_circuito;
    }

}
