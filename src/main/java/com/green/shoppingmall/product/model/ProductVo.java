package com.green.shoppingmall.product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductVo {
    private Long iproduct;
    private int price;
    private String nm;
    private String mainPic;
    private String brand;
}
