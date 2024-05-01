import java.util.Scanner;

public class WiewCalculator {
    private final Scanner iScanner = new Scanner(System.in);
    private IRaschetFactory RaschetFactory;

    public WiewCalculator(IRaschetFactory RaschetFactory) {
        this.RaschetFactory = RaschetFactory;
    }

    public void run(){
        while (true){
            Tough firstArg = promptTough("Введите пеpвое число: ");
            Raschet calculator = RaschetFactory.create(firstArg);
            
            while (true){
                String cmd = prompt("Введите команду (+, *, :, -, =): ");
                
                if (cmd.equals("+")){
                    Tough arg = promptTough("Введите втоpое число: ");
                    calculator.sum(arg);
                    continue;
                }
                
                if (cmd.equals("*")){
                    Tough arg = promptTough("Введите втоpое число: ");
                    calculator.multi(arg);
                    continue;
                }
                
                if (cmd.equals(":")){
                    Tough arg = promptTough("Введите втоpое число: ");
                    calculator.div(arg);
                    continue;
                }
                
                if (cmd.equals("-")){
                    Tough arg = promptTough("Введите втоpое число: ");
                    calculator.minus(arg);
                    continue;
                }
                
                if (cmd.equals("=")){
                    System.out.printf("Pезультат %s\n", calculator.getResult());
                    break;
                }
            }
            String cmd = prompt("Посчитать ещё? (y/n) ");
            
            if (cmd.equals("n")){
                break;
            }
        }
    }
    
    private String prompt(String msg){
        System.out.print(msg);
        return iScanner.nextLine();
    }
    
    private double promptDouble(String msg){
        System.out.print(msg);
        return Double.parseDouble(iScanner.nextLine());
    }
    
    private Tough promptTough(String msg){
        System.out.println(msg);
        double inputRe = promptDouble("Введите вещественную часть: ");
        double inputIm = promptDouble("Введите мнимую часть: ");
        return new Tough(inputRe, inputIm);
    }
}
