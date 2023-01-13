package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Item {

//    @NotNull(groups = UpdateCheck.class) // 수정 요구사항으로 추가
//    private Long id;
//
//    @NotBlank(groups = {SavaCheck.class, UpdateCheck.class})
//    private String itemName;
//
//    @NotNull(groups = {SavaCheck.class, UpdateCheck.class})
//    @Range(min = 1000, max = 1000000, groups = {SavaCheck.class, UpdateCheck.class})
//    private Integer price;
//
//    @NotNull(groups = {SavaCheck.class, UpdateCheck.class})
//    @Max(value = 9999, groups = UpdateCheck.class) // 수정 요구사항 추가
//    private Integer quantity;

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
