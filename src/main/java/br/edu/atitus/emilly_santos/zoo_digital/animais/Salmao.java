package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Nado;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Peixe;

public class Salmao extends Peixe implements Nado {

    public Salmao(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("pequenos insetos");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está borbulhando.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando contra a correnteza.");
    }
}