package me.learn.DesignPattern.Structural.Flyweight;

import me.learn.DesignPattern.utils.Util;

import java.util.HashMap;
import java.util.Map;

public class BodyFactory {

    public static final int TYPE_MOON = 1;
    public static final int TYPE_STAR = 2;

    private Map<Integer, Body> sharingBodies;

    public BodyFactory() {
        sharingBodies = new HashMap<Integer, Body>();
    }

    public Body getBody(int type) {
        Body body = null;

        switch (type) {
            case TYPE_MOON:
                body = new Moon();
                Util.show(body, "created");
                break;

            case TYPE_STAR:

                if (sharingBodies.get(type) == null) {
                    body = new Star();
                    sharingBodies.put(type, body);
                    Util.show(body, "created");
                } else {
                    body = sharingBodies.get(type);
                }

                break;
        }

        Util.show(body, "got");

        return body;
    }

}
