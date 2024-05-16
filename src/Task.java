import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Task  extends JButton{
    private JLabel index;
    private JTextField TaskName;
    private JButton Done;
    private JButton Remove;
    public Task(){
        GridLayout layoutTask=new GridLayout(1,4);
        layoutTask.setHgap(5);
        this.setPreferredSize(new Dimension(400,20));
        this.setBackground(new Color(79, 192, 208));
        this.setLayout(layoutTask);
        index= new JLabel("");
        index.setPreferredSize(new Dimension(10,20));
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(new Color(79, 192, 208));
        this.add(this.index);
        TaskName=new JTextField("Enter Task");
        TaskName.setPreferredSize(new Dimension(10,20));
        TaskName.setBorder(BorderFactory.createEmptyBorder());
        TaskName.setBackground(new Color(79, 192, 208));
        this.add(TaskName);
        Done=new JButton("Done");
        Done.setPreferredSize(new Dimension(10,20));
        this.add(Done);

        Remove=new JButton("Remove");
        Remove.setPreferredSize(new Dimension(10,20));
        this.add(Remove);
    }
    public void writeindexj1(int n){
        this.index.setText(String.valueOf(n));
        this.revalidate();
    }
    public JButton getdonej(){
        return this.Done;
    }
    public JButton getremovej(){
        return this.Remove;
    }
    public void doneSatutus(){
        this.TaskName.setBackground(new Color(127, 255, 212));
        this.index.setBackground(new Color(127, 255, 212));
        this.Remove.setBackground(new Color(127, 255, 212));
        this.Done.setBackground(new Color(127, 255, 212));
        this.setBackground(new Color(127, 255, 212));
        revalidate();

    }
}
