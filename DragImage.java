import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class DragImage extends JComponent implements MouseMotionListener, MouseListener {

    private static final long serialVersionUID = 1L;
    private int imageWidth, imageHeight, gridw = 50, gridh = 50, imageX/* = gridw / 2 - imageWidth / 2*/, imageY/* = gridh / 2 - imageHeight / 2*/, onObject, checked;

    private Image image;

    DragImage(Image i, int imgX, int imgY, int imagewidth, int imageheight) {
        this.imageWidth = imagewidth;
        this.imageHeight = imageheight;
        this.imageX = imgX;
        this.imageY = imgY;
        this.image = i.getScaledInstance(imageWidth, imageHeight, 0);
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    public void mouseDragged(MouseEvent e) {
        //first checking if "onObject" is 1 to make sure that the mouse is on the image when it started dragging
        if(this.onObject == 1) {
            if((int) (Math.floor(e.getX() / this.gridw) * this.gridw + (this.gridw / 2) - (this.imageWidth / 2)) != this.imageX || (int) (Math.floor(e.getY() / this.gridh) * this.gridh + (this.gridh / 2) - (this.imageHeight / 2)) != this.imageY) {
                this.imageX = (int) (Math.floor(e.getX() / this.gridw) * this.gridw + (this.gridw / 2) - (this.imageWidth / 2));
                this.imageY = (int) (Math.floor(e.getY() / this.gridh) * this.gridh + (this.gridh / 2) - (this.imageHeight / 2));
                this.repaint();
            }
        }
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //repainting the object that you are dragging at the new location, which is determined by the math in "mouseDragged"
        g2.drawImage(this.image, this.imageX, this.imageY, this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        //this checks if the mouse is on the object when you start dragging, for the method mouseDragged runs when you drag, regardless of the mouse position
        System.out.println("");
        System.out.println("pressed, checked is now: " + this.checked);
        if(this.checked == 0 && (e.getX() >= this.imageX) && (e.getY() >= this.imageY) && (e.getX() <= this.imageX + (this.imageWidth)) && (e.getY() <= this.imageY + (this.imageHeight))) {
            this.onObject = 1;
            System.out.println("onObject: " + this.onObject);
        }
        //checked is a parameter, which is used to make sure that this method doesn't run all the time, but only when the mouse started dragging
        this.checked = 1;
        System.out.println("checked: " + this.checked);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("");
        System.out.println("released, checked is now: " + this.checked);
        this.onObject = 0;
        System.out.println("onObject: " + this.onObject);
        //setting checked to 0 when the mouse stops dragging, so when it starts dragging, it can check wether the mouse is on the image yes or no
        checked = 0;
        System.out.println("checked: " + this.checked);
    }


    //some unused implemented methods
    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}