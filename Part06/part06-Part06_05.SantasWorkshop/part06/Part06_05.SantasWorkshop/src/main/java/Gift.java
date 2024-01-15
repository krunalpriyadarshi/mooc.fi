public class Gift {
    private String Name;
    private int Weight;

    public Gift(String name, int weight){
        Name = name;
        Weight = weight;
    }
    public String getName(){
        return this.Name;
    }
    public int getWeight(){
        return this.Weight;
    }
    public String toString(){
        return this.Name + " (" + this.Weight + " kg)";
    }
}
