package guru.springframework.spring5recipeapp.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    //no cascade, if we delete a note we dont want to delete the recipe
    private Recipe recipe;
    @Lob
    private String recipeNotes;

}
