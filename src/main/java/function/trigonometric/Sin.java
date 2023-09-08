package function.trigonometric;

public class Sin {

    public double calculate(double x, double eps) {
//        if (x >= 0) {
//
//            int times = (int) (x/(Math.PI * 2));
//            x -= times*Math.PI * 2;
//
//        } else if (x < 0) {
//            int times = (int) (Math.abs(x)/(Math.PI * 2));
//            x += times*Math.PI * 2;
//        }
//
//        double sin1 = x;
//        double sin2 = 0;
//        int n = 3;
//        int sign = -1;
//
//        if (x == Double.POSITIVE_INFINITY || x == Double.NEGATIVE_INFINITY || Double.isNaN(x)) {
//            return Double.NaN;
//        }
//
//        while (Math.abs(sin1 - sin2) > eps && n < 30) {
//            sin2 = sin1;
//            sin1 += sign * Math.pow(x, n) / getFactorial(n);
//            n += 2;
//            sign = sign * -1;
//        }
//
//        return sin1;
//    }
//
//    public int getFactorial(int f) {
//        if (f <= 1) {
//            return 1;
//        } else {
//            return f * getFactorial(f - 1);
//        }
//    }

        if (x == Double.NEGATIVE_INFINITY || x == Double.POSITIVE_INFINITY || Double.isNaN(x)) {
            return Double.NaN;
        }

        double fact = 1;
        double res = 0;
        double prev_res = 1;
        double sqrtx, pow;
        int sign = 1;
        int count = 1;

        if (x >= 0) {

            int times = (int) (x / (Math.PI * 2));
            x -= times * Math.PI * 2;

        } else if (x < 0) {
            int times = (int) (Math.abs(x) / (Math.PI * 2));
            x += times * Math.PI * 2;
        }
        sqrtx = x * x;
        pow = x;

        while (Math.abs(prev_res - res) > eps) {
            fact /= count;
            prev_res = res;
            res += sign * pow * fact;
            sign = -sign;
            fact /= (count + 1);
            pow *= sqrtx;
            count += 2;
        }
        if (Math.abs(res) > 1) return Double.NaN;
        if (Math.abs(res) < eps) return 0;

        return res;

    }
}
