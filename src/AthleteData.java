import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AthleteData extends JFrame implements ActionListener {
    private JTextField ageField, weightField, startNumberField, netTimeField, grossTimeField, ageCategoryField, additionalCategoryField;
    private JButton submitButton;
    private JLabel ageLabel, weightLabel, startNumberLabel, netTimeLabel, grossTimeLabel, ageCategoryLabel, additionalCategoryLabel;
    private JPanel inputPanel;

    public AthleteData() {
        setTitle("Athlete Data");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        ageLabel = new JLabel("Wiek: ");
        weightLabel = new JLabel("Waga: ");
        startNumberLabel = new JLabel("Numer startowy: ");
        netTimeLabel = new JLabel("Czas netto: ");
        grossTimeLabel = new JLabel("Czas brutto: ");
        ageCategoryLabel = new JLabel("Kategoria wiekowa: ");
        additionalCategoryLabel = new JLabel("Kategoria dodatkowa: ");
        ageField = new JTextField();
        weightField = new JTextField();
        startNumberField = new JTextField();
        netTimeField = new JTextField();
        grossTimeField = new JTextField();
        ageCategoryField = new JTextField();
        additionalCategoryField = new JTextField();
        submitButton = new JButton("Wyślij");
        submitButton.addActionListener(this);

        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(8, 2));
        inputPanel.add(ageLabel);
        inputPanel.add(ageField);
        inputPanel.add(weightLabel);
        inputPanel.add(weightField);
        inputPanel.add(startNumberLabel);
        inputPanel.add(startNumberField);
        inputPanel.add(netTimeLabel);
        inputPanel.add(netTimeField);
        inputPanel.add(grossTimeLabel);
        inputPanel.add(grossTimeField);
        inputPanel.add(ageCategoryLabel);
        inputPanel.add(ageCategoryField);
        inputPanel.add(additionalCategoryLabel);
        inputPanel.add(additionalCategoryField);
        inputPanel.add(submitButton);
        add(inputPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int age = Integer.parseInt(ageField.getText());
            double weight = Double.parseDouble(weightField.getText());
            int startNumber = Integer.parseInt(startNumberField.getText());
            double netTime = Double.parseDouble(netTimeField.getText());
            double grossTime = Double.parseDouble(grossTimeField.getText());
            String ageCategory = ageCategoryField.getText();
            String additionalCategory = additionalCategoryField.getText();

            String message = "Zawodnik o numerze startowym " + startNumber + "\n"
                    + "Ma wiek " + age + " lat, waży " + weight + " kg.\n"
                    + "Jego czas netto to " + netTime + " sekund, a czas brutto to " + grossTime + " sekund.\n"
                    + "Zaliczony do kategorii wiekowej " + ageCategory + " i kategorii dodatkowej " + additionalCategory + ".";

            JOptionPane.showMessageDialog(this, message, "Informacje o zawodniku", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Proszę podać poprawne dane", "Błąd", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new AthleteData();
    }
}

//Program tworzy GUI zawierające pola tekstowe do wprowadzania danych
// zawodnika oraz przycisk do ich wysłania. Gdy przycisk jest kliknięty,
// program sprawdza czy wszystkie dane są prawidłowe, i jeśli tak,
// wyświetla okno dialogowe z całymi informacjami o zawodniku, w
// przeciwnym wypadku wyświetli odpowiedni komunikat błędu.
