package Calculator.sandbox.sandbox;

/*Generated by MPS */

import javax.swing.JFrame;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class TestCalculator extends JFrame {
  private DocumentListener listener = new DocumentListener() {
    public void insertUpdate(DocumentEvent p0) {
      update();
    }

    public void removeUpdate(DocumentEvent p0) {
      update();
    }

    public void changedUpdate(DocumentEvent p0) {
      update();
    }
  };
  private JTextField inputField_a = new JTextField();
  private JTextField inputField_b = new JTextField();
  private JTextField inputField_c = new JTextField();
  private JTextField outputField_a = new JTextField();

  public TestCalculator() {
    setTitle("TestCalculator");
    setLayout(new GridLayout(0, 2));
    inputField_a.getDocument().addDocumentListener(listener);
    add(new JLabel("Java"));
    add(inputField_a);
    inputField_b.getDocument().addDocumentListener(listener);
    add(new JLabel("PHP"));
    add(inputField_b);
    inputField_c.getDocument().addDocumentListener(listener);
    add(new JLabel("Ruby"));
    add(inputField_c);
    add(new JLabel("Output"));
    add(outputField_a);
    update();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

  public void update() {
    int i_a = 0;
    int i_b = 0;
    int i_c = 0;
    try {
      i_a = Integer.parseInt(inputField_a.getText());
      i_b = Integer.parseInt(inputField_b.getText());
      i_c = Integer.parseInt(inputField_c.getText());
    } catch (NumberFormatException e) {
      System.out.print(e);
    }
    outputField_a.setText("" + (10 * i_a + 4 * i_b + 12 * i_c));
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new TestCalculator();
      }
    });
  }
}