package com.EMarketV2.EMarketV2.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="CATEGORY")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long categoryId;

    @NotEmpty
    @Size(min=4, max=15)
    private String categoryName;
    @Size(min=3, max=15)
    private String description;
    @Lob
    private byte[] photo;
    private String photoName;

    @OneToMany(mappedBy="category")
    private List<Product> products;

    public Category(String myCategory, String description, byte[] photo, String myPhoto) {
        super();
        this.categoryName = categoryName;
        this.description = description;
        this.photo = photo;
        this.photoName = photoName;
        this.products = products;
    }

    public Category() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getIdCategory() {
        return categoryId;
    }

    public void setIdCategory(Long idCategory) {
        this.categoryId = idCategory;
    }

    public String getMyCategory() {
        return categoryName;
    }

    public void setMyCategory(String myCategory) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getMyPhoto() {
        return photoName;
    }

    public void setMyPhoto(String myPhoto) {
        this.photoName = photoName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
