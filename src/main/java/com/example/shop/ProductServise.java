package com.example.shop;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class productService implements Shop{
    @Autowired
    ClassNameGenerator className;

    public void setClassName(ClassNameGenerator className) {
        this.className = className;
    }

    @Override
    public String generateCode(){
        return "public class "+className.getName()+" {\n" +
                "    public static void main(String[] args) {\n" +
                "    }\n" +
                "}";
    }

    @Override
    public String toString() {
        return "JavaClassDemo{" +
                "className=" + className +
                '}';
    }
}