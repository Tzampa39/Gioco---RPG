import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InventoryGUI extends JFrame {

    private JPanel inventoryPanel;
    private JPanel equipmentPanel;
    private JLabel infoLabel;

    public InventoryGUI() {
        setTitle("Inventario RPG");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Pannello inventario in stile griglia (come Minecraft)
        inventoryPanel = new JPanel(new GridLayout(4, 9, 5, 5));
        for (int i = 0; i < 36; i++) {
            JLabel slot = creaSlot("Slot " + (i + 1));
            inventoryPanel.add(slot);
        }

        // Pannello per equipaggiamento (Armi, Armature)
        equipmentPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        equipmentPanel.setBorder(BorderFactory.createTitledBorder("Equipaggiamento"));
        equipmentPanel.add(creaSlot("Arma"));
        equipmentPanel.add(creaSlot("Armatura"));
        equipmentPanel.add(creaSlot("Oggetto Speciale"));

        // Info sugli oggetti (hover)
        infoLabel = new JLabel(" ", JLabel.CENTER);
        infoLabel.setPreferredSize(new Dimension(100, 30));

        add(inventoryPanel, BorderLayout.CENTER);
        add(equipmentPanel, BorderLayout.EAST);
        add(infoLabel, BorderLayout.SOUTH);
    }

    // Metodo per creare uno slot con effetto hover
    private JLabel creaSlot(String info) {
        JLabel slot = new JLabel(" ", JLabel.CENTER);
        slot.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        slot.setPreferredSize(new Dimension(50, 50));
        slot.setOpaque(true);
        slot.setBackground(Color.DARK_GRAY);

        slot.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                infoLabel.setText(info + ": Oggetto misterioso");
                slot.setBackground(Color.LIGHT_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                infoLabel.setText(" ");
                slot.setBackground(Color.DARK_GRAY);
            }
        });

        return slot;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InventoryGUI gui = new InventoryGUI();
            gui.setVisible(true);
        });
    }
}

