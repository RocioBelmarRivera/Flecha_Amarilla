/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import GestorOperaciones.CQManager;
import java.sql.SQLException;
import java.util.ArrayList;


public class CModelosPasajero {
    //****************** Atributos***********
    private final CQManager mngr = new CQManager();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM auto WHERE 1";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM pasajero WHERE auto.id = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String nombre,String AP,String AM, String correo, String tipo) throws SQLException {
        consulta = "INSERT INTO `pasajero`(`id`, `nombre`, `apellido_p`, `apellido_m`,`correo`,`tipo` )"
                + "VALUES (null,'" + nombre + "','" + AP + "','" + AM +"','"+correo+"','"+tipo+ "');";
        return mngr.inserta_objeto(consulta);
    }


    public boolean actualiza_objeto_model(int id, String nombre,String AP,String AM, String correo, String tipo) throws SQLException {
        consulta = "UPDATE pasajero SET nombre='"+nombre+"', " +
                " apellido_p = '"+ AP+"', "+
                " apellido_m = '"+ AM+"', "+
                " correo = '"+ correo+"', "+
                " tipo = '"+tipo+"' " +
                "WHERE auto.id= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
}
