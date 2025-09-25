package week10.Ex28.Movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> members;

    public Group() {
        this.members = new ArrayList<>();
    }

    public void addToGroup(Movable movable) {
        this.members.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m : members) {
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable m : members) {
            sb.append(m).append("\n");
        }
        return sb.toString();
    }
}