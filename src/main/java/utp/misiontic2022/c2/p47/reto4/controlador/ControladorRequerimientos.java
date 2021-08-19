package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.LiderDao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.ReescribirDao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.SalariosDao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Reescribir;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Salarios;

public class ControladorRequerimientos {
    
    LiderDao dao = new LiderDao();
    ReescribirDao dao2 = new ReescribirDao();
    SalariosDao dao3 = new SalariosDao();
    
    public ArrayList<Lider> consultarRequerimiento1() throws SQLException {
        return dao.requerimiento1();
    }

    public ArrayList<Reescribir> consultarRequerimiento2() throws SQLException {
        // Su código
        return dao2.requerimiento2();
    }

    public ArrayList<Salarios> consultarRequerimiento3() throws SQLException {
        // Su código
        return dao3.requerimiento3();
    }
}
