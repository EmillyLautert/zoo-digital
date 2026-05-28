package br.edu.atitus.emilly_santos.zoo_digital.animais;

import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.Nado;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Mamifero;

public final class Cachorro extends Mamifero implements Corrida, Nado {
    public Cachorro(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("ração");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está latindo!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando estilo cachorrinho.");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo pelo pátio.");
    }
    
}
