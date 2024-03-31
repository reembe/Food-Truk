import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MainMenu extends JFrame implements ActionListener {

    private JButton button;
    private JButton option1;
    private JButton option2;
    private JButton option3;
	private JTextField textField;
    private int buttonsPressed;
    private String currentOption;

    public MainMenu() throws FontFormatException, IOException{

        // JLabel title = new JLabel();
        // title.setText("food truk");
        // title.setBounds(300,57,10000000,100);
        // title.setForeground(Color.black);
        // title.setFont(sizedFont);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080,1920);
        this.getContentPane().setBackground(new Color(255,238,255));
        this.setLayout(null);
        this.setResizable(true);
        this.setTitle("Food Truk");
        this.setVisible(true);

        File font_file = new File("joystix.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
        Font sizedFont = font.deriveFont(40f);

        File font_file1 = new File("joystix.ttf");
        Font font1 = Font.createFont(Font.TRUETYPE_FONT, font_file);
        Font sizedFont1 = font.deriveFont(8f);

        JLabel title = new JLabel();
        title.setText("FOOD TRUK - A COOKING SIMULATOR");
        title.setBounds(300,57,10000000,100);
        title.setForeground(Color.black);
        title.setFont(sizedFont);

        JLabel intro = new JLabel();
        intro.setText("Enter your name");
        intro.setBounds(100,107,100000,100);
        intro.setForeground(Color.black);
        intro.setFont(sizedFont);

        JLabel intro1 = new JLabel();
        intro1.setText("and Pick your Favorite meal");
        intro1.setBounds(500,157,10000000,100);
        intro1.setForeground(Color.BLACK);
        intro1.setFont(sizedFont);

        button = new JButton("Submit Name");
		button.addActionListener(this);
        button.setBounds(490,600,110,100);
        button.setBackground(Color.white);
		button.setForeground(Color.black);
        button.setFont(sizedFont1);


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
		// textField.setText("Name: ");

        option1 = new JButton("Breakfast");
		option1.addActionListener(this);
        option1.setBounds(600,600,100,100);
        option1.setBackground(Color.white);
		option1.setForeground(Color.black);
        option1.setFont(sizedFont1);

        option2 = new JButton("Lunch");
		option2.addActionListener(this);
        option2.setBounds(700,600,100,100);
        option2.setBackground(Color.white);
		option2.setForeground(Color.black);
        option2.setFont(sizedFont1);

        option3 = new JButton("Dinner");
		option3.addActionListener(this);
        option3.setBounds(800,600,100,100);
        option3.setBackground(Color.white);
		option3.setForeground(Color.black);
        option3.setFont(sizedFont1);

        this.add(title);
        this.add(intro);
        this.add(intro1);
        this.add(name);
        //this.add(logogo);
        this.add(button);
        this.add(option1);
        this.add(option2);
		this.add(textField);
        this.add(option3);

    
}

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button) {
			button.setEnabled(false);
			textField.setEditable(false);
            buttonsPressed++;
             
		}
         if(e.getSource()==option1) {
             buttonsPressed++; 
            currentOption = "breakfast";
            this.setVisible(false);	
            try {
                Game game = new Game();
            } catch (FontFormatException | IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

         }
         if(e.getSource()==option2) {
            buttonsPressed++;
            currentOption = "lunch";
            this.setVisible(false);
            try {
                Game game = new Game();
            } catch (FontFormatException | IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

         }
         if(e.getSource() == option3)
         {
            currentOption = "dinner";
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