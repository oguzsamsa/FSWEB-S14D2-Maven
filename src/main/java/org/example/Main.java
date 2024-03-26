package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bedroom bedroom = new Bedroom("bedroom", new Wall("doğu"), new Wall("batı"), new Wall("kuzey"), new Wall("güney"), new Ceiling(3, PaintColor.RED), new Bed("double", 2, 2, 1, 1), new Lamp(LampType.LAVA, true, 1), new Wardrobe(1, 2, 20), new Carpet(1, 2, PaintColor.GREEN));
        bedroom.getBed().make();
        System.out.println(bedroom.getLamp().getGlobRating());
        System.out.println(bedroom.getCeiling().getColor());
        bedroom.getCeiling().create();
    }
}