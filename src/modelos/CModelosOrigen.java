/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import GestorOperaciones.CQManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author yoong
 */
public class CModelosOrigen {
    //****************** Atributos***********
    private final CQManager mngr = new CQManager();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM origen WHERE 1";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM origen WHERE origen.id_origen = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    
    
}
