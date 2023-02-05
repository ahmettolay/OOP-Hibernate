package productComputer.OEM;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double size;
    private String technology;
    private String resolutionMaximum;

    public Screen(double size, String technology, String resolutionMaximum) {
        this.size = size;
        this.technology = technology;
        this.resolutionMaximum = resolutionMaximum;
    }
}
