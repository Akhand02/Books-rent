package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Books {
    @Id
    private String id;
    @Column(nullable = false, unique = true)
    @NaturalId
    private String isbn;
    @Column(nullable = false, unique = true)
    private String title;
    @Column(nullable = false)
    private String genre;
    private String shortDescription;
    private String longDescription;
    @Column(nullable = false, unique = true)
    private String banner;
    private int numberOfCopies;

}
