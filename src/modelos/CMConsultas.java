package modelos;

import GestorOperaciones.CQMConsultas;
import java.sql.SQLException;
import java.util.ArrayList;

public class CMConsultas {

    private final CQMConsultas mngr = new CQMConsultas();
    private String consulta;
//CONSULTA 2

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT "
                + " marca.nombre,"
                + " modelo.nombre,"
                + " autobus.id_autobus,"
                + " autobus.matricula,"
                + " autobus.capacidad,"
                + " autobus.`año_servicio`,"
                + " autobus.mes_servicio "
                + " FROM"
                + " marca"
                + " INNER JOIN modelo ON marca.id_marca = modelo.id_marca"
                + " INNER JOIN autobus ON modelo.id_modelo = autobus.id_modelo"
                + " WHERE"
                + " autobus.`año_servicio` >= 2019;";
        return mngr.buscar_objetos1(consulta);
    }

//CONSULTA 3
    public ArrayList<String[]> busca_objetos_mode2() throws SQLException {
        consulta = "SELECT marca.nombre,"
                + " modelo.nombre,"
                + " autobus.id_autobus,"
                + " autobus.matricula,"
                + " autobus.capacidad,"
                + " autobus.`año_servicio`,"
                + " autobus.mes_servicio"
                + " FROM"
                + " marca"
                + " INNER JOIN modelo ON marca.id_marca = modelo.id_marca"
                + " INNER JOIN autobus ON modelo.id_modelo = autobus.id_modelo"
                + " WHERE"
                + " marca.nombre = 'Mercedes-Benz';";
        return mngr.buscar_objetos2(consulta);
    }

//CONSULTA 4
    public ArrayList<String[]> busca_objetos_model3() throws SQLException {
        consulta = "SELECT"
                + " tipo.nombre,"
                + " pasajero.id_pasajero,"
                + " pasajero.nombre,"
                + " pasajero.apellido_p,"
                + " pasajero.apellido_m,"
                + " pasajero.correo"
                + " FROM"
                + " tipo"
                + " INNER JOIN pasajero ON tipo.id_tipo = pasajero.id_tipo"
                + " WHERE"
                + " tipo.nombre = 'Niño';";
        return mngr.buscar_objetos3(consulta);
    }

//CONSULTA 5
    public ArrayList<String[]> busca_objetos_model4() throws SQLException {
        consulta = "SELECT"
                + " tipo.nombre,"
                + " pasajero.id_pasajero,"
                + " pasajero.nombre,"
                + " pasajero.apellido_p,"
                + " pasajero.apellido_m,"
                + " pasajero.correo"
                + " FROM"
                + " tipo"
                + " INNER JOIN pasajero ON tipo.id_tipo = pasajero.id_tipo"
                + " WHERE"
                + " tipo.nombre = 'Inapam';";
        return mngr.buscar_objetos3(consulta);
    }

//CONSULTA 6
    public ArrayList<String[]> busca_objetos_model5() throws SQLException {
        consulta = "SELECT DISTINCT "
                + "    t.Nombre AS NombreTerminal, "
                + "    CONCAT( colonia.nombre, ', ',colonia.codigo_postal,',', ciudad.nombre, ', ', estado.nombre) AS Direccion_Completa "
                + " FROM"
                + "    terminal t"
                + " JOIN"
                + "    terminal_ruta p ON t.id_terminal = p.id_terminal "
                + " JOIN "
                + "    direccion ON t.id_direccion = direccion.id_direccion"
                + " JOIN "
                + "    colonia ON direccion.id_colonia = colonia.id_colonia"
                + " JOIN"
                + "    ciudad ON colonia.id_ciudad = ciudad.id_ciudad"
                + " JOIN"
                + "    estado ON ciudad.id_estado = estado.id_estado"
                + " WHERE"
                + "    p.id_ruta = 2;";
        return mngr.buscar_objetos5(consulta);
    }
//CONSULTA 7

    public ArrayList<String[]> busca_objetos_model6() throws SQLException {
        consulta = "SELECT"
                + " ruta.km,"
                + " ruta.costo,"
                + " ruta.dia,"
                + " ruta.mes,"
                + " ruta.`año`,"
                + " ruta.id_origen,"
                + " ruta.id_destino,"
                + " terminal.nombre"
                + " FROM"
                + " ruta"
                + " INNER JOIN destino ON ruta.id_destino = destino.id_destino"
                + " INNER JOIN origen ON ruta.id_origen = origen.id_origen"
                + " INNER JOIN terminal ON destino.id_terminal = terminal.id_terminal AND origen.id_terminal = terminal.id_terminal"
                + " WHERE"
                + " ruta.id_ruta = 2;";
        return mngr.buscar_objetos6(consulta);
    }

