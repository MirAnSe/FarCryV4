import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class Viewer {


    private Canvas canvas;

    Viewer(){
        Controller controller = new Controller(this);

        Model model = controller.getModel();
        canvas = new Canvas(model);

        JFrame frame = new JFrame("FarCry V1.2");
        frame.setSize(800,800);
        frame.setLocation(200,0);
        frame.add("Center",canvas);
        frame.setVisible(true);
        frame.addKeyListener(controller);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void update(){
       canvas.repaint();
    }
}
