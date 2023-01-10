import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DrawShape extends JFrame implements ActionListener {
    private JButton rectButton, treeButton, triangleButton, fullRectButton;
    private JTextField widthField, heightField, characterField;
    private JLabel widthLabel, heightLabel, characterLabel;
    private JPanel buttonPanel, inputPanel;

    public DrawShape() {
        setTitle("Draw Shape");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        rectButton = new JButton("Prostokąt");
        rectButton.addActionListener(this);
        treeButton = new JButton("Choinka");
        treeButton.addActionListener(this);
        triangleButton = new JButton("Trójkąt");
        triangleButton.addActionListener(this);
        fullRectButton = new JButton("Pełny Prostokąt");
        fullRectButton.addActionListener(this);

        widthLabel = new JLabel("Szerokość: ");
        heightLabel = new JLabel("Wysokość: ");
        characterLabel = new JLabel("Znak: ");
        widthField = new JTextField();
        heightField = new JTextField();
        characterField = new JTextField();

        buttonPanel = new JPanel();
        buttonPanel.add(rectButton);
        buttonPanel.add(treeButton);
        buttonPanel.add(triangleButton);
        buttonPanel.add(fullRectButton);
        add(buttonPanel);

        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(widthLabel);
        inputPanel.add(widthField);
        inputPanel.add(heightLabel);
        inputPanel.add(heightField);
        inputPanel.add(characterLabel);
        inputPanel.add(characterField);
        add(inputPanel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int width, height;
        String character;
        try {
            width = Integer.parseInt(widthField.getText());
            height = Integer.parseInt(heightField.getText());
            character = characterField.getText();

            if (e.getSource() instanceof JButton) {
                JButton clickedButton = (JButton) e.getSource();
                String buttonText = clickedButton.getText();
                if (buttonText.equals("Prostokąt")) {
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print(character);
                        }
                        System.out.println();
                    }
                } else if (buttonText.equals("Choinka")) {
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(character);
                        }
                        System.out.println();
                    }
                } else if (buttonText.equals("Trójkąt")) {
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(character);
                        }
                        System.out.println();
                    }
                } else if (buttonText.equals("Pełny Prostokąt")) {
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print(character);
                        }
                        System.out.println();
                    }
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Proszę podać poprawne dane", "Błąd", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new DrawShape();
    }
}