
package modelos;

import GestorOperaciones.CQMBoleto;
import java.sql.SQLException;
import java.util.ArrayList;


public class CModelosBoleto {
      //****************** Atributos***********
    private final CQMBoleto mngr = new CQMBoleto();
    private String consulta;
    //****************** Metodos*************

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT boleto.id_boleto,"
                + "boleto.id_ruta,"
                + "pasajero.nombre,"
                + "servicio.nombre,"
                + "boleto.dia,"
                + "boleto.mes,"
                + "boleto.año,"
                + "boleto.cantidad"
                + " FROM boleto,pasajero,servicio WHERE boleto.id_boleto=pasajero.id_pasajero=servicio.id_servicio ";
        return mngr.buscar_objetos(consulta);
    }

    public ArrayList<String[]> busca_objeto_id_model(int valor) throws SQLException {
        consulta = "SELECT * FROM boleto WHERE boleto.id = " + valor;
        return mngr.buscar_objetos(consulta);
    }

    public boolean inserta_objeto_model(String ruta,String pasajero,String servicio,int dia,int mes,int anio,int cantidad) throws SQLException {
        consulta = "INSERT INTO `boleto`(`id`, `ruta`, `pasajero`, `servicio`,`dia`, `mes`, `anio`, `cantidad`)"
                + "VALUES (null,'" + ruta + "','" + pasajero + "','" + servicio +"','"+ dia + "','" + mes + "','"+ anio+ "','" + cantidad +"' );";
        return mngr.inserta_objeto(consulta);
    }


    public boolean actualiza_objeto_model(int id,String ruta,String pasajero,String servicio,int dia,int mes,int anio,int cantidad) throws SQLException {
        consulta = "UPDATE boleto SET ruta='"+ruta+"', " +
                " pasajero = '"+ pasajero+"', "+
                " servicio = '"+servicio+"' " +
                 " dia = '"+ dia+"', "+
                " mes = '"+ mes+"' " +
                 " anio = '"+ anio+"', "+
                " cantidad = '"+cantidad+"' " +
                "WHERE boleto.id= "+id;
        return mngr.actualiza_objeto(consulta);
    }
    
}
