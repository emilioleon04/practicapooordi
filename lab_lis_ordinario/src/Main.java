import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Desktop d1 = new Desktop("Intel", "2010", "Windows");
        Laptop l1 = new Laptop("Apple", "2025", "Apple", 10, 25);
        Notebook n1 = new Notebook("Samsung", "2010", "Samsung", 5, 10);

        ArrayList<Desktop> desktops = new ArrayList<>();
        ArrayList<Laptop> laptops = new ArrayList<>();
        ArrayList<Notebook> notebooks = new ArrayList<>();

        laptops.add(l1);
        desktops.add(d1);
        notebooks.add(n1);

        System.out.println("Modelo Marca SO  Tipo");

        for (Desktop desktop : desktops){
            System.out.println(desktop.toString());
        }

        for (Laptop laptop : laptops){
            System.out.println(laptop.toString());
        }
        
        for (Notebook notebook : notebooks){
            System.out.println(notebook.toString());
        }

        
    }
}
