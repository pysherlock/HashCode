package HashCode;

import java.util.HashMap;

/**
 * Created by Leo PU on 2016/2/11.
 */
public class Warehouse {

    private int Row;
    private int Column;
    private HashMap<Integer, Integer>Product;

    public void setRow(int row) {
        this.Row = row;
    }

    public void setColumn(int column) {
        Column = column;
    }

    public int getRow() {
        return Row;
    }

    public int getColumn() {
        return Column;
    }

    public HashMap<Integer, Integer> getProduct() {
        return Product;
    }

    public void setProduct(HashMap<Integer, Integer> product) {
        Product = product;
    }
}
