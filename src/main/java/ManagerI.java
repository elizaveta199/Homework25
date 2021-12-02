public interface ManagerI extends Comparable<ManagerI> {
    void add(int day, int steps);

    int getStepsToMax(int day);

    int getSumSteps();
}
