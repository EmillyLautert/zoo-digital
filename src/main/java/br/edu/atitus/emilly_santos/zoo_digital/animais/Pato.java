package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Nado;
import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Voo;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Ave;

public class Pato extends Ave implements Voo, Corrida, Nado {
    public Pato(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("ração e pequenos insetos");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando elegantemente.");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo todo atrapalhado.");
    }

    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando em migração para o Sul.");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está grasnando!");
    }   
}
