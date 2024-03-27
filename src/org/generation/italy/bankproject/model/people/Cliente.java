package org.generation.italy.bankproject.model.people;

import java.time.LocalDate;

import org.generation.italy.bankproject.model.money.ContoCorrente;

public class Cliente {
    private String nome;
    private String cognome;
    private char sex;
    private LocalDate birthDate;
    private String status;
    private ContoCorrente[] contoCorrente;   

    public Cliente(String nome, String cognome, char sex, LocalDate birthDate, String status){
        this.nome = nome;
        this.cognome = cognome;
        this.sex = sex;
        this.birthDate = birthDate;
        this.status = status;
        switch (status){
            case "base":
            contoCorrente = new ContoCorrente[3];

            case "premium":
            contoCorrente = new ContoCorrente[5];

            case "vip":
            contoCorrente = new ContoCorrente[10];
        }
    }

    public double getTotalSaldo(){
        double sommaSaldiTotali = 0;
        for(int i = 0;i < contoCorrente.length;i++ ){
            if(contoCorrente[i] != null){
                sommaSaldiTotali += contoCorrente[i].getSaldo();
            }
        }

        return sommaSaldiTotali;
    }

}
