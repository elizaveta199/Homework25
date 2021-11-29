import java.util.HashMap;
import java.util.Map;


public class ManagerImpl implements Manager {
    private final Map<Integer, Integer> store;

    public ManagerImpl(Map<Integer, Integer> store) {
        this.store = store;
    }

    public void add(int day, int steps) {
        if (store.containsKey(day)) {
            store.put(day, store.get(day) + steps);
        } else {
            store.put(day, steps);
        }
    }

    public int getStepsToMax(int day) {
        int maxSteps = 0;

        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            if (maxSteps < entry.getValue()) {
                maxSteps = entry.getValue() + 1;
            }
        }

        return store.containsKey(day) ? maxSteps - store.get(day) : maxSteps;
    }
}



