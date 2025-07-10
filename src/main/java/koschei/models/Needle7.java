package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    private Deth8 deathless;

    @Autowired
    public void setDeth(Deth8 deathless) {
        this.deathless = deathless;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deathless.toString();
    }
}