// OBJ01-J: Limit accessibility of fields
public class R05_OBJ01_J {
    static class Widget {
        public int total;

        void add() {
            if (total < Integer.MAX_VALUE) {
                total++;
            } else {
                throw new ArithmeticException("Overflow");
            }
        }
    }

    public static void main(String[] args) {
        Widget w = new Widget();
        w.add();
        w.total = -500;
        System.out.println("Widget total: " + w.total);
    }
}
