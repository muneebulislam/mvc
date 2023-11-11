package com.example.mvc;

import java.util.ArrayList;
import java.util.concurrent.Flow;

public class BoxModel {
    // A list of boxes stored in the model
    private ArrayList<Box> boxes;
    private ArrayList<Subscriber> subs;

    public BoxModel() {
        boxes = new ArrayList<>();
        subs = new ArrayList<>();
    }

    public void addBox(Box box){
        boxes.add(box);
    }

    public void addSubscriber(Subscriber sub){
        subs.add(sub);
    }

}