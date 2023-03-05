package org.aop.core.controller;

import org.aop.core.model.RentalDto;
import org.aop.core.repo.RentalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RentalController {

    @Autowired
    private RentalRepo repo;

    @GetMapping("/rentals")
    public List<RentalDto> getAll() {
        final var list = repo.findAll();
        return list.stream().map(RentalDto::fromModel).toList();
    }

    @PostMapping(path = "/rentals")
    public RentalDto add(@RequestBody final RentalDto dto) {
        final var rental = dto.toModel();
        final var savedRental = repo.save(rental);
        return RentalDto.fromModel(savedRental);
    }
}
