package ar.edu.utn.frba.dds.ejercicio_01;

import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Motivacion;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Deportista {
    private String nombre;
    private String apellido;
    private List<String> contactos;
    private Motivacion motivacionPrincipal;
    private Double pesoInicialEnKilos;

    public void agregarContacto(String contacto) {
        contactos.add(contacto);
    }

    public Deportista() {
        this.contactos = new ArrayList<>();
    }

}
