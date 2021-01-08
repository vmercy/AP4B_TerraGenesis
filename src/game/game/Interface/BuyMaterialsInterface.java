package game.Interface;

import game.*;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import game.BuildingMaterial;

public class BuyMaterialsInterface extends HomeInterface {

  JFrame frame;
	JLabel lblCurrentMoney = new JLabel(mainGame.getMoney().getAmount() + "$");
  JLabel lblCurrentMission = new JLabel(mainGame.getMissions().getCurrentMission().getTitle());
JProgressBar missionsProgressBar = new JProgressBar();  private MyThread t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					BuyMaterialsInterface window = new BuyMaterialsInterface();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BuyMaterialsInterface(){
    initialize();
    t = new MyThread();
    mu.stop();
    t.start();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 717);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox<String> comboBox = new JComboBox(mainGame.getMaterials().getMaterialsNames());
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.addActionListener(bHandler);
		comboBox.setBounds(296, 251, 141, 32);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_3_1 = new JButton("Buy");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3_1.setIcon(new ImageIcon(IMAGES_PATH+"money-icon.png"));
		btnNewButton_3_1.addActionListener(bHandler);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        BuildingMaterial target = mainGame.getMaterials().getMaterial(comboBox.getSelectedItem().toString());
        int userChoice = JOptionPane.showConfirmDialog(null, "Unlock material "+ target.getName() +" : "+target.getPrice()+"$ ?");
        if(userChoice==JOptionPane.YES_OPTION && !target.buy(mainGame.getMoney()))
          JOptionPane.showMessageDialog(null,
                "You don't have enough money ! Complete missions first and try again");
			}
		});
		btnNewButton_3_1.setBounds(211, 370, 103, 32);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setIcon(new ImageIcon(IMAGES_PATH+"back-icon.png"));
		btnNewButton_3.addActionListener(bHandler);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
		btnNewButton_3.setBounds(10, 638, 103, 32);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Mars 2035");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_2.setBounds(468, 10, 168, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Select a type of materials :");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(36, 251, 235, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		missionsProgressBar.setBounds(878, 27, 207, 11);
		missionsProgressBar.setValue(30);
		frame.getContentPane().add(missionsProgressBar);
	
		JLabel lblMissionIntro = new JLabel("Mission");
	    lblMissionIntro.setForeground(Color.WHITE);
	    lblMissionIntro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
	    lblMissionIntro.setBounds(955, 12, 69, 11);
	    frame.getContentPane().add(lblMissionIntro);

	    lblCurrentMoney.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
	    lblCurrentMoney.setForeground(Color.WHITE);
	    lblCurrentMoney.setIcon(new ImageIcon(IMAGES_PATH + "coin-icon.png"));
	    lblCurrentMoney.setBounds(38, 10, 123, 28);
	    frame.getContentPane().add(lblCurrentMoney);
	    
		lblCurrentMoney.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblCurrentMoney.setForeground(Color.WHITE);
		lblCurrentMoney.setIcon(new ImageIcon(IMAGES_PATH+"coin-icon.png"));
		lblCurrentMoney.setBounds(38, 10, 123, 28);
		frame.getContentPane().add(lblCurrentMoney);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(IMAGES_PATH+"planet.png"));
		lblNewLabel.setBounds(570, 79, 515, 523);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(IMAGES_PATH+"sky.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1106, 680);
		frame.getContentPane().add(lblNewLabel_1);
  }

  private class MyThread extends Thread{
		
		@Override
		public void run() {
			while(true) {
        //lblCurrentMission.setText(mainGame.getMissions().getCurrentMission().getTitle());
        lblCurrentMoney.setText(mainGame.getMoney().getAmount()+"$");
        lblCurrentMission.setText(mainGame.getMissions().getCurrentMission().getTitle());

        missionsProgressBar.setValue((int) mainGame.getMissions().percentAchieved());
        //missionsProgressBar.setValue((int)mainGame.getMissions().percentAchieved());


				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
  }

}
