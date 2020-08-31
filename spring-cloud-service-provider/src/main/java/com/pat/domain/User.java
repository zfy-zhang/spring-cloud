package com.pat.domain;

/**
 * @Description: User Model
 * @Author <a href="mailto:zfy_zang@163.com">Vincent</a>
 * @Create 2020/8/28
 * @Modify
 * @since
 */
public class User {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
