package com.EMarketV2.EMarketV2.service;

import com.EMarketV2.EMarketV2.model.Product;

public interface IProductsAdminService extends ISurferService {

    public Long addProduct(Product p,Long catId);
    public void deleteProduct(Long pId);
    public void updateProduct(Product p);

}
