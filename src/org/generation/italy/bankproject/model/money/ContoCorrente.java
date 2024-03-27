package org.generation.italy.bankproject.model.money;

import org.generation.italy.bankproject.model.people.Cliente;

public class ContoCorrente {
    private Cliente owner;
    private double saldo;

    public ContoCorrente(Cliente owner, double sal){
        this.owner = owner;
        saldo = sal;
    }

    public double deposita(double amountDeposited){
        double taxedAmount = amountDeposited * 0.9;
        saldo = saldo + taxedAmount;
        return saldo;
    }
 
    public double ritira(double amountWithdrawed){
        double withdrawedBalance = saldo - amountWithdrawed;
        if(checkSaldo(amountWithdrawed)){
            saldo = withdrawedBalance;
        } else {
              System.out.println("Non puoi prelevare così tanto"); 
        }
        return saldo;
    }

    public void stampaSaldo(){
        System.out.println(saldo);
    }

    public double transfer(double requiredAmount, ContoCorrente contoCorrente2){
        if(checkSaldo(requiredAmount)){
            saldo -= requiredAmount;
            contoCorrente2.saldo += requiredAmount;
        } else {
            System.out.println("Non puoi trasferire così tanto.");
          }
        
        return saldo;
    }

    public double transfer2(double requiredAmount, ContoCorrente contoCorrente2){
        double oldsaldo = this.saldo;
        double newsaldo = ritira(requiredAmount);
        if(oldsaldo != newsaldo){
            contoCorrente2.deposita(requiredAmount);
        }
        return saldo;
    }

    public boolean checkSaldo(double amount){
        if(saldo - amount >= -1000){
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double newSaldo){
        saldo = newSaldo;
    }
}