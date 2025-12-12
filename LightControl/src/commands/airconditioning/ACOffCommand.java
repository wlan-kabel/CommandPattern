package commands.airconditioning;

import beans.AirConditioning;
import commands.Command;

public class ACOffCommand implements Command {
    private final AirConditioning airConditioning;

    public ACOffCommand(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void execute() {
        airConditioning.off();
    }
}
