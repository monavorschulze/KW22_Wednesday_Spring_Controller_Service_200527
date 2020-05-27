package de.neuefische.springgroupproject1.service;

import de.neuefische.springgroupproject1.model.Order;
import de.neuefische.springgroupproject1.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    public List<Order> orderList = new ArrayList<>(List.of(

            new Order("1",List.of( new Product("3","Affe"))),
            new Order("2",List.of( new Product("7","Katze")))

    ));

    public List<Order> getOrderList (){
        return orderList;
    }

}
