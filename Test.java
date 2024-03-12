package stack;

public class Test {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2024);
        s.push(2025);
        s.push(2026);
        s.print();
        System.out.println(" | Максимум: " + s.max() + " | Минимум: " + s.min());
        s.pop();
        s.pop();
        s.pop();
        s.push(2023);
        s.push(2022);
        s.push(2021);
        s.push(2020);
        s.print();
        System.out.println(" | Максимум: " + s.max() + " | Минимум: " + s.min());
    }
}
