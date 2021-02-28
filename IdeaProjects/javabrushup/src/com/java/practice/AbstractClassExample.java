package com.java.practice;

abstract class Shape {
  abstract void shape();
}

class Rectangle extends Shape {
    void shape() {
        System.out.println("Rectangle");
    };
}
    class Square extends Shape {
        void shape() {
            System.out.println("Rectangle");
        };
    }
        class Triangle extends Shape {
            void shape() {
                System.out.println("Rectangle");
            };
        }
            class Circle extends Shape {
                void shape() {
                    System.out.println("Rectangle");
                };
            }

    public class AbstractClassExample{
    public static void main(String srgs[]){
        Shape obj = new Rectangle() ;
        obj.shape();
    }
    }
