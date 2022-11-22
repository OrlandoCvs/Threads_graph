
    import javax.swing.*;
import java.awt.*;

    public class Main {
        public static void main(String[] args) throws InterruptedException {
            int r1 = 0;
            int r2 = 0;
            int r3 = 0;
            int r4 = 0;
            JFrame.setDefaultLookAndFeelDecorated(true);
            JFrame ventana = new JFrame("grafica ");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setBackground(Color.white);
            ventana.setSize(800,800);

            val graph = new val(r1,r2,r3,r4);
            ventana.add(graph);
            ventana.setVisible(true);
            do {
                r1 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
                r2 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
                r3 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
                r4 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
                Thread t = new Thread(new Trds(r1, r2, r3, r4));
                t.start();
                t.sleep(10000L);
            } while (r1 != 0);
        }
    }

