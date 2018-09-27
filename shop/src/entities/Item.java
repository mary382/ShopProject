package entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class Item
 *
 * Created by yslabko on 07/01/2017.
 */
@Data

public class Item {
    private long id;
    private long productId;
    private long orderId;
    private int quantity;
    private double discountPercent;

    public Item() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Item(long orderId, long productId, int quantity, double discountPercent) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.discountPercent = discountPercent;
    }

    public Item(long orderId, long productId, int quantity) {
        this(orderId, productId, quantity, 0);
    }
}
