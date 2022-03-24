package Games;

import Games.Engine.Game;
import Games.Engine.Sprite;
import Games.Engine.Window;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Snake extends Game {

    private Sprite test_;

    public Snake(Window window){
        super(window, "Snake");
        this.setBackground(Color.green);

        BufferedImage test_texture = load_image("/img.png");

        Sprite test = new Sprite(this, 5, test_texture);
        test_ = test;
        test.x = 10;
        test.y = 20;
        test.width = 200;
        Sprite test2 = new Sprite(this, 4, test_texture);


        JButton b = new JButton();
        b.setText("SNAKE GAME EXIT");
        b.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });

        this.add(b);
        window.pack();
    }


    @Override
    public void update_loop(){
        test_.x++;
    }

}
