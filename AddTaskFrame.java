import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTaskFrame extends JFrame {

    AddTaskFrame(MainFrame tsk){
        JLabel lbTask = new JLabel();
        lbTask.setText("Task: ");

        JTextField tfTask = new JTextField("", 50);

        JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5 , 5));
        painel.add(lbTask);
        painel.add(tfTask);
        add(painel);
        JButton btTask = new JButton("Register");
        add(btTask);
        
        pack();

        btTask.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                    tsk.addTask(tfTask.getText());
                    JOptionPane.showMessageDialog(null, "Task cadastrada!");
                    dispose();
            }
        });

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }
}
