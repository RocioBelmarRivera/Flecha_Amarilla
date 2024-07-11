package modelos;

import GestorOperaciones.CQMPasajero;
import java.sql.SQLException;
import java.util.ArrayList;
//import javax.swing.JComboBox;

public class CModelosPasajero {

    //****************** Atributos***********
    private final CQMPasajero mngr = new CQMPasajero();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT pasajero.id_pasajero,pasajero.nombre,pasajero.apellido_p,pasajero.apellido_m,pasajero.correo, tipo.nombre FROM pasajero,tipo"+
                " WHERE tipo.id_tipo = pasajero.id_tipo ORDER BY tipo.id_tipo;";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM pasajero WHERE pasajero.id_pasajero = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String nombre, String AP, String AM, String correo, int tipo) throws SQLException {
        consulta = "INSERT INTO `pasajero`(`id_pasajero`, `nombre`, `apellido_p`, `apellido_m`,`correo`,`id_tipo` )"
                + "VALUES (null,'" + nombre + "','" + AP + "','" + AM + "','" + correo + "'," + tipo + ");";
        return mngr.inserta_objeto(consulta);
    }

    public boolean actualiza_objeto_model(int id, String nombre, String AP, String AM, String correo, int tipo) throws SQLException {
        consulta = "UPDATE pasajero SET nombre='" + nombre + "', "
                + " apellido_p = '" + AP + "', "
                + " apellido_m = '" + AM + "', "
                + " correo = '" + correo + "', "
                + " id_tipo = " + tipo + " "
                + "WHERE pasajero.id_pasajero= " + id;
        return mngr.actualiza_objeto(consulta);
    }
    
    public boolean elimina_objeto_model(int id) throws SQLException {
        consulta = "DELETE  FROM pasajero WHERE pasajero.id_pasajero = " + id;
        return mngr.elimina_objeto(consulta);
    }


    public ArrayList<String[]> carga_tipo_pasajero() throws SQLException {
         consulta="select tipo.id_tipo, tipo.nombre from tipo ";
         return mngr.buscar_objetos2(consulta);
         
    }

}
