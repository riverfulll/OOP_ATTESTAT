public class Calculator implements Raschet{
    private Tough resultCalculation;

    public Calculator(Tough firstArg) {
        this.resultCalculation = firstArg;
    }

    
    public Raschet sum(Tough arg) {
        this.resultCalculation = this.resultCalculation.plus(arg);
        return this;
    }
    
    public Raschet multi(Tough arg) {
        this.resultCalculation = this.resultCalculation.multiply(arg);
        return this;
    }

    public Raschet div(Tough arg) {
        this.resultCalculation = this.resultCalculation.divide(arg);
        return this;
    }

    
    public Raschet minus(Tough arg) {
        this.resultCalculation = this.resultCalculation.minus(arg);
        return this;
    }

    
    public Tough getResult() {
        return resultCalculation;
    }
}

