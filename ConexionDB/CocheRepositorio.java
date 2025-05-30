import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CocheRepositorio {
    // Aquí saco todos los coches de la base de datos
    public ArrayList<Coche> obtenerTodos() {
        ArrayList<Coche> lista = new ArrayList<>();
        try (Connection conn = ConexionBD.obtenerConexion()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM coches");
            while (rs.next()) {
                String marca = rs.getString("marca");
                int anio = rs.getInt("anio");
                String color = rs.getString("color");
                Coche coche = new Coche(marca, anio, color);
                lista.add(coche);
            }
        } catch (Exception e) {
            System.out.println(" error al consultar los coches" );
        }
        return lista;
    }

    // Aquí añado un coche nuevo a la base de datos
    public void insertar(Coche coche) {
        String sql = "INSERT INTO coches (marca, anio, color) VALUES (?, ?, ?)";
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, coche.getMarca());
            pstmt.setInt(2, coche.getAnio());
            pstmt.setString(3, coche.getColor());
            pstmt.executeUpdate();
            System.out.println("Nuevo coche en tu garage.");
        } catch (Exception e) {
            System.out.println(" No se pudo agregar el coche: " + e.getMessage());
        }
    }

    // Aquí actualizo los datos de un coche
    public void actualizar(Coche cocheActual, Coche cocheNuevo) {
        String sql = "UPDATE coches SET marca = ?, anio = ?, color = ? WHERE marca = ? AND anio = ? AND color = ?";
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cocheNuevo.getMarca());
            pstmt.setInt(2, cocheNuevo.getAnio());
            pstmt.setString(3, cocheNuevo.getColor());
            pstmt.setString(4, cocheActual.getMarca());
            pstmt.setInt(5, cocheActual.getAnio());
            pstmt.setString(6, cocheActual.getColor());
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Coche modificado con exito");
            } else {
                System.out.println("El coche no se ha encontrado, revisa los datos.");
            }
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el coche");
        }
    }

    // Aquí elimino un coche de la base de datos
    public void eliminar(Coche coche) {
        String sql = "DELETE FROM coches WHERE marca = ? AND anio = ? AND color = ?";
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, coche.getMarca());
            pstmt.setInt(2, coche.getAnio());
            pstmt.setString(3, coche.getColor());
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Coche eliminado.");
            } else {
                System.out.println("No hay ningún coche con esos datos para eliminar.");
            }
        } catch (Exception e) {
            System.out.println(" No se pudo eliminar el coche");
        }
    }
}