public class lab1 {
    static void myMethod() {
        System.out.println("Md.Ahsan Sarker");
    }

    static void myMethod(String name) {
        System.out.println(name);
    }

    static void myMethod(String name, String id) {
        System.out.println(name + "    " + id);
    }

    static void myMethod(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i = 0; i <= array.length; ++i) {
            if (i != 6 && i != 7) {
                if (i == 9) {
                    break;
                }

                sum += array[i];
                System.out.println("sum=" + sum);
            }
        }

        myMethod();
        myMethod("big boss");
        myMethod(5, 5);
    }
}
