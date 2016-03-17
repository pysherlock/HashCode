package HashCode;

import java.util.ArrayList;

/**
 * Created by Leo PU on 2016/2/11.
 */
public class Product {

    int Types;
    ArrayList<Integer> Weight;

    public int getTypes() {
        return Types;
    }

    public void setTypes(int types) {
        Types = types;
    }

    public void setWeight(ArrayList<Integer> weight) {
        Weight = weight;
    }

    public ArrayList<Integer> getWeight() {
        return Weight;
    }
}
