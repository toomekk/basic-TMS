package com.example.basictms.service;

import com.example.basictms.entity.Driver;
import com.example.basictms.entity.DrivingLicense;
import com.example.basictms.repository.DriverRepository;
import com.example.basictms.request.DriverRequest;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    private DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository){this.driverRepository = driverRepository;}

    public void addDriver(DriverRequest driverRequest){

        DrivingLicense drivingLicense = DrivingLicense.valueOf(driverRequest.getLicense());
        Driver driver = new Driver(driverRequest.getFirstName(), driverRequest.getLastName(),drivingLicense );
        driverRepository.save(driver);
    }
}
