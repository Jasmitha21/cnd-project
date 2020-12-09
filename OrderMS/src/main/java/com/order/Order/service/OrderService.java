package com.order.Order.service;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Optional;

	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.order.Order.dto.OrderDTO;
import com.order.Order.entity.Order;
import com.order.Order.repository.OrderRepository;
import com.order.Order.validator.OrderValidator;

	
	@Service
	public class OrderService {
	Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
	OrderRepository orderRepo;

	public String addOrder(OrderDTO orderDTO) throws Exception{
	Order order=orderDTO.createEntity();
	OrderValidator.ValidateOrderForAdding(order);
	orderRepo.save(order);
	return "Success";
	}

	public String removeOrder(Integer orderId) {
	Optional<Order> ord1 = orderRepo.findById(orderId);
	if (ord1.isPresent())
	{
	orderRepo.deleteById(orderId);
	return "Success";
	}
	return "Failed";
	}

	public String updateStatusForOrder(Integer orderId, String status) {
	Optional<Order> ord2 = orderRepo.findById(orderId);
	Order order = null;
	if (ord2.isPresent())
	{
	order = ord2.get();
	}
	order.setStatus(status);
	orderRepo.save(order);
	return "Success";
	}
	public List<OrderDTO> viewOrders()
	{
	List<Order> orders= orderRepo.findAll();
	   List<OrderDTO> orderDTOs= new ArrayList<OrderDTO>();
	   
	   for(Order order : orders)
	   {
	    OrderDTO orderDTO = OrderDTO.valueOf(order);
	    orderDTOs.add(orderDTO);
	   }
	   logger.info("Order Details: {}", orderDTOs);
	   return orderDTOs;
	}


}

