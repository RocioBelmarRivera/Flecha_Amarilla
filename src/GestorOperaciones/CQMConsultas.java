
package GestorOperaciones;

import Conector.CConector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utilitarios.CUtilitarios;


public class CQMConsultas {
    
     private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private final CConector conector = new CConector();
    private ArrayList<String[]> resultados;
    
    public ArrayList<String[]> buscar_objetos1(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(5)});
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

    
   ////////  Consulta 3
    
    
        public ArrayList<String[]> buscar_objetos2(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
    
        
        
        ////////  Consulta 4
    
    
        public ArrayList<String[]> buscar_objetos3(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
    
    
         ////////  Consulta 5
    
    
        public ArrayList<String[]> buscar_objetos4(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(6),
                        rs.getString(7)});
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
        
        
        //Consulta 6
  public ArrayList<String[]> buscar_objetos5(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(2)});
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
        
  
  //Consuota 7
  public ArrayList<String[]> buscar_objetos6(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)});
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
    
  
  //Consulta 8
  public ArrayList<String[]> buscar_objetos7(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(2)});
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
    
  
  //Consulta 9
  public ArrayList<String[]> buscar_objetos8(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),});
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
    
  
  //Consulta 10
  public ArrayList<String[]> buscar_objetos9(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)
                    });
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
    
  //Consulta 11
  public ArrayList<String[]> buscar_objetos10(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(3)});
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
    
  //Consulta 12
  public ArrayList<String[]> buscar_objetos11(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)});
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
    
  //Consulta 13
  public ArrayList<String[]> buscar_objetos12(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),});
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
    
  //Consulta 14
  public ArrayList<String[]> buscar_objetos13(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(3)});
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
    
  //Consulta 15
  public ArrayList<String[]> buscar_objetos14(String consulta) throws SQLException {
        //1. Abrir la conexion s
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
                        rs.getString(1)});
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
    
  
  
  
}
