package productComputer;

import lombok.Data;
import lombok.NoArgsConstructor;
import productComputer.OEM.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
/*@DiscriminatorValue("laptop")*/
public class Laptop extends Computer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String brand;
    @OneToOne(cascade = CascadeType.ALL)
    private KeyBoard keyBoardDescription;
    @OneToOne(cascade = CascadeType.ALL)
    private Screen screen;
    @OneToOne(cascade = CascadeType.ALL)
    private Speaker sound;

    public Laptop(CPU cpu, GPU gpu, List<HardDisk> hardDisk, MotherBoard motherBoard
            , OperatingSystem operatingSystem, List<Ram> ram, String brand
            , KeyBoard keyBoardDescription, Screen screen, Speaker sound) {
        super(cpu, gpu, hardDisk, motherBoard, operatingSystem, ram);
        this.brand = brand;
        this.keyBoardDescription = keyBoardDescription;
        this.screen = screen;
        this.sound = sound;
    }


}
