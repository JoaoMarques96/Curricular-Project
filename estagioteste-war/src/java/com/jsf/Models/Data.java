/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.Models;

import java.sql.Timestamp;

/**
 *
 * @author
 */
public class Data {

    private int id;
    private int corrente1;
    private int corrente2;
    private int corrente3;
    private int tensao1;
    private int tensao2;
    private int tensao3;
    private Timestamp dataRecolha;

    public Data() {
    }

    public Data(int id, int corrente1, int corrente2, int corrente3, int tensao1, int tensao2, int tensao3, Timestamp dataRecolha) {
        this.id = id;
        this.corrente1 = corrente1;
        this.corrente2 = corrente2;
        this.corrente3 = corrente3;
        this.tensao1 = tensao1;
        this.tensao2 = tensao2;
        this.tensao3 = tensao3;
        this.dataRecolha = dataRecolha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCorrente1() {
        return corrente1;
    }

    public void setCorrente1(int corrente1) {
        this.corrente1 = corrente1;
    }

    public int getCorrente2() {
        return corrente2;
    }

    public void setCorrente2(int corrente2) {
        this.corrente2 = corrente2;
    }

    public int getCorrente3() {
        return corrente3;
    }

    public void setCorrente3(int corrente3) {
        this.corrente3 = corrente3;
    }

    public int getTensao1() {
        return tensao1;
    }

    public void setTensao1(int tensao1) {
        this.tensao1 = tensao1;
    }

    public int getTensao2() {
        return tensao2;
    }

    public void setTensao2(int tensao2) {
        this.tensao2 = tensao2;
    }

    public int getTensao3() {
        return tensao3;
    }

    public void setTensao3(int tensao3) {
        this.tensao3 = tensao3;
    }

    public Timestamp getDataRecolha() {
        return dataRecolha;
    }

    public void setDataRecolha(Timestamp dataRecolha) {
        this.dataRecolha = dataRecolha;
    }

    @Override
    public String toString() {
        return "Data{" + "id=" + id + ", corrente1=" + corrente1 + ", corrente2=" + corrente2 + ", corrente3=" + corrente3 + ", tensao1=" + tensao1 + ", tensao2=" + tensao2 + ", tensao3=" + tensao3 + ", dataRecolha=" + dataRecolha + '}';
    }

}
