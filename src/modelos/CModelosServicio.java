/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import GestorOperaciones.CQMServicio;
import GestorOperaciones.CQManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author yoong
 */
public class CModelosServicio {
    
    //****************** Atributos***********
    private final CQMServicio mngr = new CQMServicio();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM servicio WHERE 1";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM servicio WHERE servicio.id_servicio = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String nombre) throws SQLException {
        consulta = "INSERT INTO `servicio`(`id_servicio`, `nombre`)"
                + "VALUES (null,'" + nombre +  "');";
        return mngr.inserta_objeto(consulta);
    }

    public boolean elimina_objeto_model(int id) throws SQLException {
        consulta = "DELETE  FROM servicio WHERE servicio.id_servicio = " + id;
        return mngr.elimina_objeto(consulta);
    }

    public boolean actualiza_objeto_model(int id, String nombre) throws SQLException {
        consulta = "UPDATE servicio SET nombre='"+nombre+"' " +
                " WHERE id_servicio= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
    /*public boolean actualiza_objeto_model(int id, String nombre) throws SQLException {
        consulta = "UPDATE estado SET nombre='"+nombre+"' " +
                  " WHERE id_estado= "+id;
        return mngr.actualiza_objeto(consulta);
    }*/
    
}
