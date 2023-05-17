import javax.swing.*;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Form");
        JButton b = new JButton("click");
        b.setBounds(25, 100, 100, 10);
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
