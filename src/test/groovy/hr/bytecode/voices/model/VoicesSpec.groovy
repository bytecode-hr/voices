package hr.bytecode.voices.model

import spock.lang.Specification


/**
 * Created by mihael.sedmak on 12.12.2016..
 */
class VoicesSpec extends Specification {

    def "returns #voiceString given #voiceCount"() {
        given: "voices model exists"
        Voices voices = new Voices()

        expect:
        voiceString == voices.getVoices(voiceCount)

        where:

        voiceCount || voiceString
        1          || "1 glas"
        2          || "2 glasa"
        11         || "11 glasova"
        15         || "15 glasova"
        21         || "21 glas"
        25         || "25 glasova"
    }
}