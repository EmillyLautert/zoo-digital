package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Voo;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Ave;

public class Aguia extends Ave implements Voo, Predacao {

    public Aguia(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("pequenos animais");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está piando.");
    }

    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando em grandes altitudes.");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando uma presa.");
    }
}