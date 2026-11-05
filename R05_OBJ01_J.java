// OBJ01-J: Limit accessibility of fields
public class R05_OBJ01_J {
    static class Widget {
        private int total;

        public int getTotal() {
            return total;
        }

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
        System.out.println("Widget total: " + w.getTotal());
    }
}
