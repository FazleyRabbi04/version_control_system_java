package Objects.Tree;

public class TreeItem {
    private final ChildTypes childType;
    private String childHash;
    private final String childName;
    TreeItem(ChildTypes childType ,String childHash,String childName ){
        this.childHash = childHash;
        this.childName = childName;
        this.childType = childType;
    }
    TreeItem(String logEntry){
        String[] items = logEntry.split(",");
        this.childType = ChildTypes.get(items[0]);
        this.childHash = items[1];
        this.childName = items[2];
    }

    @Override
    public String toString() {
        String serialStringSb = this.childType.getAction() + "," +
                this.childHash + "," +
                this.childName;
        return serialStringSb;
    }

    public ChildTypes getChildType() {
        return childType;
    }

    public String getChildHash() {
        return childHash;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildHash(String childHash) {
        this.childHash = childHash;
    }
    
    
    
}
