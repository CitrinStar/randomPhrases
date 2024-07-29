package br.com.citrinstar.randomPhrases.service;

import br.com.citrinstar.randomPhrases.dto.SerieDTO;
import br.com.citrinstar.randomPhrases.model.Serie;
import br.com.citrinstar.randomPhrases.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SerieService {

    @Autowired
    private SerieRepository serieRepository;

    public Long countSeries(){
        return serieRepository.countSeries();
    }

    public SerieDTO getQuote(Long id){
        Optional<Serie> serie = serieRepository.findById(id);
        if(serie.isPresent()){
            Serie s = serie.get();
            return new SerieDTO(
                    s.getId(),
                    s.getTitle(),
                    s.getPoster(),
                    s.getPhrase(),
                    s.getPersonage());
        }
        return null;
    }

}