//CONSULTA 8
    public ArrayList<String[]> busca_objetos_model7() throws SQLException {
        consulta = "SELECT "
                + "    Pasajero.nombre AS nombre_pasajero,"
                + "    Conductor.nombre AS nombre_conductor"
                + " FROM "
                + "    boleto"
                + " JOIN "
                + "    Pasajero ON boleto.id_pasajero = Pasajero.id_pasajero"
                + " JOIN "
                + "    ruta ON boleto.id_ruta = ruta.id_ruta"
                + " JOIN "
                + "    autobus_conductor ON ruta.id_ruta = autobus_conductor.id_ruta"
                + " JOIN "
                + "    Conductor ON autobus_conductor.id_conductor = Conductor.id_conductor"
                + " WHERE "
                + "    ruta.dia = 16 AND ruta.mes = 6 AND ruta.año = 2024;";
        return mngr.buscar_objetos7(consulta);
    }

//CONSULTA 9
    public ArrayList<String[]> busca_objetos_model8() throws SQLException {
        consulta = "SELECT DISTINCT"
                + "    ruta.id_ruta,"
                + "    ruta.km,"
                + "    ruta.costo,"
                + "    ruta.dia,"
                + "    ruta.mes,"
                + "    ruta.año,"
                + "    origen_terminal.nombre AS origen,"
                + "    destino_terminal.nombre AS destino"
                + " FROM "
                + "    boleto"
                + " JOIN "
                + "    pasajero_boleto_pago ON boleto.id_boleto = pasajero_boleto_pago.id_boleto"
                + " JOIN "
                + "    efectivo ON pasajero_boleto_pago.id_pago = efectivo.id_pago"
                + " JOIN "
                + "    ruta ON boleto.id_ruta = ruta.id_ruta"
                + " JOIN "
                + "    origen ON ruta.id_origen = origen.id_origen"
                + " JOIN "
                + "    terminal AS origen_terminal ON origen.id_terminal = origen_terminal.id_terminal"
                + " JOIN "
                + "    destino ON ruta.id_destino = destino.id_destino"
                + " JOIN "
                + "    terminal AS destino_terminal ON destino.id_terminal = destino_terminal.id_terminal;";
        return mngr.buscar_objetos7(consulta);
    }

//CONSULTA 10
    public ArrayList<String[]> busca_objetos_model9() throws SQLException {
        consulta = "SELECT "
                + "    autobus.id_autobus,"
                + "    autobus.matricula,"
                + "    autobus.capacidad,"
                + "    ruta.id_ruta,"
                + "    ruta.km,"
                + "    ruta.costo,"
                + "    ruta.dia,"
                + "    ruta.mes,"
                + "    ruta.año,"
                + "    origen_terminal.nombre AS origen,"
                + "    destino_terminal.nombre AS destino"
                + " FROM "
                + "    autobus"
                + " JOIN "
                + "    modelo ON autobus.id_modelo = modelo.id_modelo"
                + " JOIN "
                + "    ruta ON autobus.id_ruta = ruta.id_ruta"
                + " JOIN "
                + "    origen ON ruta.id_origen = origen.id_origen"
                + " JOIN "
                + "    terminal AS origen_terminal ON origen.id_terminal = origen_terminal.id_terminal"
                + " JOIN "
                + "    destino ON ruta.id_destino = destino.id_destino"
                + " JOIN "
                + "    terminal AS destino_terminal ON destino.id_terminal = destino_terminal.id_terminal"
                + " WHERE "
                + "    modelo.nombre = 'Monarca';";
        return mngr.buscar_objetos9(consulta);
    }
//CONSULTA 11

    public ArrayList<String[]> busca_objetos_model0() throws SQLException {
        consulta = "SELECT "
                + "    DISTINCT conductor.nombre,"
                + "    conductor.apellido_p,"
                + "    conductor.apellido_m"
                + " FROM "
                + "    autobus"
                + " JOIN "
                + "    modelo ON autobus.id_modelo = modelo.id_modelo"
                + " JOIN "
                + "    autobus_conductor ON autobus.id_autobus = autobus_conductor.id_autobus"
                + " JOIN "
                + "    conductor ON autobus_conductor.id_conductor = conductor.id_conductor"
                + " WHERE "
                + "    modelo.nombre = 'F230' "
                + "    AND autobus.año_servicio < CURDATE();";
        return mngr.buscar_objetos10(consulta);
    }
