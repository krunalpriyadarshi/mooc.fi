import java.util.ArrayList;

public class Package  {
    private ArrayList<Gift> gifts;
    private int totalWeight;

    public Package(){
        gifts = new ArrayList<>();
    }
    public void addGift(Gift gift){
        gifts.add(gift);
        this.totalWeight += gift.getWeight();
    }
    public int totalWeight(){
        return this.totalWeight;
    }
        

}
