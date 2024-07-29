package br.com.citrinstar.randomPhrases.repository;

import br.com.citrinstar.randomPhrases.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie, Long> {

    @Query("SELECT COUNT(s) FROM Serie s")
    long countSeries();

    Optional<Serie> findById(Long id);
}
