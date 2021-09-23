package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CouponController {

    private static List<Coupon> m_coupons = new ArrayList<>();

    static {
        m_coupons.add(new Coupon(1, "caffe"));
        m_coupons.add(new Coupon(2, "movie vip"));
        m_coupons.add(new Coupon(3, "sky jump"));
    }

    @GetMapping("/coupon")
    public List<Coupon> getCoupons()
    {
        return m_coupons;
    }

    @PostMapping("/coupon")
    public String addCoupon(@RequestBody Coupon c)
    {
        m_coupons.add(c);
        return "Coupon add";
    }

}


