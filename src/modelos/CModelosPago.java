
package modelos;

import GestorOperaciones.CQMPago;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mayra Marlen
 */
public class CModelosPago {
    
    //****************** Atributos***********
    private final CQMPago mngr= new CQMPago();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM pago WHERE 1";
        return mngr.buscar_objetos(consulta);
        
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM pago WHERE conductor.id_conductor = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model() throws SQLException {
        consulta = "INSERT INTO `pago`(`id_pago`)"
                + "VALUES (null);";
        return mngr.inserta_objeto(consulta);
    }

    public boolean elimina_objeto_model(int id) throws SQLException {
        consulta = "DELETE  FROM pago WHERE pago.id_pago = " + id;
        return mngr.elimina_objeto(consulta);
    }

    public boolean actualiza_objeto_model(int id, String nombre,String apellidop,String apellidom) throws SQLException {
        consulta = "UPDATE conductor SET nombre='"+nombre+"', " +
                " apellido_p = '"+ apellidop+"', "+
                " apellido_m = '"+apellidom+"' " +
                "WHERE conductor.id_conductor= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
}
