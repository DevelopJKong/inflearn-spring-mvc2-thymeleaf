package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class Item {
    private Long id;
    private String itemName;
    private Integer price; // Integer 하는 이유는 null을 넣어줄수도 있기 때문이다
    private Integer quantity;

    public Item() {

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
