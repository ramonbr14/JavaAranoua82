package com.company.testes;

import com.company.classes.Candidato;

import javax.swing.*;

public class TesteCandidato {

    public static void main(String[] args) {

        Candidato candidato1 = new Candidato();

        candidato1.setNomeCandidato(JOptionPane.showInputDialog(null, "Escreva seu Nome: ",
                "NOME DO CANDITADO",JOptionPane.INFORMATION_MESSAGE));
        candidato1.setEmailCandidato(JOptionPane.showInputDialog(null, "Escreva seu E-mail: ",
                "E-MAIL DO CANDITADO",JOptionPane.INFORMATION_MESSAGE));
        candidato1.setTelefone(Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva seu Telefone: ",
                "TELEFONE DO CANDITADO",JOptionPane.INFORMATION_MESSAGE)));;

    }

}
