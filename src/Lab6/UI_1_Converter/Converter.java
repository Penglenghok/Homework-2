package Lab6.UI_1_Converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Converter extends JFrame {

    private static final double mile_kilometer_conversion_value = 1.60934;
    private static final double pound_kilogram_conversion_value = 0.453592;
    private static final double gallon_liter_conversion_value = 3.78541;

    private static final short two_decimal_point = 2;
    private static final short six_decimal_point = 6;

    private JPanel mainPanel;
    private JTextField txtMile;
    private JTextField txtKilometer;
    private JTextField txtPound;
    private JTextField txtKilogram;
    private JTextField txtGallon;
    private JTextField txtLiter;
    private JTextField txtFahrenheit;
    private JTextField txtCentigrade;
    private JButton convertButton;

    public Converter()
    {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE) ;
        setTitle("Metric Conversion Assistant");
        setSize(600,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setContentPane(mainPanel);
        txtMile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.paramString());
            }
        });
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Convert();
            }
        });
    }

    private void Convert()
    {
        StringBuilder errors = new StringBuilder();
        errors.append(Convert(txtMile, txtKilometer, ConversionType.MILE_KILOMETER, two_decimal_point));
        errors.append(Convert(txtPound, txtKilogram, ConversionType.POUND_KILOGRAM, two_decimal_point));
        errors.append(Convert(txtGallon, txtLiter, ConversionType.GALLON_LITER, two_decimal_point));
        errors.append(Convert(txtFahrenheit, txtCentigrade, ConversionType.FAHRENHEIT_CENTIGRADE, six_decimal_point));
        if (!errors.isEmpty())
        {
            JOptionPane.showMessageDialog(null, errors, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String Convert(JTextField txtLeft, JTextField txtRight, ConversionType type, short decimalPlace)
    {
        if((txtLeft.getText().isEmpty() || txtLeft.getText().isBlank()) &&
                (txtRight.getText().isEmpty() || txtRight.getText().isBlank()))
        {
            return "";
        }

        ParseDoubleValue dLeft = ParseDouble(txtLeft.getText());
        ParseDoubleValue dRight = ParseDouble(txtRight.getText());

        if(!dLeft.isValid && !dRight.isValid)
        {
            return getErrorInvalidText(type);
        }

        String format = "%."+decimalPlace+"f";

        if (dLeft.isValid)
        {
            double result = ConvertValue(dLeft.value, type, LeftRight.LEFT_TO_RIGHT);

            txtLeft.setText(String.format(format,dLeft.value));
            txtRight.setText(String.format(format, result));
        }
        else
        {
            double result = ConvertValue(dRight.value, type, LeftRight.RIGHT_TO_LEFT);
            txtLeft.setText(String.format(format, result));
            txtRight.setText(String.format(format, dRight.value));
        }

        return "";
    }

    private ParseDoubleValue ParseDouble(String value)
    {
        try{
            return new ParseDoubleValue(Double.parseDouble(value), true);
        }catch (Exception ex){
            return new ParseDoubleValue(0, false);
        }
    }

    private String getErrorInvalidText(ConversionType type)
    {
        String str = switch (type){
            case MILE_KILOMETER -> "Mile and Kilometer";
            case POUND_KILOGRAM -> "Pound and Kilogram";
            case GALLON_LITER -> "Gallon and Liter";
            case FAHRENHEIT_CENTIGRADE -> "Fahrenheit and Centigrade";
        };

        return String.format("Invalid %s values.%n",str);
    }

    private double ConvertValue(double value, ConversionType type, LeftRight leftRight)
    {
        return switch (type)
        {
            case MILE_KILOMETER -> leftRight == LeftRight.LEFT_TO_RIGHT ? value * mile_kilometer_conversion_value : value / mile_kilometer_conversion_value;
            case POUND_KILOGRAM -> leftRight == LeftRight.LEFT_TO_RIGHT ? value * pound_kilogram_conversion_value : value / pound_kilogram_conversion_value;
            case GALLON_LITER -> leftRight == LeftRight.LEFT_TO_RIGHT ? value * gallon_liter_conversion_value : value / gallon_liter_conversion_value;
            case FAHRENHEIT_CENTIGRADE -> leftRight == LeftRight.LEFT_TO_RIGHT ? (value-32)*((double) 5 /9) : (value * ((double) 9 /5))+32;
        };
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Converter frm = new Converter();
            }
        });
    }

    public enum ConversionType
    {
        MILE_KILOMETER,
        POUND_KILOGRAM,
        GALLON_LITER,
        FAHRENHEIT_CENTIGRADE
    }

    public enum LeftRight
    {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }
}





