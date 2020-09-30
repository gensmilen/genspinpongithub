/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Usuario
 */
public class Pong extends JComponent implements ActionListener,MouseMotionListener{
int dirx;
int diry;
int pelotavelx;
int pelotavely;
int Tablita;
int Puntos;
int Bloques;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame ven = new JFrame("JUEGO PINPONG");
       Pong po = new Pong();
       ven.add(po);
       ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ven.setVisible(true);
       ven.setSize(800,620);
       ven.addMouseMotionListener(po);
       Timer t = new Timer(20,po);
       t.start();
       
    }

   
    
@Override
    public void paint(Graphics g){
    g.setColor(Color.GREEN);
    g.fillRect(0, 0, 800, 620);
    g.setColor(Color.BLACK);
    g.fillRect(Tablita, 550, 100, 20);
    g.setColor(Color.BLUE);
    g.fillRect(20, 10, 50, 20);
    g.setColor(Color.BLUE);
    g.fillRect(80, 10, 50, 20);
    g.setColor(Color.BLUE);
    g.fillRect(140, 10, 50, 20);
    g.setColor(Color.BLUE);
    g.fillRect(200, 10, 50, 20);
    g.setColor(Color.BLUE);
    g.fillRect(260, 10, 50, 20);
    g.setColor(Color.BLUE);
    g.fillRect(320, 10, 50, 20);
    g.setColor(Color.BLUE);
    g.fillRect(380, 10, 50, 20);
    g.setColor(Color.BLUE);
    g.fillRect(440, 10, 50, 20);
    g.setColor(Color.BLUE);
    g.fillRect(500, 10, 50, 20);
    g.setColor(Color.BLUE);
    g.fillRect(560, 10, 50, 20);
    g.setColor(Color.BLUE);
    g.fillRect(620, 10, 50, 20);
    g.setColor(Color.BLUE);
    g.fillRect(680, 10, 50, 20);
    g.setColor(Color.BLUE);
    
    // tamaño de la pelota y su color
    g.setColor(Color.red);
    g.fillOval(dirx, diry, 20, 20);
    if(Puntos >=0){
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", 40,40));
        g.drawString(String.valueOf(Puntos-1),750,60);
        
    }
    
}
    @Override
    public void actionPerformed(ActionEvent e) {
       dirx +=pelotavelx;
       diry +=pelotavely;
       if(dirx >=Tablita-10&& dirx <=Tablita+70&& diry>=525){
           pelotavely = -7;
       }
       
       if(diry >=560){
           diry = 7;
           Puntos = 1;
       }
       if(diry <=4){
           pelotavely = 7;
           Puntos ++;
       }
       if(dirx >=760){
           pelotavelx = -7;
       }
       if(dirx<=0){
           pelotavelx = 7;
       }
       repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Tablita = e.getX() - 50;
        repaint();
    }
    
    public void Bloques(){
        dirx +=pelotavelx;
       diry +=pelotavely;
       if(dirx >=Bloques-10&& dirx <=Bloques+70&& diry>=525){
           pelotavely = -7;
       }
       
       if(diry >=560){
           diry = 7;
           Puntos = 1;
       }
       if(diry <=4){
           pelotavely = 7;
           Puntos ++;
       }
       if(dirx >=760){
           pelotavelx = -7;
       }
       if(dirx<=0){
           pelotavelx = 7;
       }
       repaint();
    }
}
    


    

    
   
        
    


   
