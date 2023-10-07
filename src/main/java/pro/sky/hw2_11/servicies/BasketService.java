package pro.sky.hw2_11.servicies;

import org.springframework.web.context.annotation.SessionScope;
import pro.sky.hw2_11.model.Basket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@SessionScope
public class BasketService {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public Map<Integer, Integer> add(List<Integer> ids) {
        return basket.add(ids);
    }

    public Map<Integer, Integer> get() {
        return basket.get();
    }
}
