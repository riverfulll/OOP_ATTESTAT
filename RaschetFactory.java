public class RaschetFactory implements IRaschetFactory{
    public Raschet create(Tough firstArg){
        return new Calculator(firstArg);
    }
}
