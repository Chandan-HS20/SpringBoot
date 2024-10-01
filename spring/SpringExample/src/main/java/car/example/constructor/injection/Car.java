package car.example.constructor.injection;

public class Car {
    Specification specification;

    public Car(Specification specification) {
        this.specification = specification;

    }
    public void displayDetails(){
        System.out.println("Specification" + specification.toString());
    }
}
