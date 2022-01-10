package com.EMarketV2.EMarketV2.service;

import com.EMarketV2.EMarketV2.model.Category;
import com.EMarketV2.EMarketV2.model.Role;
import com.EMarketV2.EMarketV2.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriesAdminService extends  IProductsAdminService{

    public Long addCategory(Category c);
    public void deleteCategory(Long catId);
    public void updateCategory(Category c);
    public void addUser(User u);
    public void attributeRole(Role r,Long userId);

}
