package ar.edu.utn.frba.dds.ejercicio_01;

import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Motivacion;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.MotivacionAttributeConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "deportista")
public class Deportista {

    @Id
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @ElementCollection
    @CollectionTable(name = "contacto_deportista", joinColumns = @JoinColumn(name = "deportista_id"))
    @Column(name = "contacto")
    private List<String> contactos;

    @Convert(converter = MotivacionAttributeConverter.class)
    @Column(name = "motivacion")
    private Motivacion motivacionPrincipal;

    @Column(name = "peso_inicia_kilos")
    private Double pesoInicialEnKilos;

    public Deportista() {
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(String contacto) {
        contactos.add(contacto);
    }

}
