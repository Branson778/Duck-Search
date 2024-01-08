package org.jointheleague.level7.duck.service;
import org.jointheleague.level7.duck.repository.WeaRepository;
import org.jointheleague.level7.duck.repository.dto.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaService {
private final WeaRepository weaRepository = new WeaRepository();
    public List<Result> getResults(String query, String $date){
        return weaRepository.getResults(query, $date);
    }
}
