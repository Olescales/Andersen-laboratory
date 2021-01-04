package lab.andersen.katokoleg.patterns.abstractfactory;

public interface AbstractFactory {
    TV createTV ();
    SoundSystem createSoundSystem();
    AudioSpeakers createAudioSpeakers();
}
