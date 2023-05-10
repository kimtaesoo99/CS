package design.factory;

public class Main {
    public static void main(String[] args) {
        RobotFactory robotFactory = new SuperRobotFactory();
        Robot robot1 = robotFactory.createRobot("super");
        Robot robot2 = robotFactory.createRobot("power");

        System.out.println(robot1 instanceof SuperRobot); //true
        System.out.println(robot2 instanceof PowerRobot); //true

        RobotFactory robotFactory2 = new ModifiedSuperRobotFactory();
        Robot robot3 = robotFactory2.createRobot("design.factory.SuperRobot");
        Robot robot4 = robotFactory2.createRobot("design.factory.PowerRobot");

        System.out.println(robot3 instanceof SuperRobot); //true
        System.out.println(robot4 instanceof PowerRobot); //true
    }
}

