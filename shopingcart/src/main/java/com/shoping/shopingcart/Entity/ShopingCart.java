package com.shoping.shopingcart.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityScan
@Entity
public class ShopingCart {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private  int id;
 private  String product;
 private  int price;
 private  String category;








}
