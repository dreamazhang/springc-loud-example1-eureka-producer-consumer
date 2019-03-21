package com.example.consumer.domain;

import java.io.Serializable;

/**
 * @ Author     ：Dreama
 * @ Date       ：Created in 17:28 2019/03/19
 * @ Description：
 * @Version:
 */

public class ResultData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public ResultData(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public ResultData() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return "ResultData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
