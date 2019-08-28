package com.zzj.designer.prototype.deep.serialize;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 对象属性也需要实现Cloneable，用于深拷贝，如果Publisher里还有一个对象属性Building，那么如果要实现深拷贝，Building也需要实现Cloneable接口，就是说有多少层，就实现多少层Cloneable接口
 */
@Setter
@Getter
public class Publisher implements Serializable {
    /**
     * 出版社名字
     */
    private String name;
    /**
     * 出版社地址
     */
    private String location;

    public Publisher(String name, String location) {
        this.name = name;
        this.location = location;
    }

}
