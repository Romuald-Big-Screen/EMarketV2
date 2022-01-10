package com.EMarketV2.EMarketV2.service;

import com.EMarketV2.EMarketV2.dao.IMarketDAO;
import com.EMarketV2.EMarketV2.model.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public class MarketServiceImpl implements ICategoriesAdminService{
    private IMarketDAO dao;

    public void setDao(IMarketDAO dao) {
        this.dao = dao;
    }

    @Override
    public Long addCategory(Category c) {
        return dao.addCategory(c);
    }

    @Override
    public void deleteCategory(Long catId) {
        dao.deleteCategory(catId);
    }

    @Override
    public void updateCategory(Category c) {
        dao.updateCategory(c);
    }

    @Override
    public void addUser(User u) {
        dao.addUser(u);
    }

    @Override
    public void attributeRole(Role r, Long userId) {
        dao.attributeRole(r,userId);
    }

    @Override
    public Long addProduct(Product p, Long catId) {
        return dao.addProduct(p, catId);
    }

    @Override
    public void deleteProduct(Long pId) {
        dao.deleteProduct(pId);
    }

    @Override
    public void updateProduct(Product p) {
        dao.updateProduct(p);
    }

    @Override
    public List<Category> listCategories() {
        return dao.listCategories();
    }

    @Override
    public Category getCategory(Long catId) {
        return dao.getCategory(catId);
    }

    @Override
    public List<Product> listProducts() {
        return dao.listProducts();
    }

    @Override
    public List<Product> listProductsByKw(String kw) {
        return dao.listProductsByKw(kw);
    }

    @Override
    public List<Product> productsByCategory(Long catId) {
        return dao.listProductsByCategory(catId);
    }

    @Override
    public List<Product> listProductsSelected() {
        return dao.listProductsSelected();
    }

    @Override
    public Product getProduct(Long pId) {
        return dao.getProduct(pId);
    }

    @Override
    public Order saveOrder(Cart ca, Customer c) {
        return dao.saveOrder(ca, c);
    }
}
