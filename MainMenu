import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    private JFrame frame;
    private JPanel panel;
    private JButton newGameButton, continueButton, exitButton;

    public MainMenu() {
        frame = new JFrame("Menu Iniziale");
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        newGameButton = new JButton("Nuovo Mondo");
        continueButton = new JButton("Continua");
        exitButton = new JButton("Esci");

        panel.add(newGameButton);
        panel.add(continueButton);
        panel.add(exitButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(panel);
        frame.setLocationRelativeTo(null); // Centrato sullo schermo

        // ActionListener per i pulsanti
        newGameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startNewGame();
            }
        });

        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                continueGame();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    private void startNewGame() {
        // Aggiungi la logica per generare un nuovo mondo
        System.out.println("Nuovo Mondo Generato!");
        frame.dispose();
        // Carica il gioco o la mappa
    }

    private void continueGame() {
        // Aggiungi la logica per caricare il gioco salvato
        System.out.println("Caricando il gioco...");
        frame.dispose();
        // Carica il gioco o la mappa
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}
