
package snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;



/**
 *
 * @author raffadev
 */
public class juegoContenido extends JPanel implements ActionListener {
    
    //pantalla
    static final int PANTALLA = 600;
    static final int CUADRITO_SIZE = 25;
    static final int CUADRITOS_EN_PARALELO = (int) PANTALLA/CUADRITO_SIZE;
    
    //serpiente
    static final int TOTAL_CUERPO_SERPIENTE = (PANTALLA*PANTALLA)/CUADRITO_SIZE;
    int[] serpienteX = new int [TOTAL_CUERPO_SERPIENTE];
    int[] serpienteY = new int [TOTAL_CUERPO_SERPIENTE];
    int cuerpo_serpiente = 3;
    char direccion = 'd'; //awsd
    
    //comida
    int comidaX;
    int comidaY;
    //timer
    boolean running = true;
    static final int DELAY = 100;
    Timer timer;
    //otros
    Random random = new Random();
    
    
    juegoContenido(){
        this.setPreferredSize(new Dimension (PANTALLA, PANTALLA));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new Controles());
        iniciarJuego();
    }

    public void iniciarJuego(){ 
        agregarComida();
        timer = new Timer (DELAY,this);
        timer.start();
             
        
    }
    public void agregarComida(){
        comidaX = random.nextInt(CUADRITOS_EN_PARALELO)*CUADRITO_SIZE;
        comidaY = random.nextInt(CUADRITOS_EN_PARALELO)*CUADRITO_SIZE;
    }
    public void moverSerpiente(){    
    }
    public void chequearComida(){
    
}
    public void chequearColisiones(){
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(running) {
            moverSerpiente();
            chequearColisiones();
            chequearComida();
            
        }
        repaint ();
        
    }
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        for(int i=0;1 < CUADRITOS_EN_PARALELO; i++) {
            g.drawLine(0, CUADRITO_SIZE*i, PANTALLA, CUADRITO_SIZE*i);
            g.drawLine(CUADRITO_SIZE*i, 0, CUADRITO_SIZE*i, PANTALLA);
        }
        
        g.setColor(Color.YELLOW);
        g.fillOval(comidaX, comidaY, CUADRITO_SIZE, CUADRITO_SIZE);
        
                
            g.setColor(Color.PINK);
            for(int i=0;i<cuerpo_serpiente;i++){
                
                }            
    }

    public class Controles extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            
        }
        }
    }
    


