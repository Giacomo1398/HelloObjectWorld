//Creare un programma che modella una classe conto corrente che ha:
//una matricola che rappresenta l'id
//un saldo
//un metodo deposita che aumentra il saldo di un ammontare in input
//un metodo ritira che riceve un ammontare e lo sottrae dal saldo
//il metodo ritira sarà eseguibile se si arriva al massimo ad uno scoperto di 1000$
//ritiro e deposito ritornano il saldo dopo l'operazione.
//un metodo void che stampa il saldo
//un metodo transfer che fa un bonifico da un conto 1 a un conto 2. Deve ritornare il saldo attuale del conto sorgente e deve 
//poter spedire tot soldi ad un altro conto

//voglio creare una classe cliente con nome, cognome, sesso e data di nascita
//avrà anche uno status: base, premium o vip.
//un cliente può avere 3 conti per il base, 5 per il premium e 10 per il vip

//classe banca: ha un nome, una lista di almeno 10 clienti
//avrà un metodo getTotalMoney che ritorna la somma dei saldi dei conti di tutti i clienti
//metodo che mi calcola la somma di tutti i saldi per un certo tipo di clienti
//metodo che mi ritorna il cliente con più soldi 
//metodo che ritorna il cliente con meno soldi

//la banca sarà in un package org.generation.italy.bankproject.model
//i conti saranno in un package org.generation.italy.bankproject.model.money
//i clienti saranno in un package org.generation.italy.bankproject.model.people

package org.generation.italy.bankproject.model;

import org.generation.italy.bankproject.model.money.ContoCorrente;
import org.generation.italy.bankproject.model.people.Cliente;

public class Banca {
    public final static int MAX_CLIENTS = 10;
    private String nomeBanca;
    private Cliente[] clienti;

    public Banca(String nomeBanca){
        this.nomeBanca = nomeBanca;
        this.clienti = new Cliente[MAX_CLIENTS];
    }

    public void testGit(){
        System.out.println("Modifica file per sperimentare con Git");
    }

    public double getTotalMoney(){
        double totalMoney = 0;
        for(int i = 0; i < clienti.length; i++){
            if(clienti[i] != null){
                totalMoney += clienti[i].getTotalSaldo();
            }
        }
        return totalMoney;
    }

    public double getTotalMoneyForClientType(String status){
        double totalMoneyClientType = 0;
        for(int i = 0; i< clienti.length; i++){
            if(clienti[i] != null && status.equals(clienti[i].status)){
                totalMoneyClientType += clienti[i].getTotalSaldo();
            }
        }
        return totalMoneyClientType;
    }

    public Cliente getRichestClient(){
        double maxBalance = Double.MIN_VALUE;
        Cliente richest = null;
        for(int i = 0; i < clienti.length; i++){
            if(clienti[i] != null && clienti[i].getTotalSaldo() > maxBalance){
                maxBalance = clienti[i].getTotalSaldo();
                richest = clienti[i];
            }
        }
        return richest;
    }

    public Cliente poorestClient(){
        double minBalance = Double.MAX_VALUE;
        Cliente poorest = null;
        for(int i = 0; i < clienti.length; i++){
            if(clienti[i] != null && clienti[i].getTotalSaldo() < minBalance){
                minBalance = clienti[i].getTotalSaldo();
                poorest = clienti[i];
            }
        }
        return poorest;
    }

}
