package com.example.bikerent;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BikeService {

    private final BikeRepository bikeRepository;

    public BikeService(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    public void add(NewBikeDTO newBike) {
        Bike bike = new Bike(newBike.getId(),
                newBike.getModel(),
                newBike.getSerialNo(),
                newBike.getHourPrice(),
                newBike.getDayPrice());

    }

    public void deleteByID(Long bikeId) {
        bikeRepository.deleteById(bikeId);
    }

    public double rentForHours(Long bikeId, int hours, String borrowerId){
        LocalDateTime dateOfReturn = LocalDateTime.now().plusHours(hours);
        Bike bike = bikeRepository.findById(bikeId)
                .orElseThrow(BikeNotFoundException::new);
        bike.setDateOfReturn(dateOfReturn);
        bike.setBorrowerId(borrowerId);
        return bike.getHourPrice() * hours;
    }


}
