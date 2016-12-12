package hr.bytecode.voices.service

import hr.bytecode.voices.model.Voices
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

/**
 * Created by mihael.sedmak on 12.12.2016..
 */
@Service
class VoicesServiceImpl implements VoicesService {

    private final Voices voices = new Voices()

    @Override
    @Cacheable("voice")
    String getVoices(final Integer number) {
        return voices.getVoices(number)
    }
}
