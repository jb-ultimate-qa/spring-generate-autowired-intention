package com.example.springgenerateautowiredintention.beans;


public class XmlBean1 {
    private final XmlBean3 bean;

    public XmlBean1(XmlBean3 xmlBean3) {
        this.bean = xmlBean3;
    }
    public XmlBean3 getBean() {
        return bean;
    }
}
