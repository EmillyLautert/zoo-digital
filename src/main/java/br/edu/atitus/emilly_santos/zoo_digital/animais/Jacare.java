package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Nado;
import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Reptil;

public class Jacare extends Reptil implements Nado, Corrida, Predacao {

    public Jacare(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        this.comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está rugindo.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando no lago.");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo pela margem.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está emboscando uma presa.");
    }
}