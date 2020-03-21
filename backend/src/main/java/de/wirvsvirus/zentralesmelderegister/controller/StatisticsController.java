package de.wirvsvirus.zentralesmelderegister.controller;

import de.wirvsvirus.zentralesmelderegister.model.CountByAge;
import de.wirvsvirus.zentralesmelderegister.model.CountByDay;
import de.wirvsvirus.zentralesmelderegister.model.CountByState;
import de.wirvsvirus.zentralesmelderegister.service.StatisticsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("v1")
@Slf4j
public class StatisticsController {

    private final StatisticsService statisticsService;

    @GetMapping("/statistic/growth-trend")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CountByDay> getGrowthByDay() {
        return statisticsService.getGrowthByDate();
    }

    @GetMapping("/statistic/absolute-trend")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CountByDay> getCountByDay() {
        return statisticsService.getCountByDate();
    }

    @GetMapping("/statistic/age-absolute")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CountByAge> getCountByAge() {
        return statisticsService.getCountByAge();
    }

    @GetMapping("/statistic/state-now")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CountByState> getCountByStateNow() {
        return statisticsService.getCountByStateNow();
    }

    @GetMapping("/statistic/growth-by-state-today")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CountByState> getGrowthByStateToday() {
        return statisticsService.getGrowthByStateToday();
    }

}