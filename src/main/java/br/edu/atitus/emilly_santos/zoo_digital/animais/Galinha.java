package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Ave;

public class Galinha extends Ave implements Corrida {

    public Galinha(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("milho");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está cacarejando!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo pelo galinheiro.");
    }
}