package hr.bytecode.voices.model

import org.springframework.stereotype.Component

/**
 * Created by mihael.sedmak on 10.12.2016..
 */
class Voices {

    String getVoices(final Integer input) {
        StringBuffer buffer = new StringBuffer()
        buffer.append(input).append(" ")

        if(input>10 && input<20) {
            buffer.append(VoiceOptions.GLASOVA.value)
            return buffer.toString()
        }

        Integer remain = input % 10
        switch (remain) {
            case 0:
                buffer.append(VoiceOptions.GLASOVA.value)
                break
            case 1:
                buffer.append(VoiceOptions.GLAS.value)
                break
            case 2..4:
                buffer.append(VoiceOptions.GLASA.value)
                break
            case 5..9:
                buffer.append(VoiceOptions.GLASOVA.value)
                break
            default:
                break
        }

        return buffer.toString()
    }
}
