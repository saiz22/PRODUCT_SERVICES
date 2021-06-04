package com.sathish.productservices.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sathish.productservices.model.Coupon;


@FeignClient("COUPON-SERVICE")
public interface IGetCouponDetails {
	
	@GetMapping("/coupons/{code}")
	Coupon getCoupon (@PathVariable(name="code") String code);

}
