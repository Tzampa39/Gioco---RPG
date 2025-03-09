package Personaggi;

public class Ranger extends Personaggio {

    public Ranger(String nome) {
        super(nome, 150, 70, 60, 100, 40);
    }

    @Override
    public void usaAbilitaSpeciale() {
        System.out.println(nome + " usa 'Colpo Preciso' infliggendo danno critico!");
    }
}

