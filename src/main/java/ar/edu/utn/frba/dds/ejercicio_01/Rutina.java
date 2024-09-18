package ar.edu.utn.frba.dds.ejercicio_01;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
@Table(name = "rutina")
public class Rutina {

    @Id
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @OneToOne
    @JoinColumn(name = "deportista_id")
    private Deportista deportista;

    @OneToMany
    @JoinColumn(name = "dia_entrenamiento_id")
    private List<DiaDeEntrenamiento> diasDeEntrenamiento;

    @OneToOne
    @JoinColumn(name = "rutina_anterior_id")
    private Rutina rutinaAnterior;

    public Rutina() {
        this.diasDeEntrenamiento = new ArrayList<>();
    }

    public void agregarDiaDeEntrenamiento(DiaDeEntrenamiento diaDeEntrenamiento) {
        this.diasDeEntrenamiento.add(diaDeEntrenamiento);
    }
}
