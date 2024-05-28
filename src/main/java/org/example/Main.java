package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp=new Lamp(LampType.LAVA,true, 100);
        Ceiling ceiling=new Ceiling(10,PaintColor.WHITE);
        Bed bed=new Bed("double",2,2,4,3);
        Carpet carpet=new Carpet(2,2,PaintColor.RED);
        Wardrobe wardrobe=new Wardrobe(3,3,150);
        Wall wall1=new Wall("Deneme duvar1");
        Wall wall2=new Wall("Deneme duvar2");
        Wall wall3=new Wall("Deneme duvar3");
        Wall wall4=new Wall("Deneme duvar4");
        Wall[] walls=new Wall[]{wall1,wall2,wall3,wall4};

        Bedroom bedroom=new Bedroom(carpet,lamp,ceiling,wall4,wall3,wall2,wall1,"deneme yatak odası",bed,wardrobe);
        bedroom.CreateBedroom();    }

}