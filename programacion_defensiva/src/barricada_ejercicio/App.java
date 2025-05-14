package barricada_ejercicio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidadorUsuario validador = new ValidadorUsuario();

        System.out.print("Ingrese su correo: ");
        String correoInput = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasenaInput = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        String edadInput = scanner.nextLine();

        String correoValido = validador.validarCorreo(correoInput);
        String contrasenaValida = validador.validarContrasena(contrasenaInput);
        Integer edadValida = validador.validarEdad(edadInput);

        boolean todoValido = true;

        if (correoValido == null) {
            System.out.println("Error: Correo inválido. Debe contener '@' y '.'.");
            todoValido = false;
        }
        if (contrasenaValida == null) {
            System.out.println("Error: Contraseña inválida. Debe tener al menos 9 caracteres.");
            todoValido = false;
        }
        if (edadValida == null) {
            System.out.println("Error: Edad inválida. Debe ser un número entre 15 y 50.");
            todoValido = false;
        }

        if (todoValido) {
            Usuario usuario = new Usuario(correoValido, contrasenaValida, edadValida);
            usuario.mostrarInfo();
        } else {
            System.out.println("Registro cancelado. Corrija los errores e intente de nuevo.");
        }

        scanner.close();
    }
}
