package ar.edu.utn.frba.dds;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PruebaPersistencia {

    @Id
    @GeneratedValue
    public Integer id;

    @Column
    public String nombre;
}
