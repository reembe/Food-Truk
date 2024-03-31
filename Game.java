import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.w3c.dom.events.MouseEvent;

public class Game extends JFrame implements ActionListener {

    private JButton button;
    private JButton button2;
    private JButton button3;
    private ImageIcon backgroundphoto;
    private ImageIcon sugar;
    private ImageIcon milk;
    private ImageIcon rice;
    private ImageIcon pancake;
    private ImageIcon flour;
    private ImageIcon egg;
    private ImageIcon ricepudding;
    private ImageIcon logo;
    private JLabel logoicon;
    private JLabel scroll1;
    private JButton instructionsscreenbutton;
    private JButton scrollbutton;
    private JLabel backgrounds;
	private JTextField textField;
    private int buttonsPressed;
    private String currentOption;
    private JLabel intro;
    private JLabel intro1;
    private  Timer timer = new Timer();
	


    public Game() throws FontFormatException, IOException{

        File font_file = new File("joystix.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
        Font sizedFont = font.deriveFont(40f);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(2256,1504);
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Food Truk");

        backgroundphoto = new ImageIcon(this.getClass().getResource("/mainmenutruck (1).jpg"));
        backgrounds = new JLabel(backgroundphoto);
        backgrounds.setSize(1000, 1000);

        BufferedImage buttonIcon2 = ImageIO.read(new File("playscroll.png"));
        BufferedImage buttonIcon3 = ImageIO.read(new File("quitscroll-removebg-preview.png"));
        BufferedImage buttonIcon4 = ImageIO.read(new File("tutscroll-removebg-preview.png"));
        BufferedImage buttonIcon = ImageIO.read(new File("scroll.png"));
   
        File font_file1 = new File("joystix.ttf");
        Font font1 = Font.createFont(Font.TRUETYPE_FONT, font_file);
        Font sizedFont1 = font.deriveFont(8f);

       

        JLabel intro = new JLabel();
        intro.setText("Play");
        intro.setBounds(1150,300,300,200);
        intro.setForeground(Color.black);
        intro.setFont(sizedFont);

        JLabel intro1 = new JLabel();
        intro1.setText("Guide");
        intro1.setBounds(1150,500,300,200);
        intro1.setForeground(Color.BLACK);
        intro1.setFont(sizedFont);


        button = new JButton("");
		button.addActionListener(this);
        button.setIcon(new ImageIcon(buttonIcon));
        button.setBounds(1100,500,300,200);
        button.setBackground(Color.white);
		button.setForeground(Color.black);
        button.setFont(sizedFont1);
        button.setBorder(BorderFactory.createEmptyBorder());

        button2 = new JButton("");
		button2.addActionListener(this);
        button2.setIcon(new ImageIcon(buttonIcon));
        button2.setBounds(1100,700,300,200);
        button2.setBackground(Color.white);
		button2.setForeground(Color.black);
        button2.setFont(sizedFont1);
        button2.setBorder(BorderFactory.createEmptyBorder());

        button3 = new JButton("");
		button3.addActionListener(this);
        button3.setIcon(new ImageIcon(buttonIcon));
        button3.setBounds(1100,300,300,200);
        button3.setBackground(Color.white);
		button3.setForeground(Color.black);
        button3.setFont(sizedFont1);
        button3.setBorder(BorderFactory.createEmptyBorder());

        JLabel name = new JLabel();
        name.setText("Name:");
        name.setBounds(200,430,100000,100);
        name.setForeground(Color.black);
        name.setFont(sizedFont);

		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(sizedFont);
        textField.setBounds(200,500,1000,100);
		textField.setForeground(Color.black);
		textField.setBackground(Color.white);
		textField.setCaretColor(Color.black);
	
        
        this.add(intro1);
        this.add(intro);


        this.add(button);
        this.add(button2);
        this.add(button3);
        this.add(backgrounds);

        logo = new ImageIcon(this.getClass().getResource("/logoclear.png"));
        logoicon = new JLabel(logo);
        logoicon.setBounds(1000,0,500,400);

        this.add(logoicon);

        this.setVisible(true);
        
    }

    public void GameStart() throws FontFormatException, IOException{

        this.repaint();

        File font_file = new File("joystix.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
        Font sizedFont = font.deriveFont(40f);


        //make this level, customers completed, or total money
        JLabel title1 = new JLabel();
        title1.setText("[LEVEL 1]");
        title1.setBounds(1100,15,10000000,100);
        title1.setForeground(Color.black);
        title1.setFont(sizedFont);

        JLabel title = new JLabel();
        title.setText("Orders:");
        title.setBounds(1100,15,10000000,100);
        title.setForeground(Color.black);
        title.setFont(sizedFont);

        JLabel intro = new JLabel();
        intro.setText("Recipes:");
        intro.setBounds(1100,520,100000,100);
        intro.setForeground(Color.black);
        intro.setFont(sizedFont);

        JLabel intro1 = new JLabel();
        intro1.setText("-Pancake- ");
        intro1.setBounds(1050,600,10000000,100);
        intro1.setForeground(Color.BLACK);
        intro1.setFont(sizedFont);

        JLabel intro11 = new JLabel();
        intro11.setText("flour + egg");
        intro11.setBounds(1050,650,10000000,100);
        intro11.setForeground(Color.BLACK);
        intro11.setFont(sizedFont);

        JLabel intro2 = new JLabel();
        intro2.setText("->pan");
        intro2.setBounds(1050,700,10000000,100);
        intro2.setForeground(Color.BLACK);
        intro2.setFont(sizedFont);

        JLabel intro3 = new JLabel();
        intro3.setText("-Rice pudding- ");
        intro3.setBounds(1000,800,10000000,100);
        intro3.setForeground(Color.BLACK);
        intro3.setFont(sizedFont);

        JLabel intro4 = new JLabel();
        intro4.setText("egg + sugar");
        intro4.setBounds(1050,850,10000000,100);
        intro4.setForeground(Color.BLACK);
        intro4.setFont(sizedFont);

        JLabel intro5 = new JLabel();
        intro5.setText("+ rice");
        intro5.setBounds(1050,900,10000000,100);
        intro5.setForeground(Color.BLACK);
        intro5.setFont(sizedFont);

        
        backgroundphoto = new ImageIcon(this.getClass().getResource("/fotor-ai-20240312143838 (1) (1).jpg"));
        backgrounds = new JLabel(backgroundphoto);
        backgrounds.setSize(1000, 1000);
   

        this.add(title);
        this.add(intro);
        this.add(intro1);
        this.add(intro11);
        this.add(intro3);
        this.add(intro4);
        this.add(intro5);
        this.add(intro2);
        this.add(backgrounds);
        this.setVisible(true);

        // ImageIcon icon1= new ImageIcon(getClass().getResource( "/Images/milk.png"));
        // milk = icon1.getImage().getScaledInstance( 300,  250, Image.SCALE_SMOOTH);


        // ImageIcon icon2= new ImageIcon(getClass().getResource("/Images/sugar.png"));
        // sugar = icon2.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
        // ImageIcon icon3= new ImageIcon(getClass().getResource("/Images/egg.png"));
        // egg = icon3.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
        // ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/lettuce.png"));
        // pancake = icon4.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
        // ImageIcon icon5 = new ImageIcon(getClass().getResource( "/Images/tomato.png"));
        // flour = icon5.getImage().getScaledInstance( 300,250, Image.SCALE_SMOOTH);
        // ImageIcon icon6= new ImageIcon(getClass().getResource( "/Images/cheese.png"));
        // ricepudding = icon6.getImage().getScaledInstance(300,250, Image.SCALE_SMOOTH);
       
        // Graphics2D g2D = (Graphics2D) g;
        //     g2D.drawImage(sugar,1000,  50,  null);
        //     g2D.drawImage(egg, 1105,  420,  null);
        //     g2D.drawImage(milk, 1150,  15,  null);
        //     g2D.drawImage(flour,  1000, 250,  null);
       
}

public void paint(Graphics2D g){
   
    Graphics2D g2D = (Graphics2D) g;
    // g2D.drawImage(sugar,1000,  50,  null);
    // g2D.drawImage(egg, 1105,  420,  null);
    // g2D.drawImage(milk, 1150,  15,  null);
    // g2D.drawImage(flour,  1000, 250,  null);
//     g2D.drawImage(tomatoImg, x 1000, y: 200, observer: null);
//     g2D.drawImage(cheeseImg, x: 1200, y: 240, observer: null); g20.drawImage(pattyImg, x: 1210, y: 450, observer: null);
//     g2D.drawImage(bottomBunImg, x: 950, y: 420, observer: null);
//     g2D.drawImage(bunImg, startX, starty, null);
    }


public void InstructionsScreen() throws IOException{

    this.repaint();
    backgroundphoto = new ImageIcon(this.getClass().getResource("/instructions (3).jpg"));
    backgrounds = new JLabel(backgroundphoto);
    backgrounds.setSize(1620, 1456);

    BufferedImage buttonIcon = ImageIO.read(new File("scroll.png"));
    scrollbutton = new JButton(new ImageIcon(buttonIcon));

    instructionsscreenbutton = new JButton("Submit Name");
    instructionsscreenbutton.addActionListener(this);
    instructionsscreenbutton.setIcon(new ImageIcon(buttonIcon));
    instructionsscreenbutton.setBounds(200,200,300,200);
    instructionsscreenbutton.setBackground(Color.white);
    instructionsscreenbutton.setForeground(Color.black);
    instructionsscreenbutton.setBorder(BorderFactory.createEmptyBorder());

    this.add(backgrounds);
    this.add(instructionsscreenbutton);
    // this.addMouseListener(new MouseAdapter());
    this.setVisible(true);

}

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button3) {
		
            this.remove(button);
            this.remove(button2);
            this.remove(button3);
            this.remove(backgrounds);
            // //this.remove(intro);
            // this.remove(intro1);
            this.remove(logoicon);
            
            try {
                this.revalidate(); 
             
                GameStart();
                    } catch (FontFormatException | IOException e1) {
                      
                        e1.printStackTrace();
                    }
             
		}

        if(e.getSource()==button) {
			this.remove(button);
            this.remove(button2);
            this.remove(button3);
            this.remove(backgrounds);
            this.revalidate(); 
            try {
                InstructionsScreen();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
		}

        if(e.getSource()==button2) {
			System.exit(0);
             
		}
        if(e.getSource() == instructionsscreenbutton)
        {
            this.setVisible(false);
            try {
                Game game = new Game();
            } catch (FontFormatException | IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }


        }
    }

    
}
