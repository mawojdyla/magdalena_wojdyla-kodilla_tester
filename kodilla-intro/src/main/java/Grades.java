public class Grades {
    private int[] grades;
    private int size;
    private double sum;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.sum = 0.0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastAdded() {
        if (this.size == 0) {
            return -1;
        }
        return this.grades[this.size - 1];
    }

    public double average() {
        if (this.size == 0) {
            return 0;
        }
        sum = 0.0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + grades[i];
        }
        return sum / this.size;
    }

    public static void main(String[] args) {
        Grades myGrades = new Grades();
        myGrades.add(8);
        myGrades.add(6);
        myGrades.add(3);
        System.out.println("Last added grade: " + myGrades.lastAdded());
        System.out.println("Average: " + myGrades.average());
    }
}


//  this.grades[this.size] = value;
//  this.size++;
//Użycie this.size jako indeksu oznacza,
// że nowa ocena value zostanie dodana
// na pierwsze wolne miejsce w tablicy grades.
// Jeśli size wynosi 0, nowa ocena zostanie dodana na miejsce 0.
// Jeśli size wynosi 1, nowa ocena zostanie dodana na miejsce 1 i tak dalej.