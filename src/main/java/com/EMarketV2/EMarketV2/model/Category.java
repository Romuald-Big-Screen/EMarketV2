package com.EMarketV2.EMarketV2.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name="CATEGORY")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idCategory;

    @NotEmpty
    @Size(min=4, max=15)
    private String categoryName;
    @Size(min=3, max=15)
    private String description;
    @Lob
    private byte[] photo;
    private String myPhoto;

    @OneToMany(mappedBy="category")
    private Collection<Product> products;

    public Category(String myCategory, String description, byte[] photo, String myPhoto) {
        super();
        this.categoryName = categoryName;
        this.description = description;
        this.photo = photo;
        this.myPhoto = myPhoto;
        this.products = products;
    }

    public Category() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
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
        return myPhoto;
    }

    public void setMyPhoto(String myPhoto) {
        this.myPhoto = myPhoto;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
