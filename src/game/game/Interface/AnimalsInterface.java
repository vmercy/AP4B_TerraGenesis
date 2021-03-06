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

import game.Species.Animal;

public class AnimalsInterface extends HomeInterface{

	JFrame frame;
	JLabel lblCurrentMission = new JLabel(mainGame.getMissions().getCurrentMission().getTitle());
	JLabel lblCurrentMoney = new JLabel(mainGame.getMoney().getAmount() + "$");
	JProgressBar missionsProgressBar = new JProgressBar();
	private ConditionUpdater t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					AnimalsInterface window = new AnimalsInterface();
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
	public AnimalsInterface() {
		initialize();
		mu.stop();
		t = new ConditionUpdater();
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
		
		Object[] fishSpeciesStrings = new Object[] {"Tuna", "Shark", "Shrimp", "Mackerel", "Small Fish"};
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox<String> cbxFishSpecies = new JComboBox(fishSpeciesStrings);
		cbxFishSpecies.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbxFishSpecies.addActionListener(bHandler);
		cbxFishSpecies.setBounds(296, 293, 141, 32);
		cbxFishSpecies.setVisible(false);
		frame.getContentPane().add(cbxFishSpecies);
		
		Object[] animalTypesStrings = new Object[] {"Aquatic Mammal","Insect","Fish", "Single Cell Organism"};
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox<String> cbxAnimalTypes = new JComboBox(animalTypesStrings);
		cbxAnimalTypes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbxAnimalTypes.addActionListener(bHandler);
		cbxAnimalTypes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        cbxFishSpecies.setVisible(cbxAnimalTypes.getSelectedItem().equals("Fish"));				
			}
		});
		cbxAnimalTypes.setBounds(296, 251, 141, 32);
		frame.getContentPane().add(cbxAnimalTypes);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(bHandler);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAdd.setIcon(new ImageIcon(IMAGES_PATH+"add-icon.png"));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        String selectionString = cbxAnimalTypes.getSelectedItem().toString();
        if(cbxFishSpecies.isVisible())
          selectionString = cbxFishSpecies.getSelectedItem().toString();
        Animal newAnimal = mainGame.getAnimals().createAnimalfromType(selectionString);
        if(JOptionPane.showConfirmDialog(null, "Add a(n) " + newAnimal.getName() + " for " + newAnimal.getPrice() + "$ ?")==JOptionPane.YES_OPTION)
        {
          switch(newAnimal.canBuy(mainGame.getAnimals(), mainGame.getMoney()))
          {
            case -1: // out of money
            {
              JOptionPane.showMessageDialog(null, "You don't have enough money ! Complete missions first and try again");
              break;
            }
            case 0: // missing prey
            {
              JOptionPane.showMessageDialog(null, "Your animal just died because it couldnt find enough preys to eat :-(");
              mainGame.getMoney().sub(newAnimal.getPrice());
              break;
            }
            case 1: {
                mainGame.getAnimals().addAnimal(newAnimal);
                newAnimal.updateConditions(mainGame.getPlanet().getPlanetAtmosphere());
                mainGame.getMoney().sub(newAnimal.getPrice());
                mainGame.getMissions().setCompleted("Add animal");
              break;
            }
          }
        }
			}
		});
		btnAdd.setBounds(214, 378, 103, 32);
		frame.getContentPane().add(btnAdd);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBack.setIcon(new ImageIcon(IMAGES_PATH+"back-icon.png"));
		btnBack.addActionListener(bHandler);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
		btnBack.setBounds(10, 638, 103, 32);
		frame.getContentPane().add(btnBack);
		
		JLabel lblGameTitle = new JLabel("Mars 2035");
		lblGameTitle.setForeground(Color.WHITE);
		lblGameTitle.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 26));
		lblGameTitle.setBounds(468, 10, 168, 39);
		frame.getContentPane().add(lblGameTitle);
		
		JLabel lblTypeIntro = new JLabel("Select a type of animals :");
		lblTypeIntro.setForeground(Color.WHITE);
		lblTypeIntro.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblTypeIntro.setBounds(38, 251, 233, 32);
		frame.getContentPane().add(lblTypeIntro);
		
		missionsProgressBar.setBounds(878, 27, 207, 11);
		missionsProgressBar.setValue(30);
		frame.getContentPane().add(missionsProgressBar);
	
		JLabel lblMissionIntro = new JLabel("Mission");
	    lblMissionIntro.setForeground(Color.WHITE);
	    lblMissionIntro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
	    lblMissionIntro.setBounds(955, 12, 69, 11);
	    frame.getContentPane().add(lblMissionIntro);

	    lblCurrentMission.setToolTipText(mainGame.getMissions().getCurrentMission().getDescription());
	    lblCurrentMission.setHorizontalAlignment(SwingConstants.CENTER);
	    lblCurrentMission.setForeground(Color.WHITE);
	    lblCurrentMission.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
	    lblCurrentMission.setBounds(878, 41, 207, 20);
	    frame.getContentPane().add(lblCurrentMission);
		
		lblCurrentMoney.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
	    lblCurrentMoney.setForeground(Color.WHITE);
	    lblCurrentMoney.setIcon(new ImageIcon(IMAGES_PATH + "coin-icon.png"));
	    lblCurrentMoney.setBounds(38, 10, 123, 28);
	    frame.getContentPane().add(lblCurrentMoney);
		
		JLabel lblPlanetPicture = new JLabel();
		lblPlanetPicture.setIcon(new ImageIcon(IMAGES_PATH+"planet.png"));
		lblPlanetPicture.setBounds(570, 79, 515, 523);
		frame.getContentPane().add(lblPlanetPicture);
		
		JLabel lblSkyPicture = new JLabel();
		lblSkyPicture.setIcon(new ImageIcon(IMAGES_PATH+"sky.jpg"));
		lblSkyPicture.setBounds(0, 0, 1106, 680);
		frame.getContentPane().add(lblSkyPicture);
	}
	
	private class ConditionUpdater extends Thread {

	    @Override
	    public void run() {
	      while (true) {
	        lblCurrentMission.setText(mainGame.getMissions().getCurrentMission().getTitle());
          lblCurrentMoney.setText(mainGame.getMoney().getAmount() + "$");
          lblCurrentMission.setToolTipText(mainGame.getMissions().getCurrentMission().getDescription());

	        missionsProgressBar.setValue((int) mainGame.getMissions().percentAchieved());
	        
	        try {
	          Thread.sleep(1000);
	        } catch (InterruptedException e1) {
	          e1.printStackTrace();
	        }
	      }
	    }
	  }
}
