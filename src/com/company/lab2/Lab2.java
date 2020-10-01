package com.company.lab2;

public class Lab2 {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(2 );
        Box box3 = new Box(4,5,3);

        System.out.println("First Box\t  " + "height: " + box1.getHeight() + "\twidth: " + box1.getWidth() + "\tlength: " + box1.getLength());
        System.out.println("Second Box\t " + "height: " + box2.getHeight() + "\twidth: " + box2.getWidth() + "\tlength: " + box2.getLength());
        System.out.println("Third Box\t  " + "height: " + box3.getHeight() + "\twidth: " + box3.getWidth() + "\tlength: " + box3.getLength());

        System.out.println("----------------------------");

        System.out.println("The surface area of box1 is:\t" + box1.surfaceArea(box1.getHeight(),box1.getWidth(),box1.getLength()));
        System.out.println("The surface area of box2 is:\t" + box2.surfaceArea(box2.getHeight(),box2.getWidth(),box2.getLength()));
        System.out.println("The surface area of box3 is:\t" + box3.surfaceArea(box3.getHeight(),box3.getWidth(),box3.getLength()));

        System.out.println("----------------------------");

        System.out.println("The Volume of box1 is:\t" + box1.Volume(box1.getHeight(),box1.getWidth(),box1.getLength()));
        System.out.println("The Volume of box2 is:\t" + box2.Volume(box2.getHeight(),box2.getWidth(),box2.getLength()));
        System.out.println("The Volume of box2 is:\t" + box3.Volume(box3.getHeight(),box3.getWidth(),box3.getLength()));

        System.out.println("----------------------------");

        Queue queue2 = new Queue(5);
        Queue queue1 = new Queue();

        queue1.pushElement(4);
        queue1.pushElement(5);
        queue1.pushElement(7);
        System.out.println("Last element is: " + queue1.getLastElement());
        queue1.popElement();

        System.out.println("----------------------------");

        queue2.pushElement(3);
        queue2.pushElement(9);
        queue2.pushElement(11);
        System.out.println("Last element is: " + queue2.getLastElement());
        queue2.popElement();

        System.out.println("----------------------------");


    }
}
