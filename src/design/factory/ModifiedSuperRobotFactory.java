package design.factory;

public class ModifiedSuperRobotFactory extends RobotFactory {

    @Override
    public Robot createRobot(String name) {
        try {
            Class<?> robot = Class.forName(name);
            return (Robot) robot.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
