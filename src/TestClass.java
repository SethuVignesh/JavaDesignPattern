import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.Color;
import AbstractFactoryPattern.FactoryProducer;
import AdapterPattern.AudioPlayer;
import DecoratorPattern.Circle;
import DecoratorPattern.Rectangle;
import DecoratorPattern.RedShapeDecorator;
import Factory.Shape;
import Factory.ShapeFactory;
import FilterPattern.*;
import IteratorePattern.Iterator;
import IteratorePattern.NameRepository;
import MediatorPattern.User;
import NullObjectPattern.AbstractCustomer;
import NullObjectPattern.CustomerFactory;
import Prototype.ShapeCache;
import ProxyPattern.Image;
import ProxyPattern.ProxyImage;
import SingletonDesignPattern.SingletonClass;
import StatePattern.Context;
import StatePattern.StartState;
import StatePattern.StopState;
import TemplateMethod.Cricket;
import TemplateMethod.FootBall;
import TemplateMethod.Game;

import java.util.ArrayList;
import java.util.List;

//import DecoratorPattern.Circle;
//import DecoratorPattern.Reactangle;
//import DecoratorPattern.RedShapeDecorator;

/**
 * Created by sethugayu on 8/5/16.
 */
public class TestClass {
    public static void main(String[] args) {

        SingletonDesignPatternDemo();
        AdapterDesignPatternDemo();
        FactoryPatternDemo();
        AbstractFactoryDemo();
        PrototypeDemo();
        ProxyDesignPattern();
        NullPattern();
        decoratorPattern();
        mediatorPattern();
        iteratorPattern();
        statePattern();
        decoratorPattern();
        filterPattern();
        templatePattern();
    }

    private static void templatePattern() {
        System.out.println("\n------Template Pattern------ ");


        Game game= new Cricket();
        game.play();
        System.out.println("");


        game= new FootBall();
        game.play();
    }

    private static void filterPattern() {
        System.out.println("\n------Filter Pattern------ ");


        List<Person> persons= new ArrayList<>();
        persons.add(new Person("John","male","single"));

        persons.add(new Person("Rega","female","single"));

        persons.add(new Person("Soap","male","married"));

        persons.add(new Person("Beep","female","married"));

        System.out.println("Male Persons");
        Demo.printPersons(new maleCriteria().meetCriteria(persons));

        System.out.println("Female Persons");
        Demo.printPersons(new femlaCriteria().meetCriteria(persons));

        System.out.println("Single and Male Persons");
        Demo.printPersons(new AndCriteria(new maleCriteria(),new SinglesCriteria()).meetCriteria(persons));
        System.out.println("Single or Female Persons");
        Demo.printPersons(new OrCriteria(new femlaCriteria(),new SinglesCriteria()).meetCriteria(persons));
    }

    private static void statePattern() {
        System.out.println("\n------State Pattern------ ");

        Context context= new Context();

        StartState startState= new StartState();
        startState.doAction(context);

        System.out.println(context.getState());

        StopState stopState= new StopState();
        stopState.doAction(context);

        System.out.println(context.getState());
    }

    private static void iteratorPattern() {
        System.out.println("\n------Iterator Pattern------ ");

        NameRepository nameRepository=new NameRepository();

        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name= (String)iter.next();
            System.out.println("Name: "+name);
        }
    }

    private static void mediatorPattern() {
        System.out.println("\n------Mediator Pattern------ ");
        User robert=new User("Robert");
        User john= new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert");
    }

    private static void decoratorPattern() {
        System.out.println("\n------Decorator Pattern------ ");
        DecoratorPattern.Shape circle= new Circle();
        DecoratorPattern.Shape redCircle= new RedShapeDecorator(new Circle());
        DecoratorPattern.Shape redRectangle= new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\n Circle with Red border");
        redCircle.draw();

        System.out.println("\n Rectangke with Red border");
        redRectangle.draw();
    }

    private static void NullPattern() {
        System.out.println("\n------Null Pattern------ ");
        AbstractCustomer customer1= CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2= CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3= CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4= CustomerFactory.getCustomer("Lauria");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }


    private static void ProxyDesignPattern() {
        System.out.println("\n------Proxy Design Pattern------ ");

        Image image= new ProxyImage("test_10mg.jpg");
        image.display();

        image.display();
    }

    private static void PrototypeDemo() {
        System.out.println("\n------Prototype Design Pattern------ ");

        ShapeCache.loadCache();
        Prototype.Shape clonedShape=(Prototype.Shape) ShapeCache.getShape("1");
        System.out.println("Shape : "+ clonedShape.getType());

        Prototype.Shape clonedShape2=(Prototype.Shape) ShapeCache.getShape("2");
        System.out.println("Shape : "+clonedShape2.getType());

        Prototype.Shape clonedShape3=(Prototype.Shape) ShapeCache.getShape("3");
        System.out.println("Shape : "+clonedShape3.getType());
    }

    private static void SingletonDesignPatternDemo(){
        System.out.println("\n-----Singleton Design Pattern----- ");
        SingletonClass.getInstsnce().className();
    }
    private static void AdapterDesignPatternDemo(){
        System.out.println("\n-----Adapter Design Pattern----- ");
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("avi","mind me.avi");
    }
    private  static void FactoryPatternDemo(){
        System.out.println("\n------Factory Design Pattern------ ");
        ShapeFactory shapeFactory=new ShapeFactory();

        Shape shape1=shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3=shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
    private  static void AbstractFactoryDemo(){
        System.out.println("\n------Abstract Factory Design Pattern------ ");
        AbstractFactory shapeFactory= FactoryProducer.getFactory("SHAPE");

        AbstractFactoryPattern.Shape shape1= shapeFactory.getShape("SQUARE");

        shape1.draw();

        AbstractFactoryPattern.Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        AbstractFactoryPattern.Shape shape3=shapeFactory.getShape("CIRCLE");
        shape3.draw();

        AbstractFactory colorFactory= FactoryProducer.getFactory("color");

        Color color1= colorFactory.getColor("REd");
        color1.fillColor();

        Color color2=colorFactory.getColor("green");
        color2.fillColor();

        Color color3=colorFactory.getColor("blue");
        color3.fillColor();
    }
}
