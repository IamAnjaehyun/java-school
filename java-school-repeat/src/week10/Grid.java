package week10;

import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {
    public Grid(){
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(4,4,5,5));
        String s[][] = {{"1","2","3","+"},{"4","5","6","-"},{"7","8","9","*"},{"(-1)","0","=","/"}};

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                JButton button = new JButton(s[i][j]);
                contentPane.add(button);
            }
        }
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Grid();
    }
}