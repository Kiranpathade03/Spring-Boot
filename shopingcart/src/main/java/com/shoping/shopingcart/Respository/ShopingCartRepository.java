package com.shoping.shopingcart.Respository;

import com.shoping.shopingcart.Entity.ShopingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopingCartRepository extends JpaRepository<ShopingCart ,Integer> {
}
