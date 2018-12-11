import CirleAndCylinder.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder1 = new Cylinder(9.25, "green", 16.11);
        System.out.println(cylinder1);
    }
}
