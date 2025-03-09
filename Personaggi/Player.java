package Personaggi;

public class Player {
    private float x, y, z; // Posizione del giocatore

    public Player() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public void moveForward() {
        z -= 0.1f; // Movimento in avanti
    }

    public void moveBackward() {
        z += 0.1f; // Movimento indietro
    }

    public void moveLeft() {
        x -= 0.1f; // Movimento a sinistra
    }

    public void moveRight() {
        x += 0.1f; // Movimento a destra
    }

    // Aggiungi metodi per ottenere la posizione, se necessario
}

