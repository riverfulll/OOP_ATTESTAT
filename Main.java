public class Main {
    public static void main(String[] args) {
        IRaschetFactory RaschetFactory = new LogRaschetFactory(new FileLogger());
        WiewCalculator view = new WiewCalculator(RaschetFactory);
        view.run();
    }
}