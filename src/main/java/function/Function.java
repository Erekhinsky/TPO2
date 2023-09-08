package function;

import function.logarithmic.Ln;
import function.logarithmic.Log;
import function.trigonometric.*;

public class Function {

    Sin sin;
    Cos cos;
    Tan tan;
    Cot cot;
    Sec sec;
    Csc csc;

    Ln ln;
    Log log;

    public Function() {
        this.sin = new Sin();
        this.cos = new Cos();
        this.tan = new Tan();
        this.cot = new Cot();
        this.sec = new Sec();
        this.csc = new Csc();

        this.ln = new Ln();
        this.log = new Log();
    }

    public Function(Sin sinF, Cos cosF, Tan tanF, Cot cotF, Sec secF, Csc cscF,
                    Ln lnF, Log logF) {
        this.sin = sinF;
        this.cos = cosF;
        this.tan = tanF;
        this.cot = cotF;
        this.sec = secF;
        this.csc = cscF;

        this.ln = lnF;
        this.log = logF;
    }

    public double calculate(double x, double eps) {
        double result;

        if (x <= 0) {

            result = ((((((Math.pow(Math.pow((Math.pow((Math.pow(((Math.pow(Math.pow(((((((((csc.calculate(x, eps)
                    - csc.calculate(x, eps)) + sin.calculate(x, eps)) * cos.calculate(x, eps)) + tan.calculate(x, eps)) / sin.calculate(x, eps))
                    - cot.calculate(x, eps)) + (cos.calculate(x, eps) + sin.calculate(x, eps))) - (cot.calculate(x, eps)
                    + sin.calculate(x, eps))), 2), 3) - (sin.calculate(x, eps) - sin.calculate(x, eps)))
                    / (Math.pow((((Math.pow(cot.calculate(x, eps), 2) * sec.calculate(x, eps)) * cos.calculate(x, eps))
                    / ((csc.calculate(x, eps) + tan.calculate(x, eps)) * cot.calculate(x, eps))), 2) * sec.calculate(x, eps))), 2)
                    / cot.calculate(x, eps)), 2) * cot.calculate(x, eps)), 2), 3) * sec.calculate(x, eps)) / (tan.calculate(x, eps)
                    + cos.calculate(x, eps))) / (((sin.calculate(x, eps) + Math.pow((cot.calculate(x, eps) / cos.calculate(x, eps)), 2))
                    - cos.calculate(x, eps)) * (sin.calculate(x, eps) / ((((((sec.calculate(x, eps) * (cos.calculate(x, eps)
                    + Math.pow((cot.calculate(x, eps) * sin.calculate(x, eps)), 2))) / ((tan.calculate(x, eps) - sin.calculate(x, eps))
                    - tan.calculate(x, eps))) + ((tan.calculate(x, eps) * cos.calculate(x, eps)) + sin.calculate(x, eps)))
                    * cot.calculate(x, eps)) + (cos.calculate(x, eps) * cos.calculate(x, eps))) / (sin.calculate(x, eps)
                    - (Math.pow(((((((sec.calculate(x, eps) - Math.pow(tan.calculate(x, eps), 2)) - cot.calculate(x, eps))
                    - ((((tan.calculate(x, eps) - (csc.calculate(x, eps) * cot.calculate(x, eps))) - csc.calculate(x, eps))
                    / sec.calculate(x, eps)) / cos.calculate(x, eps))) - ((cos.calculate(x, eps) * sec.calculate(x, eps)) + (tan.calculate(x, eps)
                    - tan.calculate(x, eps)))) / tan.calculate(x, eps)) + Math.pow(Math.pow(sin.calculate(x, eps), 2), 3)), 2)
                    - cos.calculate(x, eps))))))) / Math.pow(sin.calculate(x, eps), 3)) * sec.calculate(x, eps))
                    - ((((((Math.pow((Math.pow(csc.calculate(x, eps), 2) - ((sec.calculate(x, eps) - (sec.calculate(x, eps)
                    + sin.calculate(x, eps))) + sec.calculate(x, eps))), 2) - (Math.pow((cot.calculate(x, eps) / csc.calculate(x, eps)), 3)
                    / csc.calculate(x, eps))) + (((tan.calculate(x, eps) - ((csc.calculate(x, eps) - tan.calculate(x, eps)) - cos.calculate(x, eps)))
                    + csc.calculate(x, eps)) * Math.pow(((sec.calculate(x, eps) / ((csc.calculate(x, eps) / csc.calculate(x, eps))
                    - (Math.pow(cot.calculate(x, eps), 2) * cos.calculate(x, eps)))) + cos.calculate(x, eps)), 3)))
                    / Math.pow((((sec.calculate(x, eps) * (Math.pow(sin.calculate(x, eps), 2) * (Math.pow(cot.calculate(x, eps), 2)
                    / (sec.calculate(x, eps) + (tan.calculate(x, eps) / sec.calculate(x, eps)))))) - Math.pow(sec.calculate(x, eps), 2))
                    - Math.pow((sec.calculate(x, eps) - (tan.calculate(x, eps) / csc.calculate(x, eps))), 2)), 3))
                    / Math.pow(Math.pow(Math.pow(Math.pow(Math.pow(Math.pow(cot.calculate(x, eps), 2), 2), 2), 2), 3), 2))
                    - csc.calculate(x, eps)) - ((cos.calculate(x, eps) * sin.calculate(x, eps)) - (((csc.calculate(x, eps)
                    - sin.calculate(x, eps)) + (sin.calculate(x, eps) / (Math.pow(cot.calculate(x, eps), 3)
                    - ((((Math.pow(((cot.calculate(x, eps) - (cos.calculate(x, eps) * tan.calculate(x, eps))) - cot.calculate(x, eps)), 2)
                    / ((Math.pow((sin.calculate(x, eps) + sec.calculate(x, eps)), 3) - sec.calculate(x, eps)) * csc.calculate(x, eps)))
                    - sin.calculate(x, eps)) * ((Math.pow(sec.calculate(x, eps), 2) / sin.calculate(x, eps)) * (csc.calculate(x, eps)
                    - ((cos.calculate(x, eps) * sec.calculate(x, eps)) * sin.calculate(x, eps))))) * Math.pow(((csc.calculate(x, eps)
                    + (tan.calculate(x, eps) * ((sin.calculate(x, eps) + cos.calculate(x, eps)) / tan.calculate(x, eps))))
                    + (sec.calculate(x, eps) + (csc.calculate(x, eps) + (sec.calculate(x, eps)
                    - Math.pow(cot.calculate(x, eps), 2))))), 2))))) - cos.calculate(x, eps)))));

        } else {

            result = (Math.pow((((log.calculate(2, x, eps) + log.calculate(2, x, eps)) + log.calculate(2, x, eps))
                    - log.calculate(10, x, eps)), 3) - (log.calculate(3, x, eps) / (ln.calculate(x, eps)
                    - log.calculate(5, x, eps))));

        }

        return result;
    }

}
