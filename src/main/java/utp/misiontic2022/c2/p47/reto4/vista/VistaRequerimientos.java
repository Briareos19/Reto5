package utp.misiontic2022.c2.p47.reto4.vista;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Reescribir;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Salarios;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        System.out.println("Conocer el nombre, apellidos y salarios de los lideres cuyo segundo apellido sea 'Ortiz'");
        System.out.println("Nombre Primer_apellido Segundo_apellido Salario");
        try {
            ArrayList<Lider> resultado = controlador.consultarRequerimiento1();
            for (Lider lider:resultado){
                System.out.print(lider.getNombre()+" ");
                System.out.print(lider.getPrimer_Apellido()+" ");
                System.out.print(lider.getSegundo_Apellido()+" ");
                System.out.println(lider.getSalario());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public static String[][] requerimiento01()throws SQLException{
        
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        
        ArrayList<Lider> resultado=new ArrayList<Lider>();
        resultado=controlador.consultarRequerimiento1();
        String Matriz[][]=new String [resultado.size()][4];
        for (int i = 0; i < resultado.size(); i++) {
            Matriz[i][0]=resultado.get(i).getNombre();
            Matriz[i][1]=resultado.get(i).getPrimer_Apellido();
            Matriz[i][2]=resultado.get(i).getSegundo_Apellido();
            Matriz[i][3]=String.valueOf(formatter.format(resultado.get(i).getSalario()));
        }
        return Matriz;
    }

    public static void requerimiento2(){
        System.out.println("Transformar y obtener el nombre de los lideres donde la primera letra sea en minúscula y las demás en mayúscula");
        System.out.println("Nombre");
        try {
            // Su código
            ArrayList<Reescribir> resultado=controlador.consultarRequerimiento2();
            for (Reescribir reescribir : resultado) {
                System.out.println(reescribir.getNombre());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
        public static String[][] requerimiento02()throws SQLException{
        ArrayList<Reescribir> resultado=new ArrayList<Reescribir>();
        resultado=controlador.consultarRequerimiento2();
        String Matriz[][]=new String [resultado.size()][1];
        for (int i = 0; i < resultado.size(); i++) {
            Matriz[i][0]=resultado.get(i).getNombre();
         }
        return Matriz;
    }

    public static void requerimiento3(){
        //System.out.println("Saber la suma de los salarios de todos los lideres por su ciudad de residencia.");
        //System.out.println("Ciudad_Residencia sum(Salario)");
        System.out.println("Saber la suma de los salarios de todos los lideres por su ciudad de residencia");
        System.out.println("Cargo Salario");
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        try {
            // Su código
            ArrayList<Salarios> resultado =controlador.consultarRequerimiento3();
            for (Salarios salarios : resultado) {
                //System.out.print(salarios.getCiudad_Residencia()+" ");
                System.out.print(salarios.getCargo()+" ");
                //System.out.println(salarios.getSalario());
                //System.out.println(String.format("%.6f", salarios.getSalario()));
                System.out.println(formatter.format(salarios.getSalario()));
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
        public static String[][] requerimiento03()throws SQLException{
         
        DecimalFormat formatter = new DecimalFormat("#,###.00");    
            
        ArrayList<Salarios> resultado=new ArrayList<Salarios>();
        resultado=controlador.consultarRequerimiento3();
        String Matriz[][]=new String [resultado.size()][2];
        for (int i = 0; i < resultado.size(); i++) {
            Matriz[i][0]=resultado.get(i).getCiudad_Residencia();
            Matriz[i][1]=String.valueOf(formatter.format(resultado.get(i).getSalario()));
        }
        return Matriz;
    }
}
