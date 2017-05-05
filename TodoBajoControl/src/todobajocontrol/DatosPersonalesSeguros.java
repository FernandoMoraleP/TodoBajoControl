package todobajocontrol;

public class DatosPersonalesSeguros extends DatosPersonales {

    private String contrasenia;

    public void setContrasenia(String icontrasenia) {

        contrasenia = icontrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void creaRegistro() {
        Reader read = new Reader();

        DatosPersonalesSeguros usuarios = new DatosPersonalesSeguros();

        System.out.println("  Ingrese el nombre de usuario: ");
        usuarios.setNombre(read.leeString());

        System.out.println("  Ingrese la contrasenia de usuario: ");
        usuarios.setContrasenia(read.leeString());

        System.out.println("  Ingrese la edad: ");
        usuarios.setEdad(read.leeInt());
        System.out.println("\n");
    }
}
