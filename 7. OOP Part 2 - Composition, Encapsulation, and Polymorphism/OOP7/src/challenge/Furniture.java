package challenge;

public class Furniture {
    private Closet closet;
    private Table table;
    private Chair chair;

    public Furniture(Closet closet, Table table, Chair chair) {
        this.closet = closet;
        this.table = table;
        this.chair = chair;
    }

    public Closet getCloset() {
        return closet;
    }

    public Table getTable() {
        return table;
    }

    public Chair getChair() {
        return chair;
    }

    public void cleanFurniture(){
        closet.cleanCloset();
        table.cleanTable();
        chair.cleanChair();
    }
}
