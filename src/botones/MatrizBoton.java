/**
 * clase MatrizBoton que crea la matriz del programa
 * @author Juan Ricardo Rodriguez Campos- Juan David Reyes
 * @version 1.0.0
 * @since Botones 1.0.0
 */
package botones;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;


public class MatrizBoton extends JFrame implements ActionListener {
        
        
        JButton botonCrear;
	JTextField Columnas;
	JTextField Filas;
	JPanel panel;
        
        /**
        *constructor de la clase que crea la ventana con sus componentes 
        */
	public MatrizBoton() {
		JToolBar barraHerramientas = new JToolBar();
		JLabel lblFilas = new JLabel();
		JLabel lblColumnas = new JLabel();
		Columnas = new JTextField();
		Filas = new JTextField();
		botonCrear = new JButton();
		panel = new JPanel( null );

		//accion que cierra la aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblFilas.setText("Filas");
		barraHerramientas.add(lblFilas);

		Filas.setPreferredSize(new Dimension(50, 25));
		barraHerramientas.add(Filas);

		lblColumnas.setText("Columnas");
		barraHerramientas.add(lblColumnas);

		Columnas.setPreferredSize(new Dimension(50, 25));
		barraHerramientas.add(Columnas);

		botonCrear.setText("Crear");
		botonCrear.addActionListener(this);
		barraHerramientas.add(botonCrear);

		
		this.add(barraHerramientas, BorderLayout.PAGE_START);
                this.add(panel, BorderLayout.CENTER);
		this.setSize(410, 330);
		this.setLocationRelativeTo(null);

	}
        
        /**
        * funcion que toma los datos de filas y columnas y a partir de ellos crea la
        * matriz para crear los botones y ubicarlos 
        */
        @Override
	public void actionPerformed( ActionEvent evt ) {
		
		String f = Filas.getText();
                String c = Columnas.getText();
       
                int filas = Integer.parseInt(f);
                int columnas = Integer.parseInt(c);
		
                panel.removeAll();                
                Boton [][] botones = new Boton[ filas ][ columnas ];             
                for(int fila = 0 ; fila < filas; fila++ ){
                    for(int columna = 0 ; columna < columnas; columna++ ){
                    botones[fila][columna] = new Boton( 75 * columna, 30 * fila, 75, 30 );
                    botones[fila][columna].Nombre(fila, columna);
                    panel.add( botones[fila][columna] );
                    }
                }
                // actualiza el panel con los botones
		panel.updateUI();
        }
}