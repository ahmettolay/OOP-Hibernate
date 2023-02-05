package productComputer;

import lombok.Data;
import lombok.NoArgsConstructor;
import productComputer.OEM.*;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass
/*@Inheritance(strategy = InheritanceType.SINGLE_TABLE)*/
@Data
@NoArgsConstructor
public class Computer {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 int id;
 @OneToOne(cascade = CascadeType.ALL)
 private CPU cpu;
 @OneToOne(cascade = CascadeType.ALL)
 private GPU gpu;
 @OneToMany(cascade = CascadeType.ALL)
 private List<HardDisk> hardDisk;
 @OneToOne(cascade = CascadeType.ALL)
 private MotherBoard motherBoard;
 @OneToOne(cascade = CascadeType.ALL)
 private OperatingSystem operatingSystem;
 @OneToMany(cascade = CascadeType.ALL)
 private List<Ram>  ram;



 public Computer( CPU cpu, GPU gpu, List<HardDisk> hardDisk, MotherBoard motherBoard, OperatingSystem operatingSystem, List<Ram> ram) {

  this.cpu = cpu;
  this.gpu = gpu;
  this.hardDisk = hardDisk;
  this.motherBoard = motherBoard;
  this.operatingSystem = operatingSystem;
  this.ram = ram;
 }
}
