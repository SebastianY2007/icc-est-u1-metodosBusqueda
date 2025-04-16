package views;

import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        System.out.println("Metodo Busqueda: ");
    }

    public int getCode(){
        System.out.println("Ingrese codigo: ");
        int codigo = scanner.nextInt();
        System.out.println("Codigo ingresado: " + codigo);
        return codigo;
    }

    public String getName(){
        System.out.println("Ingrese el nombre: ");
        String name = scanner.next();
        System.out.println("Nombre ingresado: " + name);
        return name;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}