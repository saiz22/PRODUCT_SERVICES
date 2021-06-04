package com.sathish.productservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathish.productservices.clients.IGetCouponDetails;
import com.sathish.productservices.model.Coupon;
import com.sathish.productservices.model.Product;
import com.sathish.productservices.repos.ProductRepository;

@RestController

public class ProductController {
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	IGetCouponDetails coupondetails;
	@RequestMapping("/products/")
	@PostMapping
	public void save(@RequestBody Product product) {
		Coupon coupon = coupondetails.getCoupon(product.getCoupon_code());
		product.setPrice(product.getPrice().subtract(coupon.getPrice()));
		productRepo.save(product);
	}
		

}
