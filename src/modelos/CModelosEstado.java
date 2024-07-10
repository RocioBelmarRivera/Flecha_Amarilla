/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import GestorOperaciones.CQMEstado;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author yoong
 */
public class CModelosEstado {
    
    //****************** Atributos***********
    private final CQMEstado mngr = new CQMEstado();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM estado WHERE 1";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM estado WHERE estado.id_estado = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String nombre) throws SQLException {
        consulta = "INSERT INTO `estado`(`id_estado`, `nombre`)"
                + "VALUES (null,'" + nombre + "');";
        return mngr.inserta_objeto(consulta);
    }


    public boolean actualiza_objeto_model(int id, String nombre) throws SQLException {
        consulta = "UPDATE estado SET nombre='"+nombre+"', " +
                  " WHERE estado.id_estado= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
}
