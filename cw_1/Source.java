public class Source {

    public static void main(String[] args) {
        Point x;
        x = new Point((double) 0);
        System.out.println("should be [0]:");
        System.out.println("x = " + x);

        x = new Point(1, 2, 3.);
        System.out.println("should be [1.0,2.0,3.0]:");
        System.out.println("x = " + x);

        x = new Point(null);
        System.out.println("should be [null]:");
        System.out.println("x = " + x);
        System.out.println("should be [1.0,null,4.0,5.0]:");
        x = new Point(1., null, 4., 5.);
        System.out.println("x = " + x);

        Point x1 = new Point(null, 1, 2);
        Point x2 = new Point(null, 1);
        System.out.println("should be [null,1.0,2.0]:");
        System.out.println("x1 = " + x1);
        System.out.println("should be [null,1.0]:");
        System.out.println("x2 = " + x2);
        x = new Point(x1, x2);
        System.out.println("x = " + x);
        x = new Point(x1, 4., 5.);
        System.out.println("x = " + x);
    }
}
