package productComputer;

import lombok.Data;
import lombok.NoArgsConstructor;
import productComputer.OEM.Screen;
import productComputer.OEM.Speaker;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
/*@DiscriminatorValue("allinone")*/
public class AllInOne extends Computer {

    private String brand;
    @OneToOne(cascade = CascadeType.ALL)
    private Screen screen;
    @OneToOne(cascade = CascadeType.ALL)
    private Speaker sound;
}
