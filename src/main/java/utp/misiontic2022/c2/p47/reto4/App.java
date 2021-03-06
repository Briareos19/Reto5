package utp.misiontic2022.c2.p47.reto4;

import Formularios.Formulario;
import java.sql.SQLException;
import utp.misiontic2022.c2.p47.reto4.vista.VistaRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Formulario ventana=new Formulario();
        ventana.show();
        
        System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();

        System.out.println("\nRequerimiento 2");
        VistaRequerimientos.requerimiento2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.requerimiento3();
        
    }
}
