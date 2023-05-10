package design.factory;

public class SuperRobotFactory extends RobotFactory {

    @Override
    public Robot createRobot(String name) {
        if (name.equalsIgnoreCase("Super")) {
            return new SuperRobot();
        }
        if (name.equalsIgnoreCase("power")) {
            return new PowerRobot();
        }
        return null;
    }
}
