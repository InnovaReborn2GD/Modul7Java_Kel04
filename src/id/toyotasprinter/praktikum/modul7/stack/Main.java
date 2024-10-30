package id.toyotasprinter.praktikum.modul7.stack;

public class Main {
    public static void main(String[] args) {
        Stack tumpukan = new Stack(5);

        System.out.println("---------------tes-push-data---------------");
        tumpukan.push(1);
        tumpukan.push("dua");
        tumpukan.push("tiga");
        tumpukan.push(4.0f);
        tumpukan.printStack();
        System.out.println("\n---------------------------------------------\n\n");

        System.out.println("----------------tes-pop-data---------------");
        tumpukan.pop();
        tumpukan.printStack();
        tumpukan.pop();
        tumpukan.printStack();
        System.out.println("\n---------------------------------------------\n\n");

        System.out.println("---------------tes-peek-data---------------");
        tumpukan.peek();
        tumpukan.printStack();
        System.out.println("\n---------------------------------------------\n\n");

        System.out.println("---------------tes-lain-lain---------------");
        tumpukan.count();
        tumpukan.clear();
        tumpukan.printStack();
        System.out.println("\n---------------------------------------------\n\n");
    }
}