package David;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String usuario;
        String clave;

        final String usuario_admin = "admin";
        final String clave_admin = "1234";
        final String usuario_normal = "user";
        final String clave_usuario = "abcd";
        final String usuario_invitado = "guest";
        final String clave_invitado = "xyz";

        Scanner sc = new Scanner(System.in);


        System.out.println("Bienvenido, para iniciar sesión introduce tu nombre de usuario");

        usuario = sc.nextLine();

        System.out.println("Ahora introduce tu clave");
        clave = sc.nextLine();

        if ((usuario.equals(usuario_admin)) && (clave.equals(clave_admin))) {
            System.out.println("Has accedido al sistema como administrador");

        } else if ((usuario.equals(usuario_normal)) && (clave.equals(clave_usuario))) {
            System.out.println("Has accedido al sistema como usuario normal");

        } else if ((usuario.equals(usuario_normal)) && (clave.equals(clave_usuario))) {
            System.out.println("Has accedido al sistema como usuario normal");

        } else if ((usuario.equals(usuario_invitado)) && (clave.equals(clave_invitado))) {
            System.out.println("Has accedido al sistema como usuario normal");

        } else {
            System.out.println("Tus credenciales son incorrectas, el acceso ha sido denegado");
        }


    }


}
