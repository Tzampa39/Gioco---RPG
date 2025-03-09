package Personaggi;

public class Ladro extends Personaggio {

    public Ladro(String nome) {
        super(nome, 130, 60, 70, 110, 40);
    }

    @Override
    public void usaAbilitaSpeciale() {
        System.out.println(nome + " usa 'Colpo Letale' infliggendo danni enormi a un singolo bersaglio!");
    }
}

