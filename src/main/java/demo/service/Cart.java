package demo.service;

import demo.model.Product;
import demo.repo.ProductRepository;

public interface Cart {

    void add(Product product);

    void remove(int id);
}
