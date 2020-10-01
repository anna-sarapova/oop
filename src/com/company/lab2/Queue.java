package com.company.lab2;
import java.util.ArrayList;

// Data Structure
public class Queue {
    ArrayList<Integer> objects = new ArrayList<>();
    private int length; //maximum capacity of the queue
    private boolean hasLimitation;

    public Queue(){
       hasLimitation = false;
    }

    public Queue(int length){
        this.length = length;
        hasLimitation = true;
    }

    public void pushElement(int item){
        if (hasLimitation && isFull()) {
            System.out.println("Queue full");
        } else {
            objects.add(item);
        }
    }

    public void popElement(){
        if (objects.size() == 0){
            System.out.println("Nothing to remove, cowboy");
        } else {
            objects.remove(0);
        }
    }

    public void printLength() {
        if(hasLimitation) {
            System.out.println("The length is: " + length);
        } else {
            System.out.println("Queue has no limitations");
        }
    }

    // function to check if the queue is full or not
    public Boolean isFull(){
        if(hasLimitation) {
            return (length == objects.size());
        } else {
            return false;
        }
    }

    // function to check if the queue is empty or not
    public Boolean isEmpty() {
        return length == 0;
    }

    public Integer getLastElement() {
        return objects.get(objects.size() - 1);
    }

    public void printQueue() {
        for (Integer integer: objects) {
            System.out.print(integer);
        }
    }
}
