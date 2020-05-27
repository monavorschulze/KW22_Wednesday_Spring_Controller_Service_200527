package de.neuefische.springgroupproject1.db;


import de.neuefische.springgroupproject1.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ProductDB {

    private final List<Product> productList = new ArrayList<>(List.of(
            new Product("1", "Pizza Caprese"),
            new Product("2", "Pizza Cipolla"),
            new Product("3", "Pizza Tonno"),
            new Product("4", "Pizza Prosciutto")
    ));

    public void add(Product product){
        this.productList.add(product);
    }

    public List<Product> getProductList() {
        return Collections.unmodifiableList(productList);
    }

}
