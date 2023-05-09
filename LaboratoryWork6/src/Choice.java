import figures.Ball;
import figures.Cylinder;
import figures.Pyramid;
import figures.Shape;
import figures.SolidOfRevolution;
import library.LibraryCard;

public class Choice {
        public Choice(String arg) {
            Run(arg);
        }
    
        public  void Run(String task) {
            switch (task) {
                case "1":
                    Person person = new Person("Andrii",19);
                    person.Move();
                    person.Talk();
                    break;
                case "2":
                    Phone phone = new Phone();
                    phone.receiveCall("Andrii");
                    phone.receiveCall("Andrii","112324332");
                    phone.SendMessage("Andrii",new String[]{"apple", "banana", "orange"});
                    break;
                case "3":
                Shape shape;
                SolidOfRevolution solid = new SolidOfRevolution();
                Cylinder cylinder = new Cylinder();
                Ball ball = new Ball();
                Pyramid pyramid = new Pyramid();
                
                System.out.println("Printing solid...");
                System.out.println(solid);
                
                shape = solid;
                System.out.println("Printing shape...");
                System.out.println(shape);
                
                shape = cylinder;
                System.out.println("Printing shape...");
                System.out.println(shape);
                
                shape = ball;
                System.out.println("Printing shape...");
                System.out.println(shape);
                
                shape = pyramid;
                System.out.println("Printing shape...");
                System.out.println(shape);
                
                solid = cylinder;
                System.out.println("Printing solid...");
                System.out.println(solid);
                
                solid = ball;
                System.out.println("Printing solid...");
                System.out.println(solid);
                
                    break;
                case "4":
                    Sedan sedan = new Sedan();
                    sedan.Init();
                    break;
                case "5":
                    LibraryCard card = new LibraryCard();
                    card.Run();
                    break;
                default:
                    System.out.println("The current task doesnt exist!");
            }
        
    
        }
    
    }

