/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import GestorOperaciones.CQMAutobus;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author yoong
 */
public class CModelosAutobus {
    
    //****************** Atributos***********
    private final CQMAutobus mngr = new CQMAutobus();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM autobus WHERE 1";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM autobus WHERE autobus.id_autobus = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String matricula,String cap,String fecha) throws SQLException {
        consulta = "INSERT INTO `autobus`(`id`, `matricula`, `capacidad`, `fecha_servicio` )"
                + "VALUES (null,'" + matricula + "','" + cap + "','" + fecha +"');";
        return mngr.inserta_objeto(consulta);
    }


    public boolean actualiza_objeto_model(int id, String matricula,String cap,String fecha) throws SQLException {
        consulta = "UPDATE autobus SET matricula='"+matricula+"', capacidad = '" +
                 cap+"', año_servicio = '"+ fecha +
                "' WHERE id_autobus= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    /* public boolean actualiza_objeto_model(int id, String nombre) throws SQLException {
        consulta = "UPDATE estado SET nombre='"+nombre+"' " +
                  " WHERE id_estado= "+id;
        return mngr.actualiza_objeto(consulta);
    }*/
}
