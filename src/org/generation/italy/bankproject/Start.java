package org.generation.italy.bankproject;

import java.time.LocalDate;
import java.util.Scanner;

import org.generation.italy.bankproject.model.money.ContoCorrente;
import org.generation.italy.bankproject.model.people.Cliente;

public class Start {

    public static void main(String[] args){
        System.out.println("Benvenuto in Banca Express!\n\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Cognome cliente: ");
        String cognome = scanner.nextLine();
        Cliente cliente1 = new Cliente(nome, cognome, 'M', LocalDate.of(1998, 10, 13), "base");
        ContoCorrente conto1 = new ContoCorrente(cliente1, 10000);
        ContoCorrente conto2 = new ContoCorrente(cliente1, 20000);
        conto1.transfer(5000, conto2);
        conto1.ritira(1000);
        conto1.setSaldo(0);
    }
}
