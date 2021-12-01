import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StepBattle {

    private final List<Manager> members;

    public StepBattle(List<Manager> members) {
        this.members = members;
    }

    public void addSteps(int player, int day, int steps) {
        this.members.get(player).add(day, steps);
    }

    public int winner() {
        int max = 0;
        int winner = -1;

        for (int i = 0; i < members.size(); i++) {
            int sumSteps = members.get(i).getSumSteps();

            if (max <= sumSteps) {
                max = sumSteps;
                winner = i;
            }
        }

        return winner;
    }
}
