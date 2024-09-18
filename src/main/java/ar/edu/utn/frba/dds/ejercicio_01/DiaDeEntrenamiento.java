package ar.edu.utn.frba.dds.ejercicio_01;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dia_entrenamiento")
public class DiaDeEntrenamiento {

    @Id
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @OneToMany
    @JoinColumn(name = "dia_entrenamiento_id")
    private List<Ejercicio> ejercicios;

    @Column(name = "numero")
    private Integer numero; // representa el orden en la duracion de la rutina.

    @OneToOne
    @JoinColumn(name = "siguiente_dia_id")
    private DiaDeEntrenamiento siguienteDia;

    public DiaDeEntrenamiento() {
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        this.ejercicios.add(ejercicio);
    }
}
