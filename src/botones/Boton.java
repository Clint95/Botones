/**
 * clase boton que se encarga de la ubicacion y accion de los botones
 * @author Juan Ricardo Rodriguez Campos- Juan David Reyes
 * @version 1.0.0
 * @since Botones 1.0.0
 */

package botones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Boton extends JButton implements ActionListener {
    
    /**
    * Constructor para posicionar los botones de la mariz 
    * @param x 
    * @param y    
    * @param ancho    
    * @param alto    
    */
    public Boton( int x, int y, int ancho, int alto ){ 
        setBounds(x, y, ancho, alto);
        addActionListener( this );
    }
    
    /**
    * funcion que le asigna el nombre al boton , en este caso sera fila,columna
    * @param f 
    * @param c
    */
    public void Nombre( int f, int c ){
        setText( f + " , " + c );
    }
    
    /**
    * funcion actionPerformed para modificar el boton al accionar el boton
    * @param e parametro el evento de clickeo
    */
    @Override
    public void actionPerformed( ActionEvent e ){
        //Se asigna el color de fondo azul
        setBackground(Color.RED);
        //Se asigna un color de letra color blanco
        setForeground(Color.WHITE);
    }
    //Fin de la clase Boton
}