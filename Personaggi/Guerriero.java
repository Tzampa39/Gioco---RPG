package Personaggi;

public class Guerriero extends Personaggio {

    public Guerriero(String nome) {
        super(nome, 200, 50, 100, 60, 30);
    }

    @Override
    public void usaAbilitaSpeciale() {
        System.out.println(nome + " scatena la 'Furia del Berserker' aumentando la forza temporaneamente!");
        forza += 20;
    }
}
