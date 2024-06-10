package lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

public class StringUtility extends JFrame implements ActionListener {
    private JPanel myPanel;
    private JTextField inputField;
    private JTextField outputField;
    private JButton countButton;
    private JButton reverseButton;
    private JButton removeButton;

    public StringUtility() {
        super("String Utility"); // Set window title

        setContentPane(myPanel);
        setVisible(true);
        setLocationRelativeTo(null);

        // Initialize UI components
        inputField = new JTextField();
        outputField = new JTextField();
        countButton = new JButton("Count Letters");
        reverseButton = new JButton("Reverse Letters");
        removeButton = new JButton("Remove Duplicates");

        // Set layout manager with two columns of equal width
        setLayout(new GridLayout(1, 2, 0, 0));

        // Create a panel for buttons (vertical box layout)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 0, 25));


        // Add buttons to the button panel
        buttonPanel.add(countButton);
        buttonPanel.add(reverseButton);
        buttonPanel.add(removeButton);

        // Add components to the frame
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(15, 40, 30, 15));
        add(buttonPanel);

        // Create a separate panel for text fields (vertical box layout)
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(5, 2, 10, 0));

        textPanel.add(new JLabel("Input:", JLabel.LEFT));
        textPanel.add(inputField);
        textPanel.add(new JLabel("Output:", JLabel.LEFT));
        textPanel.add(outputField);

        textPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 35));
        add(textPanel);

        // Register button click listeners
        countButton.addActionListener(this);
        reverseButton.addActionListener(this);
        removeButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputText = inputField.getText();
        String outputText = "";

        if (e.getSource() == countButton) {
            outputText = String.valueOf(countLetters(inputText));
        } else if (e.getSource() == reverseButton) {
            outputText = reverseLetters(inputText);
        } else if (e.getSource() == removeButton) {
            outputText = removeDuplicateChars(inputText);
        }

        outputField.setText(outputText);
    }

    private int countLetters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    private String reverseLetters(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    private String removeDuplicateChars(String str) {
        // Use a HashSet to store unique characters
        HashSet<Character> charSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (charSet.add(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        StringUtility app = new StringUtility();
        app.setSize(500, 250);
        app.setVisible(true);
    }
}
