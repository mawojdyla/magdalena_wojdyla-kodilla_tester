public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1200, 2024);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook(2000, 2500, 2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook(1200, 899, 2015);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();

    }
}


