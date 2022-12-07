package week13;

import javax.swing.*;
import java.awt.*;

public class swing extends JFrame {
    private MyPanel panel = new MyPanel();

    public swing() {
        setTitle("fill20172407");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);

        setSize(500, 400);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.ORANGE);
            g.fillOval(350,0,150,150); // 원 태양

            g.setColor(Color.RED);
            g.fillOval(365,15,120,120); // 원 태양

            g.setColor(new Color(51,204,255));
            g.fillOval(10,20,70,50); // 구름
            g.fillOval(50,20,70,50); // 구름
            g.fillOval(90,20,70,50); // 구름

            g.fillOval(200,15,70,50); // 구름
            g.fillOval(240,15,70,50); // 구름
            g.fillOval(280,15,70,50); // 구름


            g.fillOval(250,70,70,50); // 구름
            g.fillOval(290,70,70,50); // 구름
            g.fillOval(330,70,70,50); // 구름
            //----------------------------------------------------
            g.setColor(new Color(102,0,0));
            g.fillRoundRect(85,130,50,200,20,20); // 나무 기둥

            g.setColor(Color.GREEN);
            g.fillOval(40,80,100,100); // 나뭇잎
            g.fillOval(60,70,100,100); // 나뭇잎
            g.fillOval(80,80,100,100); // 나뭇잎

            g.setColor(new Color(204,51,51));
            g.fillOval(90,90,30,30); // 사과
            g.setColor(Color.RED);
            g.fillOval(50,100,30,30); // 사과
            g.fillOval(90,135,30,30); // 사과

            //-------------------------------------------------------
            g.setColor(new Color(102,0,0));
            g.fillRoundRect(165,130,50,200,20,20); // 나무 기둥

            g.setColor(new Color(0,204,0));
            g.fillOval(120,80,100,100); // 나뭇잎
            g.fillOval(140,70,100,100); // 나뭇잎
            g.fillOval(150,80,100,100); // 나뭇잎

            g.setColor(new Color(153,0,0));
            g.fillOval(160,90,30,30); // 사과
            g.fillOval(130,110,30,30); // 사과
            g.fillOval(160,140,30,30); // 사과

            //-------------------------------------------------------
            g.setColor(new Color(102,0,0));
            g.fillRoundRect(235,130,50,200,20,20); // 나무 기둥

            g.setColor(new Color(51,153,51));
            g.fillOval(190,80,100,100); // 나뭇잎
            g.fillOval(210,70,100,100); // 나뭇잎
            g.fillOval(230,80,100,100); // 나뭇잎

            g.setColor(new Color(204,51,51));
            g.fillOval(230,90,30,30); // 사과
            g.fillOval(200,110,30,30); // 사과
            g.fillOval(240,140,30,30); // 사과
            g.fillOval(280,110,30,30); // 사과

            g.setColor(new Color(102,255,0));
            g.fillRoundRect(0,300,500,100,20,0); // 바닥
        }
    }

    public static void main(String [] args) {
        new swing();
    }
}