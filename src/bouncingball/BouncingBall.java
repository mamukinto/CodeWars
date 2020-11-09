package bouncingball;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if ((bounce >= 1 || bounce <= 0) || h <= 0 || window >= h) {
            return -1;
        }
        int count = 0;

        while(bounce >= window/h) {
            count += 2;
            h = h*bounce;
        }

        if (h>=window) {
            count += 1;
        }


        return count;
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(10,0.1,0.1));
    }
}
