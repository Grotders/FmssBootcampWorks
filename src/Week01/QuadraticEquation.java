package Week01;

public class QuadraticEquation {

    // a(x^2) * bx + c
    private final int a;
    private final int b;
    private final int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }


    /*
             delta(△) = (b^2) - 4ac
                    △ > 0   ->  two distinct real root  (x1 ≠ x2)
                    △ = 0   ->  two same real root      (x1 = x2)
                    △ < 0   ->  no real root
    */
    public void rootFinder() {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append("(x^2) + ").append(b).append("x + ").append(c).append("\n");
        int delta = delta();
        double roots[] = bhaskaraFormula();

        if (delta > 0) {
            sb.append("△: ").append(delta).append("  -->  ").append("△ > 0  \ttwo distinct real root  (x1 ≠ x2)\n");
        } else if (delta == 0){
            sb.append("△: ").append(delta).append("  -->  ").append("△ = 0  \ttwo same real root      (x1 = x2)\n");
        } else {
            sb.append("△: ").append(delta).append("  -->  ").append("△ < 0  \tno real root\n");
        }
        sb.append("\nroot 1: ").append(roots[0]);
        sb.append("\nroot 2: ").append(roots[1]);

        System.out.println(sb.append("\n"));
    }

    // delta(△) = (b^2) - 4ac
    public int delta() {
        int delta = (b * b) - (4 * a * c);

        return delta;
    }

    /* bhaskara formula:

             -b + √(delta)          -b - √(delta)
         ---------------------, ---------------------
                 2 * a                  2 * a

     */
    public double[] bhaskaraFormula() {
        double roots[] = new double[2];

        roots[0] = ( -1 * b + Math.sqrt(delta())) / 2 * a;
        roots[1] = ( -1 * b - Math.sqrt(delta())) / 2 * a;

        return roots;
    }
}
