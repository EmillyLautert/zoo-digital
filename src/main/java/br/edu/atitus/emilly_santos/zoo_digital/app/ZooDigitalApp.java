package br.edu.atitus.emilly_santos.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;

import br.edu.atitus.emilly_santos.zoo_digital.animais.*;
import br.edu.atitus.emilly_santos.zoo_digital.comportamentos.*;
import br.edu.atitus.emilly_santos.zoo_digital.especies.Animal;

public class ZooDigitalApp {

    private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
                    listarTodosAnimais();
                    break;
                case 3:
                    listarCorredores();
                    break;
                case 4:
                    listarNadadores();
                    break;
                case 5:
                    listarVoadores();
                    break;
                case 6:
                    listarPredadores();
                    break;
                case 7:
                    exibirTotalAnimais();
                    break;
                case 0:
                    IO.println("Encerrando o sistema...");
                    break;
                default:
                    IO.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void exibirMenu() {
        IO.println("\n===== ZOO DIGITAL =====");
        IO.println("1 - Cadastrar Animal");
        IO.println("2 - Listar Todos os Animais");
        IO.println("3 - Listar Animais Corredores");
        IO.println("4 - Listar Animais Nadadores");
        IO.println("5 - Listar Animais Voadores");
        IO.println("6 - Listar Animais Predadores");
        IO.println("7 - Exibir Total de Animais");
        IO.println("0 - Sair");
    }

    private static void cadastrarAnimal() {
        IO.println("\n===== CADASTRAR ANIMAL =====");
        IO.println("1 - Cachorro");
        IO.println("2 - Gato");
        IO.println("3 - Golfinho");
        IO.println("4 - Leão");
        IO.println("5 - Macaco");
        IO.println("6 - Águia");
        IO.println("7 - Galinha");
        IO.println("8 - Pato");
        IO.println("9 - Pinguim");
        IO.println("10 - Salmão");
        IO.println("11 - Traíra");
        IO.println("12 - Tubarão");
        IO.println("13 - Peixe Morcego");
        IO.println("14 - Cobra");
        IO.println("15 - Iguana");
        IO.println("16 - Jacaré");
        IO.println("17 - Tartaruga");

        int tipo = lerInteiro("Informe o tipo do animal: ");
        String nome = IO.readln("Informe o nome: ");
        int idade = lerInteiro("Informe a idade: ");

        Animal animal = null;

        switch (tipo) {
            case 1:
                animal = new Cachorro(nome, idade);
                break;
            case 2:
                animal = new Gato(nome, idade);
                break;
            case 3:
                animal = new Golfinho(nome, idade);
                break;
            case 4:
                animal = new Leao(nome, idade);
                break;
            case 5:
                animal = new Macaco(nome, idade);
                break;
            case 6:
                animal = new Aguia(nome, idade, IO.readln("Informe a cor das penas: "));
                break;
            case 7:
                animal = new Galinha(nome, idade, IO.readln("Informe a cor das penas: "));
                break;
            case 8:
                animal = new Pato(nome, idade, IO.readln("Informe a cor das penas: "));
                break;
            case 9:
                animal = new Pinguim(nome, idade, IO.readln("Informe a cor das penas: "));
                break;
            case 10:
                animal = new Salmao(nome, idade);
                break;
            case 11:
                animal = new Traira(nome, idade);
                break;
            case 12:
                animal = new Tubarao(nome, idade);
                break;
            case 13:
                animal = new PeixeMorcego(nome, idade);
                break;
            case 14:
                animal = new Cobra(nome, idade);
                break;
            case 15:
                animal = new Iguana(nome, idade);
                break;
            case 16:
                animal = new Jacare(nome, idade);
                break;
            case 17:
                animal = new Tartaruga(nome, idade);
                break;
            default:
                IO.println("Tipo de animal inválido.");
                return;
        }

        if (animalJaExiste(animal)) {
            IO.println("Já existe um animal com os mesmos dados cadastrado.");
            return;
        }

        animais.add(animal);
        IO.println("Animal cadastrado com sucesso!");
    }

    private static boolean animalJaExiste(Animal novoAnimal) {
        for (Animal animal : animais) {
            if (animal.getNome().equalsIgnoreCase(novoAnimal.getNome())
                    && animal.getEspecie().equalsIgnoreCase(novoAnimal.getEspecie())
                    && animal.getIdade().equals(novoAnimal.getIdade())) {
                return true;
            }
        }

        return false;
    }

    private static void listarTodosAnimais() {
        IO.println("\n===== TODOS OS ANIMAIS =====");

        if (animais.isEmpty()) {
            IO.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal animal : animais) {
            IO.println(animal);
            IO.println("Espécie: " + animal.getEspecie());
            animal.emitirSom();
            animal.comer();
            IO.println("--------------------");
        }
    }

    private static void listarCorredores() {
        IO.println("\n===== ANIMAIS CORREDORES =====");

        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Corrida corredor) {
                encontrou = true;
                IO.println(animal);
                corredor.correr();
                IO.println("--------------------");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal corredor cadastrado.");
        }
    }

    private static void listarNadadores() {
        IO.println("\n===== ANIMAIS NADADORES =====");

        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Nado nadador) {
                encontrou = true;
                IO.println(animal);
                nadador.nadar();
                IO.println("--------------------");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal nadador cadastrado.");
        }
    }

    private static void listarVoadores() {
        IO.println("\n===== ANIMAIS VOADORES =====");

        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Voo voador) {
                encontrou = true;
                IO.println(animal);
                voador.voar();
                IO.println("--------------------");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal voador cadastrado.");
        }
    }

    private static void listarPredadores() {
        IO.println("\n===== ANIMAIS PREDADORES =====");

        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Predacao predador) {
                encontrou = true;
                IO.println(animal);
                predador.cacar();
                IO.println("--------------------");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal predador cadastrado.");
        }
    }

    private static void exibirTotalAnimais() {
        IO.println("\nTotal de animais criados: " + Animal.getContador());
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                return Integer.parseInt(IO.readln(mensagem));
            } catch (NumberFormatException e) {
                IO.println("Entrada inválida. Digite um número.");
            }
        }
    }
}