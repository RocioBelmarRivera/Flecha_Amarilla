/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import GestorOperaciones.CQMRuta;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author yoong
 */
public class CModelosRuta {
    
    //****************** Atributos***********
    private final CQMRuta mngr = new CQMRuta();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM ruta WHERE 1";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM ruta WHERE ruta.id_ruta = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String km,String costo,String dia, String mes, String año) throws SQLException {
        consulta = "INSERT INTO `ruta`(`id_ruta`, `km`, `costo`, `dia`,`mes`, `año`, `id_origen`, `id_destino`)"
                + "VALUES (null,'" + km + "','" + costo + "','" + dia +"', '" + mes + "', '" + año + "');";
        return mngr.inserta_objeto(consulta);
    }


    public boolean actualiza_objeto_model(int id, String km,String costo,String dia, String mes, String año) throws SQLException {
        consulta = "UPDATE ruta SET km='"+km+"', costo = '" +
                 costo+"', dia = '"+ dia  +"', mes = '"+mes+"', año = '"+ año+
                "' WHERE id_ruta= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
    /* public boolean actualiza_objeto_model(int id, String matricula,String cap,String fecha) throws SQLException {
        consulta = "UPDATE autobus SET matricula='"+matricula+"', capacidad = '" +
                 cap+"', año_servicio = '"+ fecha +
                "' WHERE id_autobus= "+id;
        return mngr.actualiza_objeto(consulta);
    */
}
