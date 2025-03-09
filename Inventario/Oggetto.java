package Inventario;

public class Oggetto {
    private String nome;
    private String tipo; // es. "Materiale", "Arma", "Pozione", ecc.
    private int quantita;

    public Oggetto(String nome, String tipo, int quantita) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void aggiungiQuantita(int quantita) {
        this.quantita += quantita;
    }

    public void rimuoviQuantita(int quantita) {
        if (this.quantita >= quantita) {
            this.quantita -= quantita;
        } else {
            System.out.println("Quantità insufficiente di " + nome);
        }
    }

    @Override
    public String toString() {
        return nome + " (x" + quantita + ") - Tipo: " + tipo;
    }
}

