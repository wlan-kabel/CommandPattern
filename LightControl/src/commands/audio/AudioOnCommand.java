package commands.audio;

import beans.AudioControl;
import commands.Command;

public class AudioOnCommand implements Command {
    private final AudioControl audioControl;

    public AudioOnCommand(AudioControl audioControl) {
        this.audioControl = audioControl;
    }

    @Override
    public void execute() {
        audioControl.on();
    }
}
