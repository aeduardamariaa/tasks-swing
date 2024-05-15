import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame{
    
    private ArrayList<String> tasks = new ArrayList<>();
    private JList<String> displayList;
    JScrollPane scrollPane;

    MainFrame() {
        displayList = new JList<>(tasks.toArray(new String[0]));
        scrollPane = new JScrollPane(displayList);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton btTask = new JButton("New Task");
        add(btTask);

        MainFrame self = this;
        btTask.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                AddTaskFrame frame = new AddTaskFrame(self);
                frame.pack();
                frame.setVisible(true);
            }
        });
        add(scrollPane);
        pack();
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }
    void addTask(String task)
    {
        tasks.add(task);
        // JLabel label = new JLabel(task);
        displayList = new JList<>(tasks.toArray(new String[0])); //lista, não a entrada
        scrollPane.setViewportView(displayList);

        // add(label);
    }
}
