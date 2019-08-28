package com.zzj.designer.prototype.shallow;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Publisher {
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
