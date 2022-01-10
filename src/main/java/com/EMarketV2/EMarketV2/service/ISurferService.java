package com.EMarketV2.EMarketV2.service;

import com.EMarketV2.EMarketV2.model.*;

import java.util.List;

public interface ISurferService {
    public List<Category> listCategories();
    public Category getCategory(Long catId);
    public List<Product> listProducts();
    public List<Product> listProductsByKw(String kw);
    public List<Product> productsByCategory(Long catId);
    public List<Product> listProductsSelected();
    public Product getProduct(Long pId);
    public Order saveOrder(Cart ca, Customer c);
}
