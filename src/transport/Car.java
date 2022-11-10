package transport;

public class Car {
    private String brand;
    private String model;
    public int engineVolume;
    public String color;
    private int productionYear;
    private String productionCountry;

    public String transmission;
    private String bodyType;
    public int registrationNumber;
    private int numberOfSeats;

    public String winterTires;
    public String summerTires;

    public String getWinterTires() {
        this.winterTires = winterTires;
        return winterTires;
    }

    public void setWinterTires(String winterTires) {
        this.winterTires = winterTires;
    }

    public String getSummerTires() {
        this.summerTires = summerTires;
        return summerTires;
    }

    public void setSummerTires(String summerTires) {
        this.summerTires = summerTires;
    }

    public String getBrand() {
        this.brand = brand;
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        this.model = model;
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineVolume() {
        this.engineVolume = engineVolume;
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        this.color = color;
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        this.productionYear = productionYear;
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getProductionCountry() {
        this.productionCountry = productionCountry;
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public String getTransmission() {


        if (transmission == null || transmission.isEmpty()) {
            this.transmission = transmission;
        } else {
            this.transmission = "Некорректное значение";
        }
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "Некорректное значение";
        }
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getRegistrationNumber() {

        if (registrationNumber < 0) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = Math.abs(registrationNumber);
        }
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {

        if (numberOfSeats < 0) {
            this.numberOfSeats = numberOfSeats;

        } else {
            this.numberOfSeats = Math.abs(numberOfSeats);
        }
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

}

