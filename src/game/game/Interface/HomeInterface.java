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
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class HomeInterface {

  public final String IMAGES_PATH = "Images/";
  public final String SOUNDS_PATH = "Sounds/";

  protected static Game mainGame = new Game();

  JFrame frame;
  JLabel lblCurrentMission = new JLabel(mainGame.getMissions().getCurrentMission().getTitle());
  JLabel lblCurrentMoney = new JLabel(mainGame.getMoney().getAmount() + "$");
  ButtonHandler bHandler = new ButtonHandler();
  JButton btnAddHumans = new JButton("Add Humans");
  JButton btnAddAnimals = new JButton("Add Animals");
  JButton btnAddVegetals = new JButton("Add Vegetals");
  JProgressBar missionsProgressBar = new JProgressBar();
  String clickSound, tavernMusic;
  SoundEffect se = new SoundEffect();
  Music mu = new Music();
  private MyThread t;

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

    JButton btnBuildCity = new JButton("Build the city");
    btnBuildCity.setFont(new Font("Tahoma", Font.PLAIN, 12));
    btnBuildCity.addActionListener(bHandler);
    btnBuildCity.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        CityInterface city = new CityInterface();
        city.frame.setVisible(true);
      }
    });
    btnBuildCity.setBounds(65, 291, 175, 62);
    frame.getContentPane().add(btnBuildCity);

    btnAddAnimals.setFont(new Font("Tahoma", Font.PLAIN, 12));
    btnAddAnimals.addActionListener(bHandler);
    btnAddAnimals.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        AnimalsInterface animals = new AnimalsInterface();
        animals.frame.setVisible(true);
      }
    });
    btnAddAnimals.setBounds(65, 402, 175, 62);
    frame.getContentPane().add(btnAddAnimals);

    btnAddVegetals.setFont(new Font("Tahoma", Font.PLAIN, 12));
    btnAddVegetals.addActionListener(bHandler);
    btnAddVegetals.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        VegetalsInterface vegetals = new VegetalsInterface();
        vegetals.frame.setVisible(true);
      }
    });
    btnAddVegetals.setBounds(315, 402, 175, 62);
    frame.getContentPane().add(btnAddVegetals);

    btnAddHumans.setFont(new Font("Tahoma", Font.PLAIN, 12));
    btnAddHumans.addActionListener(bHandler);
    btnAddHumans.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          HumansInterface humans = new HumansInterface();
          humans.frame.setVisible(true);
      }
    });
    btnAddHumans.setBounds(315, 291, 175, 62);
    frame.getContentPane().add(btnAddHumans);

    JButton btnViewConditions = new JButton("View Conditions");
    btnViewConditions.setFont(new Font("Tahoma", Font.PLAIN, 12));
    btnViewConditions.addActionListener(bHandler);
    btnViewConditions.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ConditionsInterface conditions = new ConditionsInterface();
        conditions.frame.setVisible(true);
      }
    });
    btnViewConditions.setBounds(252, 631, 130, 39);
    frame.getContentPane().add(btnViewConditions);

    JButton btnExit = new JButton("Exit");
    btnExit.setFont(new Font("Tahoma", Font.PLAIN, 12));
    btnExit.setIcon(new ImageIcon(IMAGES_PATH + "close-icon.png"));
    btnExit.addActionListener(bHandler);
    btnExit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    btnExit.setBounds(992, 640, 93, 30);
    frame.getContentPane().add(btnExit);

    JLabel lblGameTitle = new JLabel("Mars 2035");
    lblGameTitle.setForeground(Color.WHITE);
    lblGameTitle.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 26));
    lblGameTitle.setBounds(468, 10, 168, 39);
    frame.getContentPane().add(lblGameTitle);

    missionsProgressBar.setBounds(878, 27, 207, 11);
    missionsProgressBar.setValue(30);
    frame.getContentPane().add(missionsProgressBar);

    JLabel lblMissionIntro = new JLabel("Mission");
    lblMissionIntro.setForeground(Color.WHITE);
    lblMissionIntro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
    lblMissionIntro.setBounds(955, 12, 69, 11);
    frame.getContentPane().add(lblMissionIntro);

    lblCurrentMission.setHorizontalAlignment(SwingConstants.CENTER);
    lblCurrentMission.setForeground(Color.WHITE);
    lblCurrentMission.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
    lblCurrentMission.setBounds(878, 41, 207, 20);
    frame.getContentPane().add(lblCurrentMission);

    JButton btnBuyMaterials = new JButton("Buy Materials");
    btnBuyMaterials.setFont(new Font("Tahoma", Font.PLAIN, 12));
    btnBuyMaterials.addActionListener(bHandler);
    btnBuyMaterials.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        BuyMaterialsInterface buyMaterialsFrale = new BuyMaterialsInterface();
        buyMaterialsFrale.frame.setVisible(true);
      }
    });
    btnBuyMaterials.setBounds(10, 631, 116, 39);
    frame.getContentPane().add(btnBuyMaterials);

    JButton btnShowMaterials = new JButton("Show Materials");
    btnShowMaterials.setFont(new Font("Tahoma", Font.PLAIN, 12));
    btnShowMaterials.addActionListener(bHandler);
    btnShowMaterials.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ShowMaterialsInterface showMaterialsFrame = new ShowMaterialsInterface();
        showMaterialsFrame.frame.setVisible(true);
      }
    });
    btnShowMaterials.setBounds(126, 631, 126, 39);
    frame.getContentPane().add(btnShowMaterials);

    lblCurrentMoney.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
    lblCurrentMoney.setForeground(Color.WHITE);
    lblCurrentMoney.setIcon(new ImageIcon(IMAGES_PATH + "coin-icon.png"));
    lblCurrentMoney.setBounds(38, 10, 123, 28);
    frame.getContentPane().add(lblCurrentMoney);

    JLabel lblRocketImage = new JLabel("");
    lblRocketImage.setIcon(new ImageIcon(IMAGES_PATH + "rocket.png"));
    lblRocketImage.setBounds(208, 79, 146, 156);
    frame.getContentPane().add(lblRocketImage);

    JLabel lblPlanetImage = new JLabel();
    lblPlanetImage.setIcon(new ImageIcon(IMAGES_PATH + "planet.png"));
    lblPlanetImage.setBounds(570, 79, 515, 523);
    frame.getContentPane().add(lblPlanetImage);

    JLabel lblSkyImage = new JLabel();
    lblSkyImage.setIcon(new ImageIcon(IMAGES_PATH + "sky.jpg"));
    lblSkyImage.setBounds(0, 0, 1106, 680);
    frame.getContentPane().add(lblSkyImage);

    clickSound = SOUNDS_PATH + "button.wav";
    tavernMusic = SOUNDS_PATH + "backMusic.wav";
  }

  private class MyThread extends Thread {

    @Override
    public void run() {
      while (true) {
        lblCurrentMission.setText(mainGame.getMissions().getCurrentMission().getTitle());
        lblCurrentMoney.setText(mainGame.getMoney().getAmount() + "$");

        missionsProgressBar.setValue((int) mainGame.getMissions().percentAchieved());

        btnAddHumans.setEnabled(mainGame.getPlanet().getPlanetAtmosphere().isAllCompleted());
        btnAddAnimals.setEnabled(!mainGame.getCity().getLaboratories().isEmpty());
        btnAddVegetals.setEnabled(!mainGame.getCity().getBotanicGardens().isEmpty());

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e1) {
          e1.printStackTrace();
        }
      }
    }
  }

  public class SoundEffect {

    Clip clip;

    public void setFile(String soundFileName) {

      try {
        File file = new File(soundFileName);
        AudioInputStream sound = AudioSystem.getAudioInputStream(file);
        clip = AudioSystem.getClip();
        clip.open(sound);
      } catch (Exception e) {

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

  public class Music {

    Clip clip;

    public void setFile(String soundFileName) {

      try {
        File file = new File(soundFileName);
        AudioInputStream sound = AudioSystem.getAudioInputStream(file);
        clip = AudioSystem.getClip();
        clip.open(sound);
      } catch (Exception e) {

      }
    }

    public void play() {

      clip.setFramePosition(0);
      clip.start();
    }

    public void loop() {

      clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {

      clip.stop();
      clip.close();
    }
  }
}
