package com.shoping.shopingcart.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopingDto {
    private  String product;
    private  int price;
    private  String category;
}
