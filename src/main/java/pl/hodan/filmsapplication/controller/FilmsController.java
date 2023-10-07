package pl.hodan.filmsapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.hodan.filmsapplication.model.Film;
import pl.hodan.filmsapplication.service.FilmsService;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmsController {
    private final FilmsService filmsService;

    public FilmsController(FilmsService filmsService) {
        this.filmsService = filmsService;
    }

    @GetMapping
    public List<Film> getFilms() {
        return filmsService.getFilms();
    }

    @PostMapping
    public ResponseEntity<Object> addFilm(@Validated @RequestBody Film film) {
        if (filmsService.addFilm(film))
            return new ResponseEntity<>(HttpStatus.CREATED);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
