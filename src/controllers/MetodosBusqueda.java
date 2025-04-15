package controllers;

import models.Person;
import views.ShowConsole;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private Person[] people;

    public MetodosBusqueda(Person[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPersonByCode();    }

    public int busqueaLineal(int[] arreglo, int valorBuscar){
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == valorBuscar) {
                return i;
            }
        }
        return -1;
    }

    public int findPersonByCode(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code){
                return i;
            }
        }
        return -1;
    }
    
    public void showPersonByCode(){
        int codeToFind = showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson >= 0){
            showConsole.showMessage("Persona Encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        }else{
            showConsole.showMessage("Persona con codigo "+ codeToFind +" no encontrada");
        }
    } 
}