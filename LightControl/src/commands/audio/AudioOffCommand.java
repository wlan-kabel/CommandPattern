package commands.audio;

import beans.AudioControl;
import commands.Command;

public class AudioOffCommand implements Command {
    private final AudioControl audioControl;

    public AudioOffCommand(AudioControl audioControl) {
        this.audioControl = audioControl;
    }

    @Override
    public void execute() {
        audioControl.off();
    }
}
