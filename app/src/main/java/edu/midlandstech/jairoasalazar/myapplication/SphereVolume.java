package edu.midlandstech.jairoasalazar.myapplication;

public class SphereVolume {
    private double radius;
    static float pi = 3.14159f;

    public SphereVolume(double radius) {
        radius = radius;
    }
    public void set(double radius){
        this.radius = radius;
    }
        public double solution() {
           double volume;
           return volume = (4*22*radius*radius*radius)/(3*7);
        }
    }


