package org.jointheleague.level7.duck.service;
import org.jointheleague.level7.duck.repository.WeaRepository;
import org.jointheleague.level7.duck.repository.dto.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaService {
    private WeaRepository weaRepository;
    public WeaService (WeaRepository weaRepository){
        this.weaRepository = weaRepository;
    }

    public List<Result> getResults(String query){
        return weaRepository.getResults(query);
    }
}
