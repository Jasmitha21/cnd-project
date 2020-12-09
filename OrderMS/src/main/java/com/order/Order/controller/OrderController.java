package com.order.Order.controller;



	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

import com.order.Order.dto.OrderDTO;
import com.order.Order.service.OrderService;

	

	@RestController
	@EnableAutoConfiguration
	public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping(value = "/orders")
	public String addOrder(@RequestBody OrderDTO orderDTO) throws Exception
	{
	return orderService.addOrder(orderDTO);
	}

	@GetMapping(value = "/orders/orderId/{orderId}")
	public String removeOrder(@PathVariable Integer orderId)
	{
	return orderService.removeOrder(orderId);
	}

	@PostMapping(value = "/orders/viewallorders")
	public List<OrderDTO> viewAllOrders()
	{
	return orderService.viewOrders();
	}

	@PostMapping(value = "/orders/updatestatus")
	public String updateStatus(@RequestParam(name = "orderid")Integer orderId,@RequestParam(name = "status") String status)
	{
	return "Success";
	}
}

