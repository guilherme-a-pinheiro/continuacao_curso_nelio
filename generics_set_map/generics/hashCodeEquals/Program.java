package generics_set_map.generics.hashCodeEquals;

public class Program {
    public static void main(String[] args) {
        Client cl1 = new Client("Gui", "gui@teste.com");
        Client cl2 = new Client("Gui", "gui@teste.com");
        Client cl3 = new Client("Gui", "g@teste.com");
        Client cl4 = new Client("Guilherme", "g@teste.com");

        System.out.println(cl1.hashCode());
        System.out.println(cl1.hashCode());
        System.out.println(cl1.equals(cl2));
        System.out.println(cl1 == cl2);
    }

}
