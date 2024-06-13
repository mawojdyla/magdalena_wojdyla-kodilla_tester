public class LeapYear {

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        int year = 2021;
        if (isLeapYear(year)) {
            System.out.println(year + " jest rokiem przestępnym.");
        } else {
            System.out.println(year + " nie jest rokiem przestępnym.");
        }
    }
}
