/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import GestorOperaciones.CQMTerminal;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author yoong
 */
public class CModelosTerminal {
    //****************** Atributos***********
    private final CQMTerminal mngr = new CQMTerminal();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM terminal WHERE 1";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM terminal WHERE terminal.id_terminal = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String nombre) throws SQLException {
        consulta = "INSERT INTO `terminal`(`id`, `nombre`)"
                + "VALUES (null,'" + nombre + "');";
        return mngr.inserta_objeto(consulta);
    }


    public boolean actualiza_objeto_model(int id, String nombre) throws SQLException {
        consulta = "UPDATE terminal SET nombre='"+nombre+"', " +
                "WHERE terminal.id_terminal= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
}
