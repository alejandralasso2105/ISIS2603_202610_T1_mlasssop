package co.edu.uniandes.dse.TallerPersistencia.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Entity
@Data
public class ScriptEntity extends BaseEntity {


    private String name;
    private String originalName;

    @OneToOne(mappedBy = "script")
    private MovieEntity movie;

}
