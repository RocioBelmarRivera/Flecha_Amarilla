/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import GestorOperaciones.CQMTerminal;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;

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
        consulta = "SELECT terminal.id_terminal,"
                + "terminal.nombre,"
                + "colonia.nombre FROM terminal,colonia WHERE terminal.id_terminal=colonia.id_colonia";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM terminal WHERE terminal.id_terminal = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String nombre,int direccion) throws SQLException {
        consulta = "INSERT INTO `terminal`(`id_terminal`, `nombre`,`id_direccion` )"
                + "VALUES (null,'" + nombre + "',"+direccion+");";
        return mngr.inserta_objeto(consulta);
    }


    public boolean actualiza_objeto_model(int id, String nombre, int terminal) throws SQLException {
        consulta = "UPDATE terminal SET nombre='"+nombre+"' " +
                "terminal.id_direccion"+
                " WHERE terminal.id_terminal= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
     public ArrayList<String[]> carga_terminal_direccion() throws SQLException {
         consulta="select colonia.id_colonia, colonia.nombre from colonia ";
         return mngr.buscar_objetos2(consulta);
         
    }
     
    
}
