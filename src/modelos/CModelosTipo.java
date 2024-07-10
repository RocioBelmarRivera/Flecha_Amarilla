package modelos;

import GestorOperaciones.CQMTipo;
import java.sql.SQLException;
import java.util.ArrayList;

public class CModelosTipo {

    //****************** Atributos***********
    private final CQMTipo mngr = new CQMTipo();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM tipo WHERE 1";
        return mngr.buscar_objetos(consulta);

    }

    public boolean actualiza_objeto_model(int id, String nombre, int porcentaje) throws SQLException {
        consulta = "UPDATE tipo SET nombre='" + nombre + "', "
                + " porcentaje_R= " + porcentaje
                + " WHERE tipo.id_tipo= " + id;
        return mngr.actualiza_objeto(consulta);
    }

}
