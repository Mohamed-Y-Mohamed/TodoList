import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BtnPanel extends JPanel {
    private JButton addTask;
    private JButton clear;
    Border emptyborder=BorderFactory.createEmptyBorder();

    public BtnPanel(){
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(new Color(22, 75, 96));
addTask=new JButton("Add Task");
        addTask.setBorder(emptyborder);
        addTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
        this.add(addTask);
        this.add(Box.createHorizontalStrut(20));
        clear =new JButton(" Clear All tasks");
        clear.setFont(new Font("Sans-serif", Font.PLAIN,20));
        clear.setBorder(emptyborder);
        this.add(clear);

    }
    public JButton getaddTaskBtn()
    {
        return addTask;
    }
    public JButton getClearBtn(){
        return clear;

    }
}
