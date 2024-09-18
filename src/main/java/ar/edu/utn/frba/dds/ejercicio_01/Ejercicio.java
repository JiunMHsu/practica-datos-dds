package ar.edu.utn.frba.dds.ejercicio_01;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ejercicio")
public class Ejercicio {

    @Id
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "detalle", columnDefinition = "TEXT")
    private String detalle;
}
