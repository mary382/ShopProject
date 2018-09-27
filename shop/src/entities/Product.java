package entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class Product
 *
 * Created by yslabko on 08/08/2017.
 */
@Data

public class Product {
    private long id;
    private String supplier;
    private String model;
    private Double price;

    public Product() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(String supplier, String model, Double price) {
        this.supplier = supplier;
        this.model = model;
        this.price = price;
    }
}
