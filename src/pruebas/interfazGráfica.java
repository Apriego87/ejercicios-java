package pruebas;
import javax.swing.*;

class gui{
   public static void main(String[] args) {
    JFrame frame = new JFrame("Interfaz");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextPane texto = new JTextPane();
    texto.setBounds(50, 100, 200, 30);

    frame.add(texto);
    frame.setSize(300, 300);

    frame.setLayout(null);
    frame.setVisible(true);
   }
}