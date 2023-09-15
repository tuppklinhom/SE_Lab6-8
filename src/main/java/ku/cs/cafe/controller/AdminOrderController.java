package ku.cs.cafe.controller;

import ku.cs.cafe.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.UUID;

/**
 ---------------------------------
// Tupp klinhom
// 6410450966
 ---------------------------------
 **/

@Controller
@RequestMapping("/admin/orders")
public class AdminOrderController {


    @Autowired
    private OrderService orderService;

    @GetMapping("/{orderId}")
    public String getAllOrders(@PathVariable UUID orderId, Model model) {
        model.addAttribute("order", orderService.getById(orderId));
        return "order-view";
    }

    @PostMapping("/{orderId}/finish")
    public String finishOrder(@PathVariable UUID orderId, Model model) {
        orderService.finishOrder(orderId);
        return "redirect:/admin/orders";
    }

    @GetMapping
    public String getAllOrders(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        return "order-all";
    }
}

