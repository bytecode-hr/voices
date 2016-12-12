package hr.bytecode.voices.model

/**
 * Created by mihael.sedmak on 10.12.2016..
 */
enum VoiceOptions {

    GLAS ("glas"), GLASA ("glasa"), GLASOVA("glasova")

    final String value

    private VoiceOptions(final String value) {
        this.value = value
    }
}