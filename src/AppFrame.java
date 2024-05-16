import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {
    private JButton addtask;
    private JButton clear;
    List list = new List();
    TitleBar titleBar = new TitleBar();
    BtnPanel btnPanel = new BtnPanel();

    public AppFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.titleBar, BorderLayout.NORTH);
        this.add(this.btnPanel, BorderLayout.SOUTH);
        this.add(this.list, BorderLayout.CENTER);

        addtask = btnPanel.getaddTaskBtn();
        clear = btnPanel.getClearBtn();
        addListner();
    }

    public void addListner() {
        addtask.addMouseListener(new MouseAdapter() {


            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.indexnumber();
                revalidate();
                JButton done = task.getdonej();
                done.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.doneSatutus();
                        revalidate();
                    }
                });
                JButton remove = task.getremovej();
                remove.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        list.remove(task);
                        list.indexnumber();
                        revalidate();
                        repaint();
                    }
                });
            }


        });
clear.addMouseListener(new MouseAdapter() {
    @Override
    public void mousePressed(MouseEvent e) {
        Component[] tasklist=list.getComponents();
        for(int i=0;i<tasklist.length;i++){
            if(tasklist[i] instanceof Task){
                list.remove((Task)tasklist[i]);
            }
        }
        revalidate();
        repaint();
    }
});
    }

}
