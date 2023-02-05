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
public class GPU {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
   private String description;

   private double price;

    public GPU(int id) {
        this.id = id;
    }

    public GPU(String brand, String description) {
        this.brand = brand;
        this.description = description;
    }

    public GPU(int id, String brand, String description) {
        this.id = id;
        this.brand = brand;
        this.description = description;
    }
}
