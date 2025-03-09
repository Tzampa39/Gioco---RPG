package Inventario;

public class CraftingSystem {
    public static void creaSpada(Inventario inventario) {
        Ricetta spada = new Ricetta("Spada di Ferro");
        spada.aggiungiIngrediente("Ferro", 3);
        spada.aggiungiIngrediente("Legno", 2);
        spada.creaOggetto(inventario);
    }

    public static void creaPozione(Inventario inventario) {
        Ricetta pozione = new Ricetta("Pozione di Cura");
        pozione.aggiungiIngrediente("Erba Curativa", 2);
        pozione.aggiungiIngrediente("Acqua Pura", 1);
        pozione.creaOggetto(inventario);
    }
}

