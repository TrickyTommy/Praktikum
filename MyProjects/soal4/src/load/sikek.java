package load;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.*;
import java.*;

public class sikek {

    private JProgressBar JP;
    private JFrame frame;
    private JPanel panel;

    

    public void Pro() {
        frame = new JFrame();
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 35));
        JP = new JProgressBar(0, 100);
        JP.setStringPainted(true);
        panel.add(JP);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
        Task();
    }

    public void Task() {
        for (int i = 0; i <= 100; i++) {
            try {
                JP.setValue(i);
                Thread.sleep(50);
                
                    
            } catch (Exception e) {
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "Anda berhasil login");
    }
}