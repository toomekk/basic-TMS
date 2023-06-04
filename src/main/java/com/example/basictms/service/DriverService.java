package com.example.basictms.service;

import com.example.basictms.entity.Driver;
import com.example.basictms.entity.DrivingLicense;
import com.example.basictms.repository.DriverRepository;
import com.example.basictms.request.DriverRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    private DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository){this.driverRepository = driverRepository;}

    public void addDriver(DriverRequest driverRequest){
        if (driverRequest.getFirstName().isEmpty()){
            throw new IllegalArgumentException("Nie podano danych !");
        }
        List<DrivingLicense> drivingLicense = driverRequest.getLicense();
        System.out.println(driverRequest);
        Driver driver = new Driver(driverRequest.getFirstName(), driverRequest.getLastName(), driverRequest.getSalaryType(),drivingLicense );
        System.out.println(driver);
        driverRepository.save(driver);
    }
}
