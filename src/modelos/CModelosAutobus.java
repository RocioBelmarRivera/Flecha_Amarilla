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
        consulta = "SELECT autobus.id_autobus,"
                + "autobus.matricula,"
                + "autobus.capacidad,"
                + "autobus.año_servicio,"
                + "autobus.id_ruta,"
                + "modelo.nombre,"
                + "autobus.mes_servicio FROM autobus,modelo WHERE autobus.id_autobus=modelo.id_modelo";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM autobus WHERE autobus.id_autobus = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String matricula,String cap,int fecha,int ruta, int modelo, int mes) throws SQLException {
        consulta = "INSERT INTO `autobus`(`id_autobus`, `matricula`, `capacidad`, `año_servicio`,`id_ruta`,`id_modelo`,`mes_servicio` )"
                + "VALUES (null,'" + matricula + "','" + cap + "'," + fecha +","+ruta+","+modelo+","+mes+");";
        return mngr.inserta_objeto(consulta);
    }


    public boolean actualiza_objeto_model(int id, String matricula,String cap,String fecha) throws SQLException {
        consulta = "UPDATE autobus SET matricula='"+matricula+"', capacidad = '" +
                 cap+"', año_servicio = '"+ fecha +
                "' WHERE id_autobus= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
    public ArrayList<String[]> carga_tipo_modelo() throws SQLException {
         consulta="select modelo.id_modelo, modelo.nombre from modelo ";
         return mngr.buscar_objetos3(consulta);
         
    }
    
    public ArrayList<String[]> carga_tipo_ruta() throws SQLException {
         consulta="select ruta.id_ruta, ruta.km from ruta ";
         return mngr.buscar_objetos2(consulta);
         
    }
    
}
