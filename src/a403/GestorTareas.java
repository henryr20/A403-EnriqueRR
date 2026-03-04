package a403;

import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> lista;

    public GestorTareas() {
        lista = new ArrayList<>();
    }

    public void añadirTarea(String descripcion) {
        Tarea t = new Tarea(descripcion);
        lista.add(t);
    }    

    public ArrayList<Tarea> getLista() {
        return lista;
    }
}
