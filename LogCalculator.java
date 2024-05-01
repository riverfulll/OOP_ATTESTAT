public class LogCalculator implements Raschet {
    private final Raschet oldCalc;
    private final Loggbl logger;

    public LogCalculator(Raschet oldCalc, Loggbl logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    public Raschet sum(Tough arg) {
        Tough firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода sum с параметром %s", firstArg, arg));
        Raschet result = oldCalc.sum(arg);
        logger.log("Вызов метода sum произошел.");
        return result;
    }

    public Raschet multi(Tough arg) {
        Tough firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода multi с параметром %s", firstArg, arg));
        Raschet result = oldCalc.multi(arg);
        logger.log("Вызов метода multi произошел.");
        return result;
    }

    public Raschet div(Tough arg) {
        Tough firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода div с параметром %s", firstArg, arg));
        Raschet result = oldCalc.div(arg);
        logger.log("Вызов метода div произошел.");
        return result;
    }

    public Raschet minus(Tough arg) {
        Tough firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода minus с параметром %s", firstArg, arg));
        Raschet result = oldCalc.minus(arg);
        logger.log("Вызов метода minus произошел.");
        return result;
    }

    public Tough getResult() {
        Tough result = oldCalc.getResult();
        logger.log(String.format("Получение результата %s", result));
        return result;
    }
}
