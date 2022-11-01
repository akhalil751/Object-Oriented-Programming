import java.util.ArrayList;

public class GroceryList {
    ArrayList<GroceryItemOrder> items;

    public GroceryList() {
        items = new ArrayList<>();
    }
    public void add(GroceryItemOrder item){
        if(items.size() < 10)
            items.add(item);
    }
    public double getTotalCost(){
        double total = 0;
        for(int i = 0; i < items.size(); i++){
            total += items.get(i).getCost();
        }
        return total;
    }
}
