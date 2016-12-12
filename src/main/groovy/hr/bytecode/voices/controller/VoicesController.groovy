package hr.bytecode.voices.controller

import hr.bytecode.voices.service.VoicesService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by mihael.sedmak on 12.12.2016..
 */
@RestController
class VoicesController {

    private VoicesService voicesService

    VoicesController(final VoicesService voicesService) {
        this.voicesService = voicesService
    }

    @RequestMapping(method = RequestMethod.GET, value="/voices/{number}")
    ResponseEntity<String> voices(final @PathVariable Integer number) {

        return ResponseEntity.ok(voicesService.getVoices(number))
    }
}
