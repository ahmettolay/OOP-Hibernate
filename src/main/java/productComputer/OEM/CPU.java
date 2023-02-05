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
public class CPU {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String description;

    public CPU(int id) {
        this.id = id;
    }

    public CPU(String brand, String description) {
        this.brand = brand;
        this.description = description;
    }

    public CPU(int id, String brand, String description) {
        this.id = id;
        this.brand = brand;
        this.description = description;
    }
}
