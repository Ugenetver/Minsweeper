import javax.swing.*;
import java.awt.*;

public class Sweeper extends JFrame {

    JPanel panel;

    public static void main(String[] args) {
        new Sweeper();
    }

    public Sweeper(){
        panel = new JPanel();
        //window size
        panel.setPreferredSize(new Dimension(500, 300));
        add (panel);
        //close window
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //shows window on center
        setLocationRelativeTo(null);
        setVisible(true);

    }

}
