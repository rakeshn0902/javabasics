public class Employee {
    String name;
    String designation;
    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    void calcBonus(double basicAllowance) {
        System.out.println("He is a programmer and his salary is: " + basicAllowance);
    };
    void calcBonus(double basicAllowance, double carAllowance) {
        System.out.println("He is Manager and his salary is: " + (basicAllowance + carAllowance));
    };
    void calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
        System.out.println("He is Director and his salary is: " + (basicAllowance + carAllowance + houseAllowance));
    };
}
