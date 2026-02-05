package co.edu.uniandes.dse.TallerPersistencia.entities;


import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;



@Entity
@Data
public class DirectorEntity extends BaseEntity {
    private String name;
    private String nationality;


    @OneToMany(mappedBy = "director")
    private List<MovieEntity> movies = new ArrayList<>();


}
