package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Nado;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Peixe;

public class PeixeMorcego extends Peixe implements Nado {

    public PeixeMorcego(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        this.comer("pesquenas algas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando tranquilamente");
    }
}