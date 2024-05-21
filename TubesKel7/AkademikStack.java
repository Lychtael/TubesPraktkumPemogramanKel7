package TubesKel7;

import java.util.Scanner;

public class AkademikStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambahkan tugas");
            System.out.println("2. Selesaikan tugas terakhir");
            System.out.println("3. Lihat tugas terakhir");
            System.out.println("4. Tampilkan semua tugas");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama tugas: ");
                    String task = scanner.nextLine();
                    stack.push(task);
                    break;
                case 2:
                    String completedTask = stack.pop();
                    if (completedTask != null) {
                        System.out.println("Tugas \"" + completedTask + "\" telah diselesaikan dan dihapus dari daftar.");
                    }
                    break;
                case 3:
                    String lastTask = stack.peek();
                    if (lastTask != null) {
                        System.out.println("Tugas terakhir yang harus diselesaikan: \"" + lastTask + "\"");
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}
