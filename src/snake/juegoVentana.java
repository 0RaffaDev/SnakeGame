
package snake;


import javax.swing.JFrame;

/**
 *
 * @author raffadev
 */
public class juegoVentana extends JFrame {
    juegoContenido jc = new juegoContenido();
    juegoVentana v1 = new juegoVentana();
    
    juegoVentana(){
        this.setTitle("Snake");
        this.add(new juegoContenido());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
     
      
        
        
        
                
         
    }
    
}