//CONSULTA 12

    public ArrayList<String[]> busca_objetos_model11() throws SQLException {
        consulta = "SELECT"
                + " p.nombre AS pasajero_nombre,"
                + " p.apellido_p AS pasajero_apellido_p,"
                + " p.apellido_m AS pasajero_apellido_m,"
                + " c.nombre AS chofer_nombre,"
                + " c.apellido_p AS chofer_apellido_p,"
                + " c.apellido_m AS chofer_apellido_m,"
                + " t_destino.nombre,"
                + " t_origen.nombre"
                + " FROM "
                + "    boleto b"
                + " JOIN "
                + "    pasajero p ON b.id_pasajero = p.id_pasajero"
                + " JOIN "
                + "    ruta r ON b.id_ruta = r.id_ruta"
                + " JOIN "
                + "    terminal t_origen ON r.id_origen = t_origen.id_terminal"
                + " JOIN "
                + "    terminal t_destino ON r.id_destino = t_destino.id_terminal"
                + " LEFT JOIN "
                + "    terminal_ruta tr ON r.id_ruta = tr.id_ruta"
                + " LEFT JOIN "
                + "    terminal t ON tr.id_parada = t.id_terminal"
                + " JOIN "
                + "    autobus_conductor ac ON r.id_ruta = ac.id_ruta"
                + " JOIN "
                + "    conductor c ON ac.id_conductor = c.id_conductor"
                + " WHERE "
                + "    t_origen.nombre = 'Central del norte'"
                + "    AND t_destino.nombre = 'Terminal Mérida Centro Histórico';";
        return mngr.buscar_objetos11(consulta);
    }
//CONSULTA 13

    public ArrayList<String[]> busca_objetos_model12() throws SQLException {
        consulta = "SELECT DISTINCT"
                + " direccion.id_direccion,"
                + " direccion.id_colonia,"
                + " ciudad.nombre AS nombre_ciudad,"
                + " estado.nombre AS nombre_estado,"
                + " colonia.nombre AS nombre_colonia,"
                + " colonia.codigo_postal,"
                + " origen.id_origen,"
                + " destino.id_destino"
                + " FROM"
                + " ruta"
                + " INNER JOIN origen ON ruta.id_origen = origen.id_origen"
                + " INNER JOIN destino ON ruta.id_destino = destino.id_destino"
                + " INNER JOIN terminal ON origen.id_terminal = terminal.id_terminal AND destino.id_terminal = terminal.id_terminal"
                + " INNER JOIN direccion ON terminal.id_direccion = direccion.id_direccion"
                + " INNER JOIN colonia ON direccion.id_colonia = colonia.id_colonia"
                + " INNER JOIN ciudad ON colonia.id_ciudad = ciudad.id_ciudad"
                + " INNER JOIN estado ON ciudad.id_estado = estado.id_estado"
                + " INNER JOIN autobus_conductor ON autobus_conductor.id_ruta = ruta.id_ruta AND autobus_conductor.id_conductor > 3"
                + " INNER JOIN conductor ON autobus_conductor.id_conductor = conductor.id_conductor"
                + " INNER JOIN autobus ON autobus_conductor.id_autobus = autobus.id_autobus";
        return mngr.buscar_objetos12(consulta);
    }
//CONSULTA 14

    public ArrayList<String[]> busca_objetos_model13() throws SQLException {
        consulta = "SELECT"
                + " autobus.capacidad,"
                + " boleto.cantidad,"
                + " (autobus.capacidad - boleto.cantidad) AS disponible"
                + " FROM"
                + " autobus"
                + " INNER JOIN ruta ON autobus.id_ruta = ruta.id_ruta"
                + " INNER JOIN boleto ON boleto.id_ruta = ruta.id_ruta AND ruta.id_ruta = 2;";
        return mngr.buscar_objetos13(consulta);
    }
//CONSULTA 15

    public ArrayList<String[]> busca_objetos_model14() throws SQLException {
        consulta = "SELECT"
                + " rembolso.monto"
                + " FROM"
                + "    boleto"
                + " INNER JOIN rembolso ON rembolso.id_rembolso = boleto.id_rembolso"
                + " WHERE"
                + " boleto.dia = 17 AND"
                + " boleto.mes = 5 AND"
                + " boleto.año = 2024;";
        return mngr.buscar_objetos14(consulta);
    }
}
