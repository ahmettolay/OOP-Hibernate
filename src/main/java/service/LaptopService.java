package service;


import productComputer.Laptop;
import productComputer.OEM.*;
import repository.LaptopDao;

import java.util.Arrays;

public class LaptopService {
    LaptopDao laptopDao = new LaptopDao();

    public void save(){
        CPU cpu = new CPU(2);
        GPU gpu = new GPU(2,"nVIDIA","16 GB RTX 3080 256-Bit Max-P 80Watt + 15 Watt");
        MotherBoard motherBoard= new MotherBoard("Asus","Prime B450M-K II Amd B450 DDR4 4400 MHz (OC)");
        OperatingSystem operatingSystem= new OperatingSystem("FreeDos");
        Battery battery =new Battery("Lityum İyon - 4 Hücreli");
        HardDisk hardDisk= new HardDisk("Samsung 960 Pro","SSD",5000,5500);
        KeyBoard keyBoard= new KeyBoard("Türkçe Q Tek Noktadan Led Adydınlatmalı");
        Ram ram = new Ram(32,"DDR4");
        Screen screen= new Screen(17.3,"IPS Mat Led","1920x1080");
        Speaker speaker=new Speaker("Realtek Audio");
        Laptop laptop=new Laptop(cpu,gpu, Arrays.asList(hardDisk),motherBoard,operatingSystem,Arrays.asList(ram),"Asus",keyBoard,screen,speaker);
        laptopDao.save(laptop);

    }
}
