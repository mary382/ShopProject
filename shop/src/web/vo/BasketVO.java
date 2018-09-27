package web.vo;

import dao.DAO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yslabko on 08/16/2017.
 */
@Data


public class BasketVO {
    private Map<Long, AtomicInteger> basket;

    public BasketVO(Map<Long, AtomicInteger> basket) {
        this.basket = basket;
    }



    public Map<Long, AtomicInteger> getBasket() {
        return basket;
    }

    public void setBasket(Map<Long, AtomicInteger> basket) {
        this.basket = basket;
    }
}
