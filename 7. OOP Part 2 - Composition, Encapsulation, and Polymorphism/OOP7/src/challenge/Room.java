package challenge;

public class Room {
    private Bed bed;
    private Furniture furniture;
    private Floor floor;

    public Room(Bed bed, Furniture furniture, Floor floor) {
        this.bed = bed;
        this.furniture = furniture;
        this.floor = floor;
    }

    public void cleanRoom(){
        bed.makeTheBed();
        furniture.cleanFurniture();
        floor.cleanFloor();
    }

    public void isComfortable(){
        if(bed.getPillow().isFluffy()){
            System.out.println("It is comfortable in the room.");
        }
        else{
            System.out.println("It's not comfortable in the room.");
        }
    }
}
