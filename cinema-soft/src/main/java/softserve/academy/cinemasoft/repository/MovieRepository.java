package softserve.academy.cinemasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softserve.academy.cinemasoft.model.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
