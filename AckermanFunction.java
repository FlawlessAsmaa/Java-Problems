package ackermanfunction;

public class AckermanFunction {

    public static void main(String[] args) {
        System.out.println("A(0, 0) = " + ack(0, 0));
        System.out.println("A(0, 1) = " + ack(0, 1));
        System.out.println("A(1, 0) = " + ack(1, 0));
        System.out.println("A(1, 1) = " + ack(1, 1));
        System.out.println("A(2, 1) = " + ack(2, 1));
        System.out.println("A(2, 2) = " + ack(2, 2));
        System.out.println("A(3, 0) = " + ack(3, 0));
        System.out.println("A(3, 1) = " + ack(3, 1));
        System.out.println("A(3, 2) = " + ack(3, 2));
    }

    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n - 1));
        }
        return 0;
    }
}
