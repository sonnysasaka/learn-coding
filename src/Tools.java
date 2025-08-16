import java.util.Scanner;
import javax.sound.midi.Sequence;
import javax.sound.midi.Track;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.Sequencer;
import javax.sound.midi.MidiSystem;

public class Tools {
    public static Scanner scanner = new Scanner(System.in);

    public static void ring() {
        Sequencer sequencer = null;
        try {
            // Create a new MIDI sequence with 1 track, timing resolution = 480 ticks per
            // beat
            Sequence sequence = new Sequence(Sequence.PPQ, 480);
            Track track = sequence.createTrack();

            // Set instrument to Acoustic Grand Piano (program #0)
            ShortMessage programChange = new ShortMessage();
            programChange.setMessage(ShortMessage.PROGRAM_CHANGE, 0, 0, 0);
            track.add(new MidiEvent(programChange, 0));

            int tick = 0;

            // Line 1
            tick = addNote(track, 59, tick, 480); // lB
            tick = addNote(track, 60, tick, 480); // C
            tick = addNote(track, 62, tick, 480); // D
            tick = addNote(track, 64, tick, 480); // E
            tick = addNote(track, 62, tick, 480); // D
            tick = addNote(track, 60, tick, 480); // C
            tick = addNote(track, 59, tick, 960); // lB2
            tick = addNote(track, 57, tick, 480); // lA
            tick = addNote(track, 59, tick, 480); // lB
            tick = addNote(track, 60, tick, 480); // C
            tick = addNote(track, 62, tick, 480); // D
            tick = addNote(track, 60, tick, 960); // C2
            tick = addNote(track, 59, tick, 960); // lB2

            // Line 2
            tick = addNote(track, 57, tick, 480); // lA
            tick = addNote(track, 59, tick, 480); // lB
            tick = addNote(track, 60, tick, 480); // C
            tick = addNote(track, 62, tick, 480); // D
            tick = addNote(track, 59, tick, 480); // lB
            tick = addNote(track, 60, tick, 480); // C
            tick = addNote(track, 62, tick, 480); // D
            tick = addNote(track, 64, tick, 480); // E
            tick = addNote(track, 62, tick, 480); // D
            tick = addNote(track, 60, tick, 480); // C
            tick = addNote(track, 59, tick, 480); // lB
            tick = addNote(track, 57, tick, 480); // lA
            tick = addNote(track, 59, tick, 960); // lB2
            tick = addNote(track, 55, tick, 960); // lG2

            // Set up and play the sequence
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(sequence);
            sequencer.start();

            // Wait until done
            while (sequencer.isRunning()) {
                Thread.sleep(100);
            }
        } catch (Exception e) {
            throw new RuntimeException("Thread was interrupted during sleep", e);
        } finally {
            if (sequencer != null) {
                sequencer.stop();
                sequencer.close();
            }
        }
    }

    private static int addNote(Track track, int note, int tick, int duration) throws Exception {
        int velocity = 100;
        int channel = 0;

        // Note ON
        ShortMessage on = new ShortMessage();
        on.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
        track.add(new MidiEvent(on, tick));

        // Note OFF
        ShortMessage off = new ShortMessage();
        off.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
        track.add(new MidiEvent(off, tick + duration));

        return tick + duration;
    }
}
