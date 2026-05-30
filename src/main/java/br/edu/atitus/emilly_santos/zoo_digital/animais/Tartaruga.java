package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Nado;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Reptil;

public class Tartaruga extends Reptil implements Nado {

    public Tartaruga(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        this.comer("algas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está fazendo sons suaves.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando lentamente.");
    }
}