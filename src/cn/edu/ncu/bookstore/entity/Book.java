package cn.edu.ncu.bookstore.entity;

import org.springframework.stereotype.Component;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/12  23:45
 * @package: cn.edu.ncu.bookstore.entity
 * @project: springMVCDome
 */
public class Book {
    private int id;
    private String name;
    private String author;
    private double price;
    private String image;
    private String description;
    private String category_id;
    private String category_description;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory_id() {
        return category_id;
    }

    public String getCategory_description() {
        return category_description;
    }
}
