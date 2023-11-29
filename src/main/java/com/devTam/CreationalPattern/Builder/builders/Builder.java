package com.devTam.CreationalPattern.Builder.builders;

import com.devTam.CreationalPattern.Builder.cars.CarType;
import com.devTam.CreationalPattern.Builder.component.Engine;
import com.devTam.CreationalPattern.Builder.component.GPSNavigator;
import com.devTam.CreationalPattern.Builder.component.Transmission;
import com.devTam.CreationalPattern.Builder.component.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
