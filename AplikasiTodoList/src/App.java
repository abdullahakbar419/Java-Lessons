
public class App {

    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) throws Exception {
        viewShowTodoList();
    }

    /**
     * Menampilikan Todo ke List
     */
    public static void showTodoList() {
        System.out.println("TODOLIST");
        for (int i = 0; i < model.length; i++) {
            String todo = model[i];
            int no = i + 1;
            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar";
        showTodoList();
    }

    /**
     * Menambahkan Todo ke List
     */
    public static void addTodoList(String todo) {
        boolean isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                isFull = false;
                break;
            }
        }

        if (isFull) {
            String[] temp = model;
            model = new String[2 * model.length]; // meningkatkan ukuran array
            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
            model[temp.length + 1] = todo;
        }
    }

    public static void testAddTodoList() {
        for (int i = 0; i < 19; i++) {
            addTodoList("Contoh Todo Ke." + i);
        }
        showTodoList();
    }

    /**
     * Menghapus Todo dari List
     */
    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            model[number - 1] = null;
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        boolean result = removeTodoList(20);
        System.out.println(result); // FALSE, karena nomor tidak valid
        result = removeTodoList(4);
        System.out.println(result); // FALSE, karena nomor tidak valid
        result = removeTodoList(2);
        System.out.println(result); // TRUE, karena nomer valid
    }

    /**
     * Memasukan Input Todo ke List
     * 
     * @param todo
     * @return String data
     */
    public static String input(String todo) {
        System.out.print(todo + ": ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        String todo = input("Todo");
        System.out.println(todo);
    }

    /**
     * Menampilkan View Todo List
     */
    public static void viewShowTodoList() {
        while (true) {
            showTodoList();

            System.out.println("MENU :");
            System.out.println("1. Tambah Todo");
            System.out.println("2. Hapus Todo");
            System.out.println("3. Keluar");

            String input = input("Pilih");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("3")) {
                break;
            } else {
                System.out.println("Perintah Tidak Dikenali!");
            }
        }
    }

    public static void testViewShowTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        viewShowTodoList();
    }

    /**
     * Menampilkan View Add Todo List
     */
    public static void viewAddTodoList() {
        System.out.println("Menambahkan todo list baru...");
        String todo = input("Masukkan Todo (x jika batalkan)");

        if (todo.equals("x")) {

        } else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        viewAddTodoList();
        showTodoList();
    }

    /**
     * Menampilkan View Remove Todo List
     */
    public static void viewRemoveTodoList() {
        System.out.println("Menghapus todo list...");
        String todo = input("Masukkan Nomer Todo yang ingin dihapus! (x jika batalkan)");
        if (todo.equals("x")) {
        } else {
            boolean result = removeTodoList(Integer.valueOf(todo));
            if (!result) {
                System.out.println("Gagal Menghapus Todo : " + todo);
            }
        }
    }

    public static void testViewRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");

        showTodoList();
        viewRemoveTodoList();
        showTodoList();
    }
}
