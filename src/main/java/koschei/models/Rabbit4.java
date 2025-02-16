package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    private final Duck5 getDuck;

    public Rabbit4(Duck5 getDuck) {
        this.getDuck = getDuck;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + getDuck.toString();
    }
}
