public class Grades {
    private int[] grades;
    private int size;
    private double sum;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.sum = 0;
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
//        if (this.size != 0) {
//            return;
//        }
        sum = 0.0;
        System.out.println("debug start");
        System.out.println(this.size);
        System.out.println("debug end");
        for (int i = 0; i <= this.size; i++) {
            sum = sum + grades[this.size];

        }
        double average = sum / this.size;
        return average;
    }
}
