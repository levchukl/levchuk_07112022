package hW_3;


public class homeWork_3 {
    public static void main(String[] args) {
        //first triangle
        double a = 1;
        double b = 5;
        double g = Math.sqrt(a*a+b*b);
        double square1 = 0.5*a*b;

        //second triangle
        double c = 10;
        double f = Math.sqrt(g*g+c*c);
        double square2 = 0.5*g*c;

        //third triangle
        double d = 5;
        double e = 11;
        double p = (d + e + f) / 2;
        double square3 = Math.sqrt(p * (p - d) * (p - e) * (p - f));

        double result = square1 + square2 + square3;

        System.out.println("g = "+g);
        System.out.println("sq1 = "+square1);
        System.out.println("f = "+f);
        System.out.println("sq2 = "+square2);
        System.out.println("p = "+p);
        System.out.println("sq3 = "+square3);

        System.out.println("Final result: " +result);

    }


}
