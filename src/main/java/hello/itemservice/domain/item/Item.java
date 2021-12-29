package hello.itemservice.domain.item;


import lombok.Data;

import java.util.List;

@Data
public class Item {


    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;


    //2021 12 29 여기까지
    private Boolean open;  //판매여부
    private List<String> regions; // 등록지역
    public Item(){

    }

    public Item( String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


}
