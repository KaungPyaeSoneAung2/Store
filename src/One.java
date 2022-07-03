import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class One extends JFrame{
    private JList itemName;
    private JList itemPrice;
    private JList itemQty;
    private JList itemTotal;
    private JButton addItem;
    private JButton deleteItem;
    private JButton button3;
    private JButton button4;
    private JScrollPane scrollBar;
    private JPanel mainPanel;
    private JLabel topLabel;
    private JLabel price;
    private JLabel qty;
    private JLabel total;
    private JLabel Name;
    private JLabel totalPice;
    private JLabel totalLabel;

    public One() {
        setContentPane(mainPanel);
        setTitle("Welcome Sir");
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        scrollBar.setViewportView(itemName);
        scrollBar.setViewportView(itemPrice);
        scrollBar.setViewportView(itemQty);
        scrollBar.setViewportView(itemTotal);
        addItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==addItem){

                }
            }
        });
    }

    public static void main(String[] args) {
        One one = new One();

    }
}
