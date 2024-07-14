import static java.lang.System.out;

public class Employee {
    private String name;
    private String jobTitle;

    public void setName(String nameIn) {
        name = nameIn;
    }

    public String getName() {
        return name;
    }

    public void setJobTitle(String jobTitleIn) {
        jobTitle = jobTitleIn;

    }

    public void cutCheck(double amountPaid) {
        out.printf("Wypłać wynagrodzenie dla", name);
        out.printf(jobTitle);
        out.printf(String.valueOf(amountPaid));
    }
}