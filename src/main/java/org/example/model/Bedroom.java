package org.example.model;

public class Bedroom extends Room{
    private String name;

    private Bed bed;
    private Wardrobe wardrobe;

    public Bedroom(Carpet carpet, Lamp lamp, Ceiling ceiling, Wall wall4, Wall wall3, Wall wall2, Wall wall1, String name, Bed bed, Wardrobe wardrobe) {
        super(carpet, lamp, ceiling, wall4, wall3, wall2, wall1);
        this.name = name;
        this.bed = bed;
        this.wardrobe = wardrobe;
    }

    public String getName() {
        return name;
    }



    public Bed getBed() {
        return bed;
    }


    public Wardrobe getWardrobe() {
        return wardrobe;
    }
public void CreateBedroom(){
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        bed.make();
        getCarpet().lying();
        wardrobe.add();
        getLamp().turnOn();
}
    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +", room= "+super.toString()+
                '}';
    }
}
