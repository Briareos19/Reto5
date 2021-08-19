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
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Reescribir;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

/**
 *
 * @author Belphegor
 */
public class ReescribirDao {
        Connection conexion;

    public ReescribirDao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Reescribir> requerimiento2() throws SQLException {
        ArrayList<Reescribir> lista = new ArrayList<>();
        String sql = "SELECT LOWER(SUBSTR(Nombre,1,1)) || UPPER(SUBSTR(Nombre,2,LENGTH(Nombre))) FROM Lider";
        Statement pstm = conexion.createStatement();
        ResultSet resultados = pstm.executeQuery(sql);
        while(resultados.next()){
            Reescribir reescribir = new Reescribir();
            reescribir.setNombre(resultados.getString(1));
            lista.add(reescribir);
        }
        return lista;
    }
}
