package br.edu.atitus.emilly_santos.zoo_digital.especies;

public abstract class Reptil extends Animal {

    public Reptil(String nome, Integer idade, Boolean venenoso) {
        super(nome, "Réptil", idade);
        this.venenoso = venenoso;
    }

    private Boolean venenoso;

    public Boolean getVenenoso() {
        return venenoso;
    }

    public void setVenenoso(Boolean venenoso) {
        this.venenoso = venenoso;
    }
}