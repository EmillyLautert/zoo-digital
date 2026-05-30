package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Nado;
import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Peixe;

public class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        this.comer("peixes menores");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está movimentando as guelras.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando rapidamente pelo oceano.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando uma presa.");
    }
}