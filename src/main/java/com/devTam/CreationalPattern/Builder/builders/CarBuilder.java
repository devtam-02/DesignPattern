package com.devTam.CreationalPattern.Builder.builders;
import com.devTam.CreationalPattern.Builder.cars.Car;
import com.devTam.CreationalPattern.Builder.cars.CarType;
import com.devTam.CreationalPattern.Builder.component.Engine;
import com.devTam.CreationalPattern.Builder.component.GPSNavigator;
import com.devTam.CreationalPattern.Builder.component.Transmission;
import com.devTam.CreationalPattern.Builder.component.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
