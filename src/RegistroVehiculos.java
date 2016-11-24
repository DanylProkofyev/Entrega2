import java.util.*;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {
        coches.add(coche);
    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7
    public Coche obtenerVehiculo(String matricula) {
        for (Coche coche : coches) {
            if (coche.getMatricula().equalsIgnoreCase(matricula)) {
                return coche;
            }
        }
        return null;
    }

    public void eliminarVehiculo(String matricula) {
        for (Coche coche : coches) {
            if (coche.getMatricula().equalsIgnoreCase(matricula)) {
                coches.remove(coche);
            }
        }
    }

    public Coche obtenerVehiculoPrecioMax() {
        int maxPrecio = 0;
        for (Coche coche : coches) {
            if (coche.getPrecio() > maxPrecio) {
                maxPrecio = coche.getPrecio();
            }

        }
        for (Coche coche : coches) {
            if (coche.getPrecio() == maxPrecio) {
                return coche;
            }

        }
        return null;
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {
        List<Coche> marcas = new ArrayList<>();
        for (Coche coche : coches) {
            if (coche.getModelo().equalsIgnoreCase(marca)) {
                marcas.add(coche);
            }
        }
        return marcas;
    }

    public List<Coche> obtenerTodos() {
        List<Coche> todos = new ArrayList<>();
        for (Coche coche : coches) {
            todos.add(coche);
        }
        return todos;
    }
}
