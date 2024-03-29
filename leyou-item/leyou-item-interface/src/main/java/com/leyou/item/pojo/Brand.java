package com.leyou.item.pojo;

import tk.mybatis.mapper.annotation.KeySql;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "tb_brand")
public class Brand {
    @Id
    @KeySql(useGeneratedKeys=true)
    private Long id;
    private String name;// 品牌名称
    private String image;// 品牌图片
    private Character letter;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }


    // getter setter 略
}