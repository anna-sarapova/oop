package com.company.lab8;

import java.util.ArrayList;

public class Main_8 {
    public static void main(String[] args) {

        Cube cube = new Cube(1);
        Sphere sphere = new Sphere(3);
        Parallelepiped parallelepiped = new Parallelepiped(2,2,3);

        ArrayList<GeometricBody> geometricBodies = new ArrayList<GeometricBody>();

        geometricBodies.add(0,cube);
        geometricBodies.add(1,sphere);
        geometricBodies.add(2,parallelepiped);

        GeometricBodyController maxBody = new GeometricBodyController();
        System.out.println("The biggest surface has " + maxBody.maxSurfaceController(geometricBodies).name());
        System.out.println("The biggest volume has " + maxBody.maxVolumeController(geometricBodies).name());
    }
}
