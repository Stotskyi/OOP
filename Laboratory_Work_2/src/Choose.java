import Tasks.Calculator;
import Tasks.CheckNumbers;
import Tasks.FindX;
import Tasks.Quadrant;
import Tasks.QuadraticEquation;

public class Choose {
    private final String task;
    public Choose(String arg) {
        task = arg;
    }


    public void Run() {
        switch (task) {
            case "Task1":
            QuadraticEquation obj = new QuadraticEquation();
            obj.Launch();
                break;
            case "Task2":
            Quadrant ob = new Quadrant();
            ob.Launch();
                break;
            case "Task3":
            CheckNumbers num = new CheckNumbers();
            num.Launch();
                break;
            case "Task4":
            FindX x = new FindX();
            x.Launch();
                break;
            case "Task5":
            Calculator calc = new Calculator();
            calc.Launch();
                break;
            default:
                System.out.println("The current task doesnt exist!");
        }
    }   

    }

