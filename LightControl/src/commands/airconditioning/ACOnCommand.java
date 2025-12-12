package commands.airconditioning;

import beans.AirConditioning;
import commands.Command;

public class ACOnCommand implements Command {
    private final AirConditioning airConditioning;

    public ACOnCommand(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void execute() {
        airConditioning.on();
    }
}
