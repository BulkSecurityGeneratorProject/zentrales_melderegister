package de.wirvsvirus.zentralesmelderegister.controller;

import de.wirvsvirus.zentralesmelderegister.model.CityDTO;
import de.wirvsvirus.zentralesmelderegister.service.CityService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("v1")
@Slf4j
public class CityController {

    private final CityService cityService;


    @GetMapping("/city/{city-id}")
    public CityDTO getCity(@PathVariable("city-id") long cityId) {
        log.debug("request to get a city with id " + cityId);
        return this.cityService.getCityDTO(cityId);
    }

    @PostMapping("/city")
    public CityDTO createCity(@RequestBody CityDTO cityDTO) {
        log.debug("request to create a city: " + cityDTO.toString());
        return this.cityService.createCityDTO(cityDTO);
    }

    @PutMapping("/city")
    public void updateCity(@RequestBody CityDTO cityDTO) {
        log.debug("request to update a city: " + cityDTO.toString());
        this.cityService.updateCity(cityDTO);
    }


    @DeleteMapping("/city/{city-id}")
    public void deleteCity(@PathVariable("city-id") long cityId) {
        log.debug("request to delete a city with id " + cityId);
        this.cityService.deleteCityDTO(cityId);
    }

    @GetMapping("/city")
    public List<CityDTO> getAllCities() {
        log.debug("request to get all cities");
        return this.cityService.getAllCities();
    }

    @GetMapping("/city/country/{country-id}")
    public List<CityDTO> getAllByCountryId(@PathVariable("country-id") long countryId) {
        log.debug("request to get all cities by country id: " + countryId);
        return this.cityService.getAllCitiesByCountryId(countryId);
    }

    @GetMapping("/city/user")
    public List<CityDTO> getAllCitiesByUser() {
        log.debug("request to get all cities by user");
        return this.cityService.getAllCitiesByUser();
    }
}
