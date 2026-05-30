package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Mamifero;

public class Leao extends Mamifero implements Corrida, Predacao {

    public Leao(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está rugindo!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo atrás da presa.");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando uma zebra.");
    }
}