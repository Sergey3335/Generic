import java.util.Random;

public class MagicBox<T> {
    Object[] memory;
    Object size;

    public MagicBox(int size) {
        this.size = size;
        this.memory = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] == null) {
                memory[i] = item;
                return true;
            }
        }
        System.out.println("Свободного места нет");
        return false;
    }

    public T pick() {
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] == null) {
                throw new RuntimeException(String.format("Коробка не полна, осталось заполнить %s ячеек ", memory.length - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(memory.length);

        return (T) memory[randomInt];
    }
}



