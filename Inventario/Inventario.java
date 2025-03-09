package Inventario;


import java.util.ArrayList;

public class Inventario {
    private ArrayList<Oggetto> oggetti;

    public Inventario() {
        this.oggetti = new ArrayList<>();
    }

    public void aggiungiOggetto(Oggetto oggetto) {
        for (Oggetto o : oggetti) {
            if (o.getNome().equals(oggetto.getNome())) {
                o.aggiungiQuantita(oggetto.getQuantita());
                return;
            }
        }
        oggetti.add(oggetto);
    }

    public void rimuoviOggetto(String nomeOggetto, int quantita) {
        for (Oggetto o : oggetti) {
            if (o.getNome().equals(nomeOggetto)) {
                o.rimuoviQuantita(quantita);
                if (o.getQuantita() <= 0) {
                    oggetti.remove(o);
                }
                return;
            }
        }
        System.out.println("Oggetto non trovato nell'inventario: " + nomeOggetto);
    }

    public void mostraInventario() {
        if (oggetti.isEmpty()) {
            System.out.println("L'inventario è vuoto.");
        } else {
            System.out.println("--- Inventario ---");
            for (Oggetto o : oggetti) {
                System.out.println(o);
            }
        }
    }

    public boolean possiedeOggetto(String nome, int quantita) {
        for (Oggetto o : oggetti) {
            if (o.getNome().equals(nome) && o.getQuantita() >= quantita) {
                return true;
            }
        }
        return false;
    }
}
