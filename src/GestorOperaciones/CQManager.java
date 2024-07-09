package GestorOperaciones;

import Conector.CConector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComboBox;
import utilitarios.CUtilitarios;

public class CQManager {

    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private final CConector conector = new CConector();
    private ArrayList<String[]> resultados;

    //***************** METODOS **************
    public ArrayList<String[]> buscar_objetos(String consulta) throws SQLException {
        //1. Abrir la conexion 
        conn = conector.conectar();
        //2. Ejecutar la query(consulta)
        try {
            resultados = new ArrayList<>();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(consulta);
            if (rs == null) {
                CUtilitarios.msg_adver("Elementos no encontrados", "Buscar objeto");
            } else {
                while (rs.next()) {
                    resultados.add(new String[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)});
                }
            }
        } catch (SQLException ex) {
            String cadena = "SQLException: " + ex.getMessage() + "\n"
                    + "SQLState: " + ex.getSQLState() + "\n"
                    + "VendorError: " + ex.getErrorCode();
            CUtilitarios.msg_error(cadena, "conexion");
        } finally {
            //CERRAR RESULTADOS
            try {
                rs.close();
            } catch (SQLException e) {
            }
            //cerrar statement
            try {
                stmt.close();
            } catch (SQLException e) {
            }
            //cerrar conexion
            conector.cerrar_conexion(conn);
        }
        return resultados;
    }

    public boolean inserta_objeto(String consulta) throws SQLException {
        //1. abrir la conexion
        conn = conector.conectar();
        //2.- ejecutar la query
        try {
            PreparedStatement pstmt = conn.prepareStatement(consulta);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            CUtilitarios.msg_error("ERROR: \n" + e.getMessage(), "inserta objeto");
        } finally {
            //3. Cerrar la conexion
            conector.cerrar_conexion(conn);
        }
        return false;
    }

    public boolean elimina_objeto(String consulta) throws SQLException {
        //1.- abrir conexion
        conn = conector.conectar();
        //2.- Ejecutar la Query
        try {
            PreparedStatement pstmt = conn.prepareStatement(consulta);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            CUtilitarios.msg_error("ERROR: " + e.getMessage(), "Elimina objeto");
        } finally {
            //3.- cerrar la conexion
            conector.cerrar_conexion(conn);
        }
        return false;

    }

    public boolean actualiza_objeto(String consulta) throws SQLException {
        conn = conector.conectar();
        try {
            PreparedStatement pstmt = conn.prepareStatement(consulta);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            CUtilitarios.msg_error("Error: " + e.getMessage(), "actualiza objeto");
        } finally {
            conector.cerrar_conexion(conn);
        }
        return false;
    }

    public void imprime_resultados(ArrayList<String[]> resultados) {
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(i + " " + Arrays.toString(resultados.get(i)));
        }
        System.out.println("...................");
    }

//    
//     public void rellenar_combo(String tabla, String valor,JComboBox combo){
//        String sql= "Select * from "+ tabla;
//        conn=conector.conectar();  
//        try {
//            stmt=conn.createStatement();
//         rs=stmt.executeQuery(sql);
//            
//            while (rs.next()) {
//                combo.addItem(rs.getString(valor));
//            }
//        } catch (SQLException e) {
//            CUtilitarios.msg_error("ERROR AL RELLENAR EL COMBO", "RELLENAR_COMBO");
//        }
//    }
//    
    
//    
//    public void rellenar_combo(JComboBox combo){
//        String texto;
//        String sql= "Select * from tipo";
//        conn=conector.conectar();
//        try {
//            stmt=conn.createStatement();
//            rs=stmt.executeQuery(sql);
//            
//            while (rs.next()) {
//                datos[0]=rs.getString(1);
//                datos[1]=rs.getString(2);
//                texto=datos[0]+" - "+datos[1];
//                combo.addItem(texto);
//                //combo.addItem(rs.getString(valor));
//            }
//        } catch (SQLException e) {
//            CUtilitarios.msg_error("ERROR AL RELLENAR EL COMBO", "RELLENAR_COMBO");
//        }
//    }
//    public String[] datos(){
//            return datos;
//        }
//
//     public void setDatos(String[] datos) {
//        this.datos = datos;
//    }
     
//    public void rellenar_combo(JComboBox combo) {
//        String sql = "SELECT * FROM tipo";
//        conn = conector.conectar();
//        try {
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery(sql);
//
//            combo.removeAllItems(); // Limpiar items existentes en el ComboBox
//
//            while (rs.next()) {
//                String dato1 = rs.getString(1); // Obtener el primer campo (por ejemplo, "1")
//                String dato2 = rs.getString(2); // Obtener el segundo campo (por ejemplo, "Estudiante")
//                String textoCompleto = dato1 + " - " + dato2; // Concatenar ambos valores
//                combo.addItem(textoCompleto); // Agregar al ComboBox el texto completo
//            }
//        } catch (SQLException e) {
//            CUtilitarios.msg_error("ERROR AL RELLENAR EL COMBO", "RELLENAR_COMBO");
//        } finally {
//            // Cerrar recursos (ResultSet, Statement, Connection) en el bloque finally si es necesario
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//                if (stmt != null) {
//                    stmt.close();
//                }
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }

}
