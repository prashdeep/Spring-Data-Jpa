package com.sapient.productservice.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product implements Serializable {

    @XmlElement
    private int id;

    @XmlElement
    private String name;

    @XmlElement
    private double price;
}