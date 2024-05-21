package TubesKel7;

import java.util.LinkedList;

public class Stack {
    private LinkedList<String> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(String item) {
        stack.addLast(item);
        System.out.println("Tugas \"" + item + "\" telah ditambahkan ke dalam daftar tugas.");
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Daftar tugas kosong, tidak ada tugas yang dapat dihapus.");
            return null;
        }
        return stack.removeLast();
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Daftar tugas kosong, tidak ada tugas yang dapat dilihat.");
            return null;
        }
        return stack.getLast();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Daftar tugas kosong.");
        } else {
            System.out.println("Daftar tugas saat ini:");
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.println(stack.get(i));
            }
        }
    }
}
