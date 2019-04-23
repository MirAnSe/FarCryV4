import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Canvas extends JPanel{
    private Model model;
    Canvas(Model model){
        this.model=model;
        setBackground(Color.gray);
        setOpaque(true);
    }

    public void paint(Graphics pen){
        super.paint(pen);

        //pen.setColor(Color.black);
        //pen.drawString("reload button",model.x,model.y);

        pen.setColor(Color.BLUE);
        pen.drawRect(model.x1, model.y1, model.width1,model.height1);


        pen.setColor(Color.black);
        pen.drawRect(model.x2, model.y2,model.width2,model.height2);
    }
}
