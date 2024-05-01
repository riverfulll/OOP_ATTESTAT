public class Tough {
    private final double re;
    private final double im;

    public Tough() {
        this.re = 0.0;
        this.im = 0.0;
    }
    public Tough(double re) {
        this.re = re;
        this.im = 0.0;
    }

    public Tough(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    
    public Tough plus(Tough b){
        return new Tough(this.re + b.re,this.im + b.im);
    }

    public Tough multiply(Tough b){
        double multRe = this.re * b.re - this.im * b.im;
        double mutlIm = this.re * b.im + this.im * b.re;
        return new Tough(multRe,mutlIm);
    }
    public Tough divide(Tough b){
        double divDenominator = b.re * b.re + b.im * b.im;
        double divRe =(this.re * b.re + this.im * b.im)/divDenominator;
        double divIm =(this.im * b.re - this.re * b.im)/divDenominator;
        return new Tough(divRe, divIm);
    }
    public Tough minus(Tough b){
        return new Tough(this.re - b.re,this.im - b.im);
    }

    
    public String toString() {
        if (this.im == 0) return this.re + "";
        if (this.re == 0) return this.im + "i";
        if (this.im < 0) return this.re + " - " + (-this.im) + "i";
        return this.re + " + " + this.im + "i";
    }
}