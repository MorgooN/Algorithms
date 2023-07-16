// Blueprint, rather than working algorithm


import java.awt.*;
import javax.swing.*;

public class KochCurves
{
    // define recursion level
    int initialLevel = 0;
    public void init(){
        String StringLevel = JOptionPane.showInputDialog(" Enter the depth of recursion ");
        initialLevel = Integer.parseInt(StringLevel);

    }

    public void paint(Graphics z){
        drawKoch(z,0,20,280,280,280);
        drawKoch(z,0,280,280,150,20);
        drawKoch(z,0,150,20,20,280);
    }

    private void drawKoch(Graphics z, int level, int a1, int b1, int a5,int b5 ){
        int delX, delY, a2,b2,a3,b3,a4,b4;
        if (level == 0){
            z.drawLine(a1,b1,a5,b5);
        }


        delX = a5-a1;
        delY = b5-b1;
        a2 = a1+delX/3;
        b2=b1+delY/3;
        a3 = (int) (0.5*(a1+a5)+Math.sqrt(3)*(b1-b5)/6);
        b3 = (int) (0.5* (b1+b5) + Math.sqrt(3)*(a5-a1)/6);
        a4 = a1 + 2 * delX /3;
        b4 = b1 + 2 * delY /3;
        drawKoch (z,level-1, a1, b1, a2, b2);
        drawKoch (z,level-1, a2, b2, a3, b3);
        drawKoch (z,level-1, a3, b3, a4, b4);
        drawKoch (z,level-1, a4, b4, a5, b5);

    }

}
