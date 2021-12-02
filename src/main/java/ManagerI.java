import java.util.stream.Stream;

public interface ManagerI extends Comparable<ManagerI> {
    void add(int day, int steps);

    int getStepsToMax(int day);

    int getSumSteps();

    Stream<Integer> getAllAbove(int steps);
}
