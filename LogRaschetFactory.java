public class LogRaschetFactory implements IRaschetFactory{
    private final Loggbl logger;

    public LogRaschetFactory(Loggbl logger) {
        this.logger = logger;
    }
    
    public Raschet create(Tough firstArg) {
        return new LogCalculator(new Calculator(firstArg), this.logger);
    }
}