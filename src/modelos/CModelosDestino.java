/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import GestorOperaciones.CQMDestino;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author yoong
 */
public class CModelosDestino {
    //****************** Atributos***********
    private final CQMDestino mngr = new CQMDestino();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT destino.id_destino, terminal.nombre FROM destino,terminal WHERE destino.id_destino=terminal.id_terminal";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM destino WHERE destino.id_destino = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    
}
