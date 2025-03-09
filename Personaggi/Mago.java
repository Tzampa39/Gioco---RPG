package Personaggi;

public class Mago extends Personaggio {

    public Mago(String nome) {
        super(nome, 100, 200, 40, 50, 120);
    }

    @Override
    public void usaAbilitaSpeciale() {
        System.out.println(nome + " lancia 'Palla di Fuoco' causando danno ad area!");
        mana -= 30;
    }
}

