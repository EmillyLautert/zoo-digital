package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Nado;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Reptil;

public class Iguana extends Reptil implements Corrida, Nado {

    public Iguana(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        this.comer("folhas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está emitindo sons discretos.");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo entre as pedras.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está atravessando a água.");
    }
}