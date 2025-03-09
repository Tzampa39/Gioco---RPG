import javax.swing.*;

import Inventario.CraftingSystem;
import Inventario.Inventario;
import Inventario.Oggetto;

import java.awt.*;
import java.awt.event.*;

public class MainGUI extends JFrame {
    private JTextArea outputArea;
    private JButton btnCreaSpada, btnCreaPozione;
    private Inventario inventario;

    public MainGUI() {
        setTitle("RPG Crafting System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        btnCreaSpada = new JButton("Crea Spada");
        btnCreaPozione = new JButton("Crea Pozione");

        buttonPanel.add(btnCreaSpada);
        buttonPanel.add(btnCreaPozione);
        add(buttonPanel, BorderLayout.SOUTH);

        inventario = new Inventario();
        inventario.aggiungiOggetto(new Oggetto("Ferro", "Materiale", 5));
        inventario.aggiungiOggetto(new Oggetto("Legno", "Materiale", 3));

        aggiornaOutput("Inventario iniziale:\n");
        inventario.mostraInventario();

        btnCreaSpada.addActionListener(e -> {
            CraftingSystem.creaSpada(inventario);
            aggiornaOutput("Spada di Ferro creata!\n");
            mostraInventario();
        });

        btnCreaPozione.addActionListener(e -> {
            CraftingSystem.creaPozione(inventario);
            aggiornaOutput("Pozione di Cura creata!\n");
            mostraInventario();
        });
    }

    private void aggiornaOutput(String testo) {
        outputArea.append(testo);
    }

    private void mostraInventario() {
        outputArea.append("\nInventario Aggiornato:\n");
        inventario.mostraInventario();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainGUI gui = new MainGUI();
            gui.setVisible(true);
        });
    }
}
