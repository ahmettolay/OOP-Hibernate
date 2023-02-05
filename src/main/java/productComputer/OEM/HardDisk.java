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
public class HardDisk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String diskType;
    private int readSpeed;
    private int writeSpeed;

    public HardDisk(String brand, String diskType, int readSpeed, int writeSpeed) {
        this.brand = brand;
        this.diskType = diskType;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
    }
}
