package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Mamifero;

public class Macaco extends Mamifero implements Corrida {

    public Macaco(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("frutas");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está gritando!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo entre as árvores.");
    }
}