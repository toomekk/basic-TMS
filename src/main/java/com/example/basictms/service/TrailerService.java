package com.example.basictms.service;

import com.example.basictms.repository.OrderRepository;
import com.example.basictms.repository.TrailerRepository;
import com.example.basictms.request.TrailerRequest;
import org.springframework.stereotype.Service;

@Service
public class TrailerService {
    private TrailerRepository trailerRepository;

    public TrailerService(TrailerRepository trailerRepository) {
        this.trailerRepository = trailerRepository;
    }
    public void addTrailer(TrailerRequest trailerRequest){

        Trailer trailer = new Trailer (trailerRequest.getModel(),trailerRequest.getBrand(),trailerRequest.getTrailerWeight());
        trailerRepository.save(trailer);
    }


}
