package com.example.sitecommerce.model;
import javax.persistence.*;

@Entity
@Table
public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false ,unique = true,length = 50)
    private String name;
    @Column(nullable = false ,unique = true,length = 50)
    private String auteur;
    @Column(nullable = false ,unique = true,length = 50)
    private int Price;
    @Column(nullable = false ,unique = true,length = 50)
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auteur='" + auteur + '\'' +
                ", Price=" + Price +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Book(int id, String name, String auteur, int price, String desc) {
        this.id = id;
        this.name = name;
        this.auteur = auteur;
        Price = price;
        this.desc = desc;
    }
}
