
package modelos;

import GestorOperaciones.CQMModelo;
import java.util.ArrayList;

/**
 *
 * @author Mayra Marlen
 */
public class CModelosModelo {
    
    //****************** Atributos***********
    private final CQMModelo mngr= new CQMModelo();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws java.sql.SQLException {
        consulta = "SELECT * FROM modelo WHERE 1";
        return mngr.buscar_objetos(consulta);
        
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws java.sql.SQLException {
        consulta = "SELECT * FROM modelo WHERE conductor.id_conductor = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String nombre, String apellidop, String apellidom) throws java.sql.SQLException {
        consulta = "INSERT INTO `modelo`(`id_modelo`, `nombre`, `apellido_p`, `apellido_m`)"
                + "VALUES (null,'" + nombre + "','" + apellidop + "','" + apellidom + "');";
        return mngr.inserta_objeto(consulta);
    }

    public boolean elimina_objeto_model(int id) throws java.sql.SQLException {
        consulta = "DELETE  FROM modelo WHERE conductor.id_conductor = " + id;
        return mngr.elimina_objeto(consulta);
    }

    public boolean actualiza_objeto_model(int id, String nombre,String apellidop,String apellidom) throws java.sql.SQLException {
        consulta = "UPDATE modelo SET nombre='"+nombre+"', " +
                " apellido_p = '"+ apellidop+"', "+
                " apellido_m = '"+apellidom+"' " +
                "WHERE conductor.id_conductor= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
}
