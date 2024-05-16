import javax.swing.*;
import java.awt.*;

public class List extends JPanel {
    public List(){
        GridLayout layout=new GridLayout(10,1);
        layout.setVgap(5);
        this.setLayout(layout);

    }
    public void indexnumber(){
        Component[] listcomp=this.getComponents();
        for (int i=0;i<listcomp.length;i++){
            if(listcomp[i] instanceof Task){
                ((Task)listcomp[i]).writeindexj1(i+1);
            }
        }
    }
}
