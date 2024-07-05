
package modelos;
import GestorOperaciones.CQMMarca;
import java.sql.SQLException;
import java.util.ArrayList;

public class CModelosMarca {
   
    //****************** Atributos***********
    private final CQMMarca mngr = new CQMMarca();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM marca WHERE 1";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM marca WHERE marca.id_marca = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(int id, String nombre) throws SQLException {
        
        consulta = "INSERT INTO `marca`(`id_marca`, `nombre`)"
                + "VALUES ( "+id+",'" + nombre + "');";
        return mngr.inserta_objeto(consulta);
    }

    public boolean elimina_objeto_model(int id) throws SQLException {
        consulta = "DELETE  FROM marca WHERE marca.id_marca = " + id;
        return mngr.elimina_objeto(consulta);
    }

    public boolean actualiza_objeto_model(int id, String nombre) throws SQLException {
        consulta = "UPDATE marca SET nombre='"+nombre+" '"+
                "WHERE marca.id_marca= "+id;
        return mngr.actualiza_objeto(consulta);
    }
 
}
