package controllers;

import models.Person;
import views.ShowConsole;

public class MetodosBusquedaBinaria {
    
    private Person[] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria(Person[] personas) {
        this.people = personas;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodos de Busqueda Binaria");
    }

    public int findPersonByCode(int code) {
        int bajo = 0;
        int alto = people.length - 1;

        while (bajo <= alto) { 
            int central = (bajo + alto) / 2;
            // int central2 = bajo + (alto - bajo) / 2;
            
            // if (people[central2].getCode() == code) {
            //     return central2;
            // }
            // if (people[central2].getCode() < code) {
            //     bajo = central2 + 1;
            // }else{
            //     alto = central2 - 1;
            // }

            if (people[central].getCode() == code) {
                return central;
            }
            if (people[central].getCode() < code) {
                bajo = central + 1;
            }else{
                alto = central - 1;
            }
        }
        return -1;
    }

    public void showPersonByCode() {
        int codeToFind = pantalla.getCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson == -1){
            pantalla.showMessage("No hay una persona con ese codigo");
        }else{
            pantalla.showMessage("Persona con codigo " + codeToFind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    private int findPersonByName(String name) {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getName().compareTo(people[j + 1].getName()) > 0) {
                    // Intercambiar
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
        return -1;
    }

    public void showPersonByName() {
        String name = pantalla.getName();
        int indexPerson = findPersonByName(name);
        if (indexPerson == -1){
            pantalla.showMessage("Persona con codigo " + name + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }else{
            pantalla.showMessage("No hay una persona con ese nombre");
        }
    }
}