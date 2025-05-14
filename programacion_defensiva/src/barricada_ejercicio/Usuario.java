package barricada_ejercicio;

// Clase usuario zona segura
public class Usuario {
    String correo;
    String contrasena;
    int edad;

    public Usuario(String correo, String contrasena, int edad) {
        // Asumimos que los datos ya están validados
        this.correo = correo;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("\tInformación del Usuario");
        System.out.println("Correo: " + correo);
        System.out.println("Contraseña: " + contrasena);
        System.out.println("Edad: " + edad);
    }
}
