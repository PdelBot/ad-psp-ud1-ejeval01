package com.salesianostriana.dam.resteval;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlaceController {

    private final PlaceRepository placeRepository;

    @GetMapping("/place")
    public List<Place> getAll (){
        List<Place> result = placeRepository.getAll();
            if (result.isEmpty())
                return placeRepository.
            return result;
    }





}
