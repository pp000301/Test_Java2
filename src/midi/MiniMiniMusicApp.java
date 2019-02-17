package midi;

import javax.sound.midi.*;


public class MiniMiniMusicApp {

    public static void main(String[] args) throws MidiUnavailableException {
        MiniMiniMusicApp mini=new MiniMiniMusicApp();
        mini.play();
    }

    public void play() throws MidiUnavailableException {
        try {
            Sequencer player = MidiSystem.getSequencer();// Получаем синтезатор и открываем его.
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);// Создаем аргументы для конструктора синтезатора

            Track track = seq.createTrack();// Запрашиваем трек у последовательности.

            //Помещаем в трек MIDI события

            ShortMessage a=new ShortMessage();
            a.setMessage(144,1,20,100);
            MidiEvent noteOne= new MidiEvent(a,1);
            track.add(noteOne);

            ShortMessage b=new ShortMessage();
            b.setMessage(128,1,44,100);
            MidiEvent noteOff= new MidiEvent(b,16);
            track.add(noteOff);



            player.setSequence(seq);//Передаем последовательность синтезатору

            player.start();// запуск синтезатора

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
