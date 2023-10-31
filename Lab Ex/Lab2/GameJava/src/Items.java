abstract public class Items {
    private String name;
    private ItemType type;
    private int value;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    Items(String name, ItemType type, int value){
        this.name = name;
        this.type = type;
        this.value = value;
    }
}
