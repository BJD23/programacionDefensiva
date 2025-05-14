package barricada_ejercicio;

// clase barricada
public class ValidadorUsuario {

    /**
     * Válida que el correo contenga '@' y '.'.
     * @param correo Texto ingresado por el usuario
     * @return correo si es válido, o null si es inválido
     */
    public String validarCorreo(String correo) {
        if (correo != null && correo.contains("@") && correo.contains(".")) {
            return correo;
        }
        return null;
    }

    /**
     * Válida que la contraseña tenga al menos 9 caracteres.
     * @param contrasena Texto ingresado por el usuario
     * @return contraseña si es válida, o null si es inválida
     */
    public String validarContrasena(String contrasena) {
        if (contrasena != null && contrasena.length() >= 9) {
            return contrasena;
        }
        return null;
    }

    /**
     * Válida que la edad sea un número entre 15 y 50.
     * @param edadTexto Texto ingresado por el usuario
     * @return Integer con la edad si es válida, o null si es inválida
     */
    public Integer validarEdad(String edadTexto) {
        try {
            int edad = Integer.parseInt(edadTexto);
            if (edad >= 15 && edad <= 50) {
                return edad;
            }
        } catch (NumberFormatException ex) {
            // No es un número válido
        }
        return null;
    }
}

