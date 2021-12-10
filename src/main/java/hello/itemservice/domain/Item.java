package hello.itemservice.domain;


import lombok.Data;

@Data
public class Item {


    private Long id;
    private String itemname;
    private Integer price;
    private Integer quantity;

    public Item(){

    }

    public Item( String itemname, Integer price, Integer quantity) {
        this.itemname = itemname;
        this.price = price;
        this.quantity = quantity;
    }


}
