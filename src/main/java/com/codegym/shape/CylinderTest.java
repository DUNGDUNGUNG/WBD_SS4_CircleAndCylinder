package com.codegym.shape;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("cylinder volume : " + cylinder.getVolume());

        Cylinder cylinder1 = new Cylinder(5.5);
        System.out.println(cylinder1);
        System.out.println("cylinder volume : " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(4.5,"blue",6.6);
        System.out.println(cylinder2);
        System.out.println("cylinder volume : " + cylinder2.getVolume());

        cylinder.setHeight(22.2);
        System.out.println("height: "+cylinder.getHeight());
    }
}
