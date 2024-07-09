
package modelos;

import GestorOperaciones.CQManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;


public class CModelosPasajero {
    //****************** Atributos***********
    private final CQManager mngr = new CQManager();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM pasajero WHERE 1";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM pasajero WHERE pasajero.id_pasajero = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String nombre,String AP,String AM, String correo, int tipo) throws SQLException {
        consulta = "INSERT INTO `pasajero`(`id_pasajero`, `nombre`, `apellido_p`, `apellido_m`,`correo`,`id_tipo` )"
                + "VALUES (null,'" + nombre + "','" + AP + "','" + AM +"','"+correo+"',"+tipo+ ");";
        return mngr.inserta_objeto(consulta);
    }


    public boolean actualiza_objeto_model(int id, String nombre,String AP,String AM, String correo, int tipo) throws SQLException {
        consulta = "UPDATE pasajero SET nombre='"+nombre+"', " +
                " apellido_p = '"+ AP+"', "+
                " apellido_m = '"+ AM+"', "+
                " correo = '"+ correo+"', "+
                " id_tipo = "+tipo+" " +
                "WHERE pasajero.id_pasajero= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
    
    
    
}
