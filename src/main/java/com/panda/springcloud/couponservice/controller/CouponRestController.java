package com.panda.springcloud.couponservice.controller;

import com.panda.springcloud.couponservice.model.Coupon;
import com.panda.springcloud.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
    @Autowired
    CouponRepository repository;

    //responsible creating the coupon and return that coupon back
    @PostMapping("/coupons")
    public Coupon create(@RequestBody  Coupon coupon){

        return repository.save(coupon);
    }

    //return an existing coupon
    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable String code){
        return repository.findByCode(code);
    }
}
