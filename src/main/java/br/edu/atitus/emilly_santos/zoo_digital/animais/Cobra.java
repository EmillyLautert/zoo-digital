package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Reptil;

public class Cobra extends Reptil implements Predacao {

    public Cobra(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("roedores");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está sibilando.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando um rato.");
    }
}