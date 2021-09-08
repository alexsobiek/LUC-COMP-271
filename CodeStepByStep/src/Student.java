/*
Define a class named Student. A Student object represents a university student that, for simplicity, just has a name,
ID number, and number of units earned towards graduation. Each Student object should have the following public behavior:

new Student(name, id)
Constructor that initializes a new Student object storing the given name and ID number, with 0 units.
s.getName()
s.getID()
s.getUnits()
Returns the name, ID, or unit count of the student, respectively.
s.incrementUnits(units);
Adds the given number of units to this student's unit count.
s.hasEnoughUnits()
Returns whether the student has enough units (180) to graduate.
s.toString()
Returns the student's string representation, e.g. "Nick (#42342)".
 */

public class Student {
    private final String name;
    private final int idNumber;
    private int units;
    public Student(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        units = 0;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return idNumber;
    }

    public int getUnits() {
        return units;
    }

    public void incrementUnits(int units) {
        this.units += units;
    }

    public boolean hasEnoughUnits() {
        return units >= 180;
    }

    public String toString() {
        return name + " (#" + idNumber + ")";
    }
}
