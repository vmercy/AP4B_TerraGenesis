package game.Interface;

import game.*;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import game.BuildingMaterial;

public class ShowMaterialsInterface extends HomeInterface {

  JFrame frame;
  JLabel lblCurrentMoney = new JLabel("100000$");
  private MyThread t;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          UIManager.setLookAndFeel(new NimbusLookAndFeel());
          ShowMaterialsInterface window = new ShowMaterialsInterface();
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
  public ShowMaterialsInterface() {
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

    JButton btnNewButton_3 = new JButton("Back");
    btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
    btnNewButton_3.setIcon(new ImageIcon(IMAGES_PATH + "back-icon.png"));
    btnNewButton_3.addActionListener(bHandler);
    btnNewButton_3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        frame.dispose();

      }
    });
    btnNewButton_3.setBounds(10, 638, 103, 32);
    frame.getContentPane().add(btnNewButton_3);

    JLabel lblGameTitle = new JLabel("Mars 2035");
    lblGameTitle.setForeground(Color.WHITE);
    lblGameTitle.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 26));
    lblGameTitle.setBounds(468, 10, 168, 39);
    frame.getContentPane().add(lblGameTitle);

    JLabel lblIntroMaterials = new JLabel("List of your materials :");
    lblIntroMaterials.setForeground(Color.WHITE);
    lblIntroMaterials.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
    lblIntroMaterials.setBounds(36, 100, 235, 32);
    frame.getContentPane().add(lblIntroMaterials);

    for (BuildingMaterial bMaterial : mainGame.getMaterials().getMaterials()) {
      JLabel lblMaterialName = new JLabel(bMaterial.getName());
      lblMaterialName.setForeground(Color.WHITE);
      lblMaterialName.setFont(new Font("Arial Black", Font.BOLD, 15));
      lblMaterialName.setBounds(100, 150 + 30 * mainGame.getMaterials().getMaterials().indexOf(bMaterial), 235, 32);
      frame.getContentPane().add(lblMaterialName);

      JCheckBox chbxMaterialOwned = new JCheckBox();
      chbxMaterialOwned.setBounds(200, 150 + 30 * mainGame.getMaterials().getMaterials().indexOf(bMaterial), 235, 32);
      chbxMaterialOwned.setSelected(bMaterial.isOwned());
      chbxMaterialOwned.setEnabled(false);
      frame.getContentPane().add(chbxMaterialOwned);

    }

    JProgressBar progressBar = new JProgressBar();
    progressBar.setBounds(878, 27, 207, 11);
    progressBar.setValue(30);
    frame.getContentPane().add(progressBar);

    JLabel lblMissionIntro = new JLabel("Mission");
    lblMissionIntro.setForeground(Color.WHITE);
    lblMissionIntro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
    lblMissionIntro.setBounds(955, 12, 59, 11);
    frame.getContentPane().add(lblMissionIntro);

    JLabel lblCurrentMission = new JLabel("{Mission Name}");
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

    JLabel lblNewLabel = new JLabel();
    lblNewLabel.setIcon(new ImageIcon(IMAGES_PATH + "planet.png"));
    lblNewLabel.setBounds(570, 79, 515, 523);
    frame.getContentPane().add(lblNewLabel);

    JLabel lblNewLabel_1 = new JLabel();
    lblNewLabel_1.setIcon(new ImageIcon(IMAGES_PATH + "sky.jpg"));
    lblNewLabel_1.setBounds(0, 0, 1106, 680);
    frame.getContentPane().add(lblNewLabel_1);
  }

  private class MyThread extends Thread {

    @Override
    public void run() {
      while (true) {
        // lblCurrentMission.setText(mainGame.getMissions().getCurrentMission().getTitle());
        lblCurrentMoney.setText(mainGame.getMoney().getAmount() + "$");

        // missionsProgressBar.setValue((int)mainGame.getMissions().percentAchieved());

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e1) {
          e1.printStackTrace();
        }
      }
    }
  }

}
