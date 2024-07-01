package conditionalsLoops;

public class Volumes {
    public static void main(String[] args) {

        float pie = 3.14f;


        //Volume Of Cone

        int radius = 10;
        int height = 20;

        double volumeOfCone = (1.0 / 3) * pie * Math.pow(radius, 2) * height;

        System.out.println(volumeOfCone);


        //Volume Of Prism

        int areOfBase = 10;
        int heightOfPrism = 20;

        double volumeOfPrism = areOfBase * heightOfPrism;

        System.out.println(volumeOfPrism);


        //Volume Of Cylinder


        int heightOfCylinder = 10;
        int radiusOfCylinder = 20;

        double volumeOfCylinder = pie * radiusOfCylinder + heightOfCylinder;

        System.out.println(volumeOfCylinder);


        //Volume Of Sphere

        int radiusOfSphere = 10;
        double volumeOfSphere = (4.0 / 3) * pie * Math.pow(radiusOfSphere, 3);

        System.out.println(volumeOfSphere);

        //Volume Of Pyramid


        int areOfBaseOfPyramid = 200;
        int heightOfPyramid = 103;

        double volumeOfPyramid = (1.0 / 3) * areOfBaseOfPyramid * heightOfPyramid;

        System.out.println(volumeOfPyramid);

    }

}
