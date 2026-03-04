package a403;

import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> lista;

    public GestorTareas() {
        lista = new ArrayList<>();
    }

    public void mostrarTareas() {

        if (lista.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }

    }

    public ArrayList<Tarea> getLista() {
        return lista;
    }
}
