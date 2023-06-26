package com.green.shoppingmall.product.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDetailVo {
    private Long iproduct;
    private int price;
    private String nm;
    private String mainPic;
    private String brand;
    private String ctnt;


}
