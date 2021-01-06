package game.Interface;

import game.*;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class HomeInterface {
  
  public final String IMAGES_PATH = "Images/";
  public final String SOUNDS_PATH = "Sounds/";
  
  Game mainGame = new Game();

	JFrame frame;
	ButtonHandler bHandler = new ButtonHandler();
	JButton btnNewButton_5 = new JButton("Add Humans");
	String clickSound, tavernMusic;
	SoundEffect se = new SoundEffect();
	Music mu = new Music();
	private MyThread t;
	private boolean allConditionsReached =false;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					HomeInterface window = new HomeInterface();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public HomeInterface() {
			initialize();
			mu.setFile(tavernMusic);
      mu.play();
      mu.loop();
			t = new MyThread();
			t.start();
	}
	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 717);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Build the city");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(bHandler);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CityInterface city = new CityInterface();
				city.frame.setVisible(true);
			}	
		});
		btnNewButton.setBounds(65, 291, 175, 62);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Animals");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(bHandler);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnimalsInterface animals = new AnimalsInterface();
				animals.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(65, 402, 175, 62);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add Vegetals");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(bHandler);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VegetalsInterface vegetals = new VegetalsInterface();
				vegetals.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(315, 402, 175, 62);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.addActionListener(bHandler);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!allConditionsReached) {
					
					JOptionPane.showMessageDialog(null, "Not yet !");
				}
				else {

					HumansInterface humans = new HumansInterface();
					humans.frame.setVisible(true);
				}
			
			}
		});
		btnNewButton_5.setBounds(315, 291, 175, 62);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_3_1_1 = new JButton("View Conditions");
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3_1_1.addActionListener(bHandler);
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConditionsInterface conditions = new ConditionsInterface();
				conditions.frame.setVisible(true);
			}
		});
		btnNewButton_3_1_1.setBounds(136, 631, 116, 39);
		frame.getContentPane().add(btnNewButton_3_1_1);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setIcon(new ImageIcon(IMAGES_PATH+"Close-2-icon.png"));
		btnNewButton_4.addActionListener(bHandler);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.exit(0);
			}
		});
		btnNewButton_4.setBounds(992, 640, 93, 30);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("Mars 2035");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_2.setBounds(468, 10, 168, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(878, 27, 207, 11);
		progressBar.setValue(30);
		frame.getContentPane().add(progressBar);
	
		JLabel lblNewLabel_3 = new JLabel("Mission");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(955, 12, 59, 11);
		frame.getContentPane().add(lblNewLabel_3);
		
    //JLabel lblNewLabel_3_1 = new JLabel("{Mission Name}");
    JLabel lblNewLabel_3_1 = new JLabel(mainGame.m_missions.getCurrentMission().getTitle());
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3_1.setBounds(878, 41, 207, 20);
    frame.getContentPane().add(lblNewLabel_3_1);
    
    JButton btnNewButton_3 = new JButton("Buy Materials");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.addActionListener(bHandler);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MaterialsInterface materials = new MaterialsInterface();
        materials.frame.setVisible(true);
        mainGame.m_missions.nextMission();
        lblNewLabel_3_1.setText(mainGame.m_missions.getCurrentMission().getTitle());
			}
		});
		btnNewButton_3.setBounds(10, 631, 116, 39);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("100000$");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setIcon(new ImageIcon(IMAGES_PATH+"coin-us-dollar-icon-1.png"));
		lblNewLabel_4.setBounds(38, 10, 123, 28);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(IMAGES_PATH+"Webp.net-resizeimage.png"));
		lblNewLabel_5.setBounds(208, 79, 146, 156);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(IMAGES_PATH+"terree.png"));
		lblNewLabel.setBounds(570, 79, 515, 523);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(IMAGES_PATH+"lunee.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1106, 680);
		frame.getContentPane().add(lblNewLabel_1);
				
		clickSound = SOUNDS_PATH+"button.wav";
		tavernMusic = SOUNDS_PATH+"backMusic.wav";
	}
	
	private class MyThread extends Thread{
		
		@Override
		public void run() {
			while(true) {
				if(!allConditionsReached) {
					btnNewButton_5.setBackground(Color.DARK_GRAY);	
				}
				else {
					btnNewButton_5.setBackground(null);	
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	public class SoundEffect{
		
		Clip clip;
		
		public void setFile(String soundFileName) {
			
			try {
				File file = new File(soundFileName);
				AudioInputStream sound = AudioSystem.getAudioInputStream(file);
				clip = AudioSystem.getClip();
				clip.open(sound);
			}
			catch(Exception e){
				
			}
		}
		
		public void play() {
			
			clip.setFramePosition(0);
			clip.start();
		}
	}
	
	public class ButtonHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			se.setFile(clickSound);
			se.play();
		}
	}

public class Music{
		
		Clip clip;
		
		public void setFile(String soundFileName) {
			
			try {
				File file = new File(soundFileName);
				AudioInputStream sound = AudioSystem.getAudioInputStream(file);
				clip = AudioSystem.getClip();
				clip.open(sound);
			}
			catch(Exception e){
				
			}
		}
		
		public void play() {
			
			clip.setFramePosition(0);
			clip.start();
		}
		
		public void loop(){
			
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		}
		
		public void stop(){
			
			clip.stop();
			clip.close();
		}
	} 
}
