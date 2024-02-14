package com.shoping.shopingcart.Service;

import com.shoping.shopingcart.Dto.ShopingDto;
import com.shoping.shopingcart.Entity.ShopingCart;
import com.shoping.shopingcart.Respository.ShopingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopingService {

    @Autowired
    ShopingCartRepository shopingCartRepository;

public ShopingCart SendAllData(ShopingDto shopingDto){

    ShopingCart shopingCart=new ShopingCart();
    shopingCart.setProduct(shopingDto.getProduct());
    shopingCart.setPrice(shopingDto.getPrice());
    shopingCart.setCategory(shopingDto.getCategory());
return  shopingCartRepository.save(shopingCart);
}

public List<ShopingCart> SendAll(){
return shopingCartRepository.findAll();
}

}
