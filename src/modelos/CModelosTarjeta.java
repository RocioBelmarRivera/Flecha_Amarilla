
package modelos;

import GestorOperaciones.CQMTarjeta;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mayra Marlen
 */
public class CModelosTarjeta {
    
    //****************** Atributos***********
    private final CQMTarjeta mngr= new CQMTarjeta();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM tarjeta WHERE 1";
        return mngr.buscar_objetos(consulta);
        
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM tarjeta WHERE tarjeta.id_conductor = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String nombre, String fechaEX, String tarjeta) throws SQLException {
        consulta = "INSERT INTO `tarjeta`(`id_tarjeta`, `nombre`, `fecha_expiracion`, `tarjeta`,`id_pago` )"
                + "VALUES (null,'" + nombre + "','" + fechaEX + "','" + tarjeta + "');";
        return mngr.inserta_objeto(consulta);
    }

    public boolean elimina_objeto_model(int id) throws SQLException {
        consulta = "DELETE  FROM tarjeta WHERE tarjeta.id_tarjeta = " + id;
        return mngr.elimina_objeto(consulta);
    }

    public boolean actualiza_objeto_model(int id, String nombre,String fechaEx,String tarjeta) throws SQLException {
        consulta = "UPDATE tarjeta SET nombre='"+nombre+"', " +
                " fecha_expiracion = '"+ fechaEx+"', "+
                " tarjeta = '"+tarjeta+"' " +
                "WHERE tarjeta.id_tarjeta= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
}
