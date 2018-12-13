package cn.edu.ncu.bookstore.entity;

import org.springframework.stereotype.Component;

/**
 * @auther: Liu Zedi.
 * @date: Create in 2018/12/12  15:29
 * @package: cn.edu.ncu.bookstore.entity
 * @project: springMVCDome
 */

public class Category {
    private int id;
    private String name;
    private String description;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
