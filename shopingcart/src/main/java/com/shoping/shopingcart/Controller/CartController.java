package com.shoping.shopingcart.Controller;

import com.shoping.shopingcart.Dto.ShopingDto;
import com.shoping.shopingcart.Entity.ShopingCart;
import com.shoping.shopingcart.Service.ShopingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

 @Autowired
    ShopingService shopingService;

@PostMapping("/shoping")
    public ShopingCart PostAll(@RequestBody ShopingDto shopingDto){
    return shopingService.SendAllData(shopingDto);
}

@GetMapping("/getshoping")
    public List<ShopingCart> GetAll(){
    return shopingService.SendAll();
}

}
