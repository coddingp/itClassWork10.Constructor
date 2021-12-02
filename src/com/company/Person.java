package com.company;

public class Person {
    int id;
    String name;
    int weight;
    int height;

    public Person() {

    }

    public Person(int id, String name, int weight, int height) {
        this.name = name;
        this.id = id;
        this.height = height;
        this.weight = weight;
    }



    public void setId(int a) {
        this.id = a;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }

    public void setWeight(int w) {
        this.weight = w;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getHeight() {
        return this.height;
    }
    public void print(){
        System.out.println("Id " + getId() + "\n"+"Name  " + getId()
                + "\n"+"Height " + getId() + "\n"+"Weight " + getId() + "\n");
    }
}
