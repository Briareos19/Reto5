/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Salarios;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

/**
 *
 * @author Belphegor
 */
public class SalariosDao {
            
    Connection conexion;

    public SalariosDao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Salarios> requerimiento3() throws SQLException {
        ArrayList<Salarios> lista = new ArrayList<>();
        String sql = "SELECT Ciudad_Residencia, sum(Salario) From Lider GROUP BY Ciudad_Residencia";
        Statement pstm = conexion.createStatement();
        ResultSet resultados = pstm.executeQuery(sql);
        while(resultados.next()){
            Salarios salario = new Salarios();
            salario.setCiudad_Residencia(resultados.getString(1));
            salario.setSalario(resultados.getInt(2));
            lista.add(salario);
        }
        return lista;
    }
    
//        public ArrayList<Salarios> requerimiento3() throws SQLException {
//        ArrayList<Salarios> lista = new ArrayList<>();
//        String sql = "SELECT Cargo, avg(Salario) From Lider GROUP BY Cargo HAVING avg(Salario)  > 500000";
//        Statement pstm = conexion.createStatement();
//        ResultSet resultados = pstm.executeQuery(sql);
//        while(resultados.next()){
//            Salarios salario = new Salarios();
//            //salario.setCiudad_Residencia(resultados.getString(1));
//            salario.setCargo(resultados.getString(1));
//            salario.setSalario(resultados.getDouble(2));
//            lista.add(salario);
//        }
//        return lista;
//    }
}
