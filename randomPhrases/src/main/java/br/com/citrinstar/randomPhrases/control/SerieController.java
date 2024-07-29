package br.com.citrinstar.randomPhrases.control;

import br.com.citrinstar.randomPhrases.dto.SerieDTO;
import br.com.citrinstar.randomPhrases.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RequestMapping("/series")
@RestController()
public class SerieController {

    @Autowired
    private SerieService service;

    @GetMapping("/frases")
    public SerieDTO getRandomSerieInfo(){
        Random randomGenerator = new Random();
        Long quantityOfSeries = service.countSeries();

        return service.getQuote(randomGenerator.nextLong(quantityOfSeries) + 1);
    }
}
