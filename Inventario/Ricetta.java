package Inventario;

import java.util.HashMap;

public class Ricetta {
    private String nomeRisultato;
    private HashMap<String, Integer> ingredienti;

    public Ricetta(String nomeRisultato) {
        this.nomeRisultato = nomeRisultato;
        this.ingredienti = new HashMap<>();
    }

    public void aggiungiIngrediente(String nome, int quantita) {
        ingredienti.put(nome, quantita);
    }

    public boolean puoCreare(Inventario inventario) {
        for (String ingrediente : ingredienti.keySet()) {
            if (!inventario.possiedeOggetto(ingrediente, ingredienti.get(ingrediente))) {
                return false;
            }
        }
        return true;
    }

    public void creaOggetto(Inventario inventario) {
        if (puoCreare(inventario)) {
            for (String ingrediente : ingredienti.keySet()) {
                inventario.rimuoviOggetto(ingrediente, ingredienti.get(ingrediente));
            }
            inventario.aggiungiOggetto(new Oggetto(nomeRisultato, "Craftato", 1));
            System.out.println(nomeRisultato + " creato con successo!");
        } else {
            System.out.println("Ingredienti insufficienti per creare " + nomeRisultato);
        }
    }
}
