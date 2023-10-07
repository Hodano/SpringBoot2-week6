package pl.hodan.filmsapplication.service;

import org.springframework.stereotype.Service;
import pl.hodan.filmsapplication.aop.EmailAspect;
import pl.hodan.filmsapplication.model.Film;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmsService {
    private final List<Film> films;

    public FilmsService() {
        films = new ArrayList<>();
        films.add(new Film("Chłopaki nie płaczą", 2001, "Henry"));
        films.add(new Film("Lekko nie bedzie", 2001, "Aromat"));
        films.add(new Film("Być dalej niż dziś", 2001, "Marian"));
    }

    public List<Film> getFilms() {
        return films;
    }

    @EmailAspect
    public boolean addFilm(Film film) {
         return films.add(film);
    }
}
