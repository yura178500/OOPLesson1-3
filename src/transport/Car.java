package transport;

import javax.xml.crypto.Data;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    public String isSummerTyre;
    private String brand;
    private String model;
    public int engineVolume;
    public String color;
    private int productionYear;
    private String productionCountry;

    public String transmission;
    private String bodyType;
    public String registrationNumber;
    private int numberOfSeats;

    public boolean summerTyre;

    public void setSummerTyre(boolean summerTyre) {
        this.summerTyre = summerTyre;
    }

    public void setSummerTires(String summerTires) {
        this.summerTires = summerTires;
    }

    public String winterTires = "Зимние шины";
    public String summerTires = "Летние шины";


    public static class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public String getRemoteEngineStart() {

            if (remoteEngineStart == null || remoteEngineStart.isEmpty()) {
                this.remoteEngineStart = remoteEngineStart;

            } else {
                this.remoteEngineStart = "Некорректное значение";
            }
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public String getKeylessAccess() {

            if (keylessAccess == null || keylessAccess.isEmpty()) {
                this.keylessAccess = keylessAccess;

            } else {
                this.keylessAccess = "Некорректное значение";
            }
            return keylessAccess;
        }

        public void setKeylessAccess(String keylessAccess) {
            this.keylessAccess = keylessAccess;
        }

        public static class Insurance {
            private int validityPeriod;
            private int cost;
            private int numberInsurance;

            @Override
            public String toString() {
                return "Insurance{"  +
                        "validityPeriod= " + validityPeriod +
                        ", cost= " + cost +
                        ", numberInsurance= "  + numberInsurance +
                        '}';
            }

            public Insurance(int validityPeriod, int cost, int numberInsurance) {

                this.validityPeriod = validityPeriod;
                this.cost = cost;
                this.numberInsurance = numberInsurance;

            }

            public int getValidityPeriod() {

                if (validityPeriod <= 0) {
                    this.validityPeriod = validityPeriod;

                } else {
                    this.validityPeriod = Math.abs(validityPeriod);
                }
                return validityPeriod;

            }

            public void main(String args[]) {
                String numberInsurance = "125445678";
                for (int i = 0; i < numberInsurance.length(); i++) {
                    if (numberInsurance.charAt(i) < '0' || numberInsurance.charAt(i) > '9') {
                        System.out.println("Номер страховки некорректный!");
                        break;
                    }
                }
            }

            public void setValidityPeriod(int validityPeriod) {
                this.validityPeriod = validityPeriod;
            }

            public int getCost() {

                if (cost <= 0) {
                    this.cost = cost;

                } else {
                    this.cost = Math.abs(cost);
                }
                return cost;
            }

            public void setCost(int cost) {
                this.cost = cost;
            }

            public int getNumberInsurance() {

                if (numberInsurance <= 0) {
                    this.numberInsurance = numberInsurance;

                } else {
                    this.numberInsurance = Math.abs(numberInsurance);
                }
                return numberInsurance;
            }

            public void setNumber(int numberInsurance) {
                this.numberInsurance = numberInsurance;
            }

        }
    }


    public Car(String brand, String model, int engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String isSummerTyre) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = String.valueOf(registrationNumber);
        this.numberOfSeats = numberOfSeats;
        this.isSummerTyre = String.valueOf(isSummerTyre());

    }

    public String getWinterTires() {
        this.winterTires = winterTires;
        return winterTires;
    }


    public void setWinterTires(String winterTires) {
        this.winterTires = winterTires;
    }


    public void setSummerTyre() {
        this.summerTyre = summerTyre;
    }

    public void setSummerTires() {
        this.summerTires = summerTires;
    }

    public String getBrand() {

        if (brand == null || brand.isEmpty()) {
            this.brand = brand;
        } else {
        }
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

    public String getRegistrationNumber() {

        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Некорректное значение";
        }
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = String.valueOf(registrationNumber);
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

    public String toString() {
        return "Car { " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", summerTyre='" + isSummerTyre + '\'' + '}';
    }

    public boolean getSummerTire() {

        return getSummerTire();
    }

    public boolean isSummerTyre() {
        boolean summerTyre = Boolean.parseBoolean(winterTires);
        boolean statement2 = Boolean.parseBoolean(summerTires);

        if (summerTyre) {
            System.out.println("winterTires");
        } else if (statement2) {
            System.out.println("summerTires");
        } else {
            System.out.println("Оба высказывания ложные.");
        }

        return summerTyre;
    }

    public void registrationNumber(String s) {
    }

    public interface Validator<T> {

        boolean isValid(T t);
    }

    public static class CarStateNumberValidator implements Validator<String> {
        public boolean isValid(String registrationNumber) {
            Pattern registrationNumberPattern = Pattern.compile(
                    "([А-Яа-я])" +
                            "([0-9]){3}" +
                            "([А-Яа-я]){2}" +
                            "[\\s]" +
                            "([0-9]){2}|([0-9]){3}" +
                            "[RUS]"
            );
            Matcher registrationNumberMatcher = registrationNumberPattern.matcher(registrationNumber);
            if (registrationNumberMatcher.matches()) {
                return true;
            } else {
                return false;
            }
        }

    }


}



