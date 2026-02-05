package co.edu.uniandes.dse.TallerPersistencia.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;




@Entity
@Data
public class MovieEntity extends BaseEntity {


    private String title;
    private Integer releaseYear;
    

    @ManyToOne
    private DirectorEntity director;


    @ManyToMany
    @JoinTable(
        name = "movie_genre",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<GenreEntity> genres = new ArrayList<>();


    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "script_id")
    private ScriptEntity script;



}
