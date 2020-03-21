package de.wirvsvirus.zentralesmelderegister.controller;

import de.wirvsvirus.zentralesmelderegister.model.CountryDTO;
import de.wirvsvirus.zentralesmelderegister.service.CountryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("v1")
@Slf4j
public class CountryController {

    private final CountryService countryService;


    @GetMapping("/country/{country-id}")
    public CountryDTO getCountry(@PathVariable("country-id") long countryId) {
        log.debug("request to get a country with id " + countryId);
        return this.countryService.getCountryDTO(countryId);
    }

    @PostMapping("/country")
    public CountryDTO createCountry(CountryDTO countryDTO) {
        log.debug("request to create a country: " + countryDTO.toString());
        return this.countryService.createCountryDTO(countryDTO);
    }

    @PutMapping("/country")
    public void updateCountry(CountryDTO countryDTO) {
        log.debug("request to update a country: " + countryDTO.toString());
        this.countryService.updateCountry(countryDTO);
    }


    @DeleteMapping("/country/{country-id}")
    public void deleteCountry(@PathVariable("country-id") long countryId) {
        log.debug("request to delete a country with id " + countryId);
        this.countryService.deleteCountryDTO(countryId);
    }

}