package Drawing;
import javax.swing.*;
import java.awt.*;

public class canvas extends JPanel {
    private Line Line1;
    private Line Line2;

    public canvas(Line Line1, Line Line2){
        this.Line1 = Line1;
        this.Line2 = Line2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//  -----------First Line-----------
        g.drawLine((int)Line1.getStart().getX(),(int)Line1.getStart().getY(),(int)Line1.getEnd().getX(),(int)Line1.getEnd().getY());
// -----------Second Line-----------
        g.drawLine((int)Line2.getStart().getX(),(int)Line1.getStart().getY(),(int)Line2.getEnd().getX(),(int)Line2.getEnd().getY());
    }
}
