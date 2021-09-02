package inflearn.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Item {
    private Long id;
    private String itemName;
    private Integer price; //int와 차이: null 허용
    private Integer quantity;


    public Item(String itemName, Integer price, Integer quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

}
