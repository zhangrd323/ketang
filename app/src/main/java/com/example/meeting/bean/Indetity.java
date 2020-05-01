package com.example.meeting.bean;

/**
 * @Describe
 * @Author Mrsleep1
 * @Date 2020/3/30
 * @Contact 920671458@qq.com
 */
public class Indetity {
    private int type;
    private String name;

    public Indetity(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
