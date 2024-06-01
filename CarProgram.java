class Car {
    String name;
    String color;
    boolean isAutomatic;
    int year;

}

public class CarProgram {
    public static void main(String a[]) {
        Car c1 = new Car();
        c1.name = "Benz";
        c1.color = "blue";
        c1.isAutomatic = true;
        c1.year = 2003;

        Car c2 = new Car();
        c2.name = "Toyota";
        c2.color = "black";
        c2.isAutomatic = false;
        c2.year = 2004;

        Car c3 = new Car();
        c3.name = "Audi";
        c3.color = "red";
        c3.isAutomatic = true;
        c2.year = 2005;

        Car c4 = new Car();
        c4.name = "Jeep";
        c4.color = "white";
        c4.isAutomatic = false;
        c4.year = 2006;

        Car car[] = new Car[4];
        car[0] = c1;
        car[1] = c2;
        car[2] = c3;
        car[3] = c4;

        // for (int i = 0; i < car.length; i++) {
        // System.out.println(car[i].name + ":" + " is cool");
        // }

        // enhanced for loop
        for (Car ca : car) {
            System.out.println(ca.name + " " + "is a good car 😁");
        }

        // int nums[] = new int[4];
        // nums[0] = 1;
        // nums[1] = 2;
        // nums[2] = 3;
        // nums[3] = 4;

        // for (int n : nums) {
        // System.out.println(n);
        // }
    }
}
