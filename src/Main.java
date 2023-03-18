
public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> magicBox = new MagicBox<Integer>(3);
        magicBox.add(4);
        magicBox.add(2);
        magicBox.add(5);
        magicBox.add(6);
        magicBox.pick();
        Integer pick = magicBox.pick();
        System.out.println(pick);

        MagicBox<String> magicBox2 = new MagicBox<>(3);
        magicBox2.add("Kristina");
        magicBox2.add("Artem");
        magicBox2.add("Liza");
        String pick2 = magicBox2.pick();
        System.out.println(pick2);

        MagicBox<String> magicBox3 = new MagicBox<>(3);
        magicBox3.add("Kristina");
        magicBox3.add("Artem");
        magicBox3.pick();
        String pick3 = magicBox3.pick();
        System.out.println(pick3);

    }
}