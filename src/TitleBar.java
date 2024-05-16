import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    JLabel TitleText= new JLabel("To Do List App");

    public TitleBar(){

        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(new Color(22, 75, 96));
TitleText.setPreferredSize(new Dimension(200,80));
Color green =new Color(162, 255, 134);
TitleText.setFont(new Font("Sans-serif",Font.BOLD,20));
        TitleText.setForeground(Color.green);

TitleText.setHorizontalAlignment(JLabel.CENTER);
this.add(this.TitleText);

    }
}
